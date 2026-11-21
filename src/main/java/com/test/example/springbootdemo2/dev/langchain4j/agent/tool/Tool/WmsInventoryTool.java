package com.test.example.springbootdemo2.dev.langchain4j.agent.tool.Tool;

import dev.langchain4j.agent.tool.Tool;

public class WmsInventoryTool {

    /**
     * 给Agent用的工具：查询指定商品编码在仓库的库存数量
     * 描述一定要写清楚，大模型靠这个判断什么时候调用
     */
    @Tool("查询指定商品编码skuCode的仓库库存，返回可用库存、冻结库存")
    public String queryInventory(String skuCode) {
        // 这里后面替换成真实WMS service/db查询
        if ("SKU001".equals(skuCode)) {
            return "SKU001，名称：周转箱，可用库存：1200，冻结库存：200";
        } else if ("SKU002".equals(skuCode)) {
            return "SKU002，名称：快递面单，可用库存：5000";
        }
        return "该SKU不存在";
    }
}
