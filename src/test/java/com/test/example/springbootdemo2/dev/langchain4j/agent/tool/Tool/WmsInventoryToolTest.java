package com.test.example.springbootdemo2.dev.langchain4j.agent.tool.Tool;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class WmsInventoryToolTest {

    private final WmsInventoryTool tool = new WmsInventoryTool();

    @Test
    void queryInventoryReturnsAvailableAndFrozenForSku001() {
        String result = tool.queryInventory("SKU001");

        assertTrue(result.contains("周转箱"));
        assertTrue(result.contains("可用库存：1200"));
        assertTrue(result.contains("冻结库存：200"));
    }

    @Test
    void queryInventoryReturnsAvailableForSku002() {
        String result = tool.queryInventory("SKU002");

        assertTrue(result.contains("快递面单"));
        assertTrue(result.contains("可用库存：5000"));
    }

    @Test
    void queryInventoryReturnsNotFoundForUnknownSku() {
        assertEquals("该SKU不存在", tool.queryInventory("SKU999"));
    }
}
