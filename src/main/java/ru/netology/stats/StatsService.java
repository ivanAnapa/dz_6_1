package ru.netology.stats;

public class StatsService {

    public long calculateCommonSalesSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long calculateAverageAmountOfSalesPerMonth(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum / sales.length;
    }

    public int getMonthNumberWithMaxSales(long[] sales) {
        int maxMonthNum = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonthNum]) {
                maxMonthNum = month;
            }
            month++;
        }
        return maxMonthNum + 1;
    }

    public int getMonthNumberWithMinSales(long[] sales) {
        int minMonthNum = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonthNum]) {
                minMonthNum = month;
            }
            month++;
        }
        return minMonthNum + 1;
    }

    public int getNumberOfMonthsInWhichSalesWereBelowAverage(long[] sales, long average) {
        int count = 0;
        for (long sale : sales) {
            if (sale < average) {
                count++;
            }
        }
        return count;
    }

    public int getNumberOfMonthsInWhichSalesWereUpperAverage(long[] sales, long average) {
        int count = 0;
        for (long sale : sales) {
            if (sale > average) {
                count++;
            }
        }
        return count;
    }

}
