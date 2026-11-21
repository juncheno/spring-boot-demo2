package com.test.example.springbootdemo2.dev.langchain4j.agent.tool.Tool;

import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.openai.OpenAiChatModel;
import dev.langchain4j.service.AiServices;
import dev.langchain4j.service.SystemMessage;

public class WmsAgentDeepSeekDemo {

    interface WmsAssistant {

        @SystemMessage("你是WMS仓库助手，用户问库存相关问题，优先调用库存查询工具，严禁编造数据；查不到就如实告知")
        String chat(String userMsg);
    }

    public static void main(String[] args) {
        // ========== DeepSeek 配置 ==========
        ChatLanguageModel model = OpenAiChatModel.builder()
                .apiKey(System.getenv("DEEPSEEK_API_KEY")) // 从环境变量 DEEPSEEK_API_KEY 读取
                .baseUrl("https://api.deepseek.com/v1") // deepseek兼容地址
                .modelName("deepseek-chat") // deepseek-chat / deepseek-reasoner
                .temperature(0.0)
                .maxRetries(2)
                .build();

        // 绑定工具，生成Agent代理
        WmsAssistant agent = AiServices.builder(WmsAssistant.class)
                .chatLanguageModel(model)
                .tools(new WmsInventoryTool())
                .build();

        // 测试提问，Agent会自动判断是否调用queryInventory工具
        String res1 = agent.chat("SKU001现在库存多少？");
        System.out.println("Agent回答：" + res1);

        String res2 = agent.chat("SKU002能不能出库3000？");
        System.out.println("Agent回答：" + res2);
    }
}
