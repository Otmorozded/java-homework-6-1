package ru.netology.stats;

public class StatsService {

    public int TotalSum(int[] values) {

        int sum = 0;

        for (int value : values) {

            sum = sum + value;

        }
        return sum;

    }

    public int AVGMonthSum(int[] values) {

        int sumSell = 0;
        int numberOfMonth = 0;
        int avgSellInMonth = 0;

        for (int value : values) {
            sumSell = sumSell + value;
            numberOfMonth = numberOfMonth + 1;

            avgSellInMonth = sumSell / numberOfMonth;

        }
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

        int sumSell = 0;//сумма продаж
        int numberOfMonth = 0;//номер месяца
        int avgCountOfMonth = 0;//Кол-во месяцев, в которых продажи были ниже среднего
        int avgSellInMonth = 0;//средняя сумма продаж в месяц

        for (int value : values) {
            sumSell = sumSell + value;
            numberOfMonth = numberOfMonth + 1;

            avgSellInMonth = sumSell / numberOfMonth;
        }

        for (int value : values) {


            if (value < avgSellInMonth) {
                avgCountOfMonth += 1;

            }

        }
        return avgCountOfMonth;
    }

    public int maxAvgMonthCount(int[] values) {

        int sumSell = 0;//сумма продаж
        int numberOfMonth = 0;//номер месяца
        int avgCountOfMonth = 0;//Кол-во месяцев, в которых продажи были ниже среднего
        int avgSellInMonth = 0;//средняя сумма продаж в месяц

        for (int value : values) {
            sumSell = sumSell + value;
            numberOfMonth = numberOfMonth + 1;

            avgSellInMonth = sumSell / numberOfMonth;
        }

        for (int value : values) {


            if (value > avgSellInMonth) {
                avgCountOfMonth += 1;

            }

        }
        return avgCountOfMonth;
    }
}



















