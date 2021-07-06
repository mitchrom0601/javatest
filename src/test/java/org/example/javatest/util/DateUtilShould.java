package org.example.javatest.util;

import static org.junit.Assert.*;

public class DateUtilShould {
    public static boolean isLeapYear(int year) {
        if((year % 4==0 && year %100 !=0 )|| (year % 400 ==0)){
            return true;


        }else {
            return false;
        }
    }


}