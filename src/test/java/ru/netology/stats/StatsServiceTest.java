package ru.netology.stats;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StatsServiceTest {

    @Test
    void shouldTotalSum() {

        StatsService service = new StatsService();
        int[] values = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.totalSum(values);
        int expected = 180;
        System.out.println(actual);
        assertEquals(expected, actual);
    }

    @Test
    void shouldAVGMonthSum() {
        StatsService service = new StatsService();
        int[] values = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.avgMonthSum(values);
        int expected = 15;
        System.out.println(actual);
        assertEquals(expected, actual);

    }

    @Test
    void shouldMaxSellMonth() {
        StatsService service = new StatsService();
        int[] values = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.maxSellMonth(values);
        int expected = 8;
        System.out.println(actual);
        assertEquals(expected, actual);

    }



    @Test
    void shouldMinSellMonth() {
        StatsService service = new StatsService();
        int[] values = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.minSellMonth(values);
        int expected = 9;
        System.out.println(actual);
        assertEquals(expected, actual);


    }



    @Test
    void shouldMinAvgMonthCount() {
        StatsService service = new StatsService();
        int[] values = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.minAvgMonthCount(values);
        int expected = 5;
        System.out.println(actual);
        assertEquals(expected, actual);


    }

    @Test
    void  shouldMaxAvgMonthCount() {

        StatsService service = new StatsService();
        int[] values = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.maxAvgMonthCount(values);
        int expected = 5;
        System.out.println(actual);
        assertEquals(expected, actual);

    }




}





