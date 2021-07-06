package org.example.javatest.util;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class DateUtilLeapYearShould {
    /*

     */

    @Test
    public void return_true_when_year_is_divisible_by_400(){

        assertThat(DateUtilShould.isLeapYear(1600),is (true));
        assertThat(DateUtilShould.isLeapYear(2000),is (true));
        assertThat(DateUtilShould.isLeapYear(2400),is (true));

    }
    @Test
    public void return_true_when_year_is_divisible_by_100_but_not_by_400(){

        assertThat(DateUtilShould.isLeapYear(1600),is (false));
        assertThat(DateUtilShould.isLeapYear(2000),is (false));
        assertThat(DateUtilShould.isLeapYear(2400),is ( false));

    }
    @Test
    public void return_true_when_is_not_divisible_by_4(){
        assertThat(DateUtilShould.isLeapYear(2007),is (false));
        assertThat(DateUtilShould.isLeapYear(2018),is (false));
        assertThat(DateUtilShould.isLeapYear(2019),is ( false));

    }
    @Test
    public void return_true_when_is_divisible_by_4_but_not_by_100(){
        assertThat(DateUtilShould.isLeapYear(1996),is (false));
        assertThat(DateUtilShould.isLeapYear(2004),is (false));
        assertThat(DateUtilShould.isLeapYear(2008),is ( false));

    }

}