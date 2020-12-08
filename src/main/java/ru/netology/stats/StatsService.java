package ru.netology.stats;

public class StatsService {

    public int totalSum(int[] values) {

        int sum = 0;

        for (int value : values) {

            sum = sum + value;

        }
        return sum;

    }

    public int avgMonthSum(int[] values) {
        int avgSellInMonth = totalSum(values) / values.length;
        return avgSellInMonth;
    }

    public int maxSellMonth(int[] values) {

        int currentMax = values[0];
        int numberOfMonth = 0;
        int maxSellNumberMonth = 0;

        for (int value : values) {

            numberOfMonth += 1;
            if (currentMax <= value) {
                currentMax = value;
                maxSellNumberMonth = numberOfMonth;

            }
        }
        return maxSellNumberMonth;
    }

    public int minSellMonth(int[] values) {

        int currentMin = values[0];
        int numberOfMonth = 0;
        int minSellNumberMonth = 0;

        for (int value : values) {

            numberOfMonth += 1;
            if (currentMin >= value) {
                currentMin = value;
                minSellNumberMonth = numberOfMonth;

            }
        }
        return minSellNumberMonth;
    }


    public int minAvgMonthCount(int[] values) {
        int avgCountOfMonth = 0;
        int avg = avgMonthSum(values);
        for (int value : values) {
            if (value < avg) {
                avgCountOfMonth += 1;
            }
        }
        return avgCountOfMonth;
    }

    public int maxAvgMonthCount(int[] values) {
        int avgCountOfMonth = 0;
        int avg = avgMonthSum(values);
        for (int value : values) {
            if (value > avg) {
                avgCountOfMonth += 1;
            }
        }
        return avgCountOfMonth;
    }
}



















