package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    long[] sales = {8, 15, 13, 16, 17, 20, 19, 21, 7, 14, 12, 18};
    long expectedCommonSalesSum = 180;
    long expectedAverageAmountOfSalesPerMonth = 15;
    int expectedMonthNumberWithMaxSales = 8;
    int expectedMonthNumberWithMinSales = 9;
    int expectedNumberOfMonthsInWhichSalesWereBelowAverage = 5;
    int expectedNumberOfMonthsInWhichSalesWereUpperAverage = 6;


    @Test
    public void commonSalesSum() {
        StatsService statsService = new StatsService();
        long actualCommonSalesSum = statsService.calculateCommonSalesSum(sales);
        System.out.println("Сумма продаж за все периоды: " + actualCommonSalesSum);
        Assertions.assertEquals(expectedCommonSalesSum, actualCommonSalesSum);
    }

    @Test
    public void averageAmountOfSalesPerMonth() {
        StatsService statsService = new StatsService();
        long actualAverageAmountOfSalesPerMonth = statsService.calculateAverageAmountOfSalesPerMonth(sales);
        System.out.println("Средняя сумма продаж в месяц: " + actualAverageAmountOfSalesPerMonth);
        Assertions.assertEquals(expectedAverageAmountOfSalesPerMonth, actualAverageAmountOfSalesPerMonth);
    }

    @Test
    public void monthNumberWithMaxSales() {
        StatsService statsService = new StatsService();
        int actualMonthNumberWithMaxSales = statsService.getMonthNumberWithMaxSales(sales);
        System.out.println("Последний номер месяца с максимальными продажами: " + actualMonthNumberWithMaxSales);
        Assertions.assertEquals(expectedMonthNumberWithMaxSales, actualMonthNumberWithMaxSales);
    }

    @Test
    public void monthNumberWithMinSales() {
        StatsService statsService = new StatsService();
        int actualMonthNumberWithMinSales = statsService.getMonthNumberWithMinSales(sales);
        System.out.println("Последний номер месяца с минимальными продажами: " + actualMonthNumberWithMinSales);
        Assertions.assertEquals(expectedMonthNumberWithMinSales, actualMonthNumberWithMinSales);
    }

    @Test
    public void numberOfMonthsInWhichSalesWereBelowAverage() {
        StatsService statsService = new StatsService();
        int actualNumberOfMonths = statsService.getNumberOfMonthsInWhichSalesWereBelowAverage(sales);
        System.out.println("Количество месяцев, в которых продажи были ниже среднего: " + actualNumberOfMonths);
        Assertions.assertEquals(expectedNumberOfMonthsInWhichSalesWereBelowAverage, actualNumberOfMonths);
    }

    @Test
    public void numberOfMonthsInWhichSalesWereUpperAverage() {
        StatsService statsService = new StatsService();
        int actualNumberOfMonths = statsService.getNumberOfMonthsInWhichSalesWereUpperAverage(sales);
        System.out.println("Количество месяцев, в которых продажи были выше среднего: " + actualNumberOfMonths);
        Assertions.assertEquals(expectedNumberOfMonthsInWhichSalesWereUpperAverage, actualNumberOfMonths);
    }

}
