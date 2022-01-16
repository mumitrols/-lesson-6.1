package ru.netology.stats;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void testSumAllSales() {
        StatsService statService = new StatsService();
        float[] sellings = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        float expected = (float) 180;
        float actual = statService.sumAllSales(sellings);
        assertEquals(expected, actual);
    }
    @Test
    void testMeanSalesAmount() {
        StatsService statService = new StatsService();
        float[] sellings = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        float expected = (float) 15;
        float actual = statService.meanSalesAmount(sellings);
        assertEquals(expected, actual);
    }
    @Test
    void testMonthNumberSalesMax() {
        StatsService statService = new StatsService();
        float[] sellings = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        float expected = (float) 8;
        int actual = statService.monthNumberSalesMax(sellings);
        assertEquals(expected, actual);
    }
    @Test
    void testMonthNumberSalesMin() {
        StatsService statService = new StatsService();
        float[] sellings = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        float expected = (float) 9;
        int actual = statService.monthNumberSalesMin(sellings);
        assertEquals(expected, actual);
    }
    @Test
    void testNumberMonthsBelowAverageSales() {
        StatsService statService = new StatsService();
        float[] sellings = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        float expected = (float) 5;
        int actual = statService.numberMonthsBelowAverageSales(sellings);
        assertEquals(expected, actual);
    }
    @Test
    void testNumberMonthsAboveAverageSales() {
        StatsService statService = new StatsService();
        float[] sellings = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        float expected = (float) 5;
        int actual = statService.numberMonthsBelowAverageSales(sellings);
        assertEquals(expected, actual);
    }
}