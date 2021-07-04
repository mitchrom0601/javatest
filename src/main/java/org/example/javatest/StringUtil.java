package org.example.javatest;

public class StringUtil {
    public static String repeat(String str, int times) {
    if(times<0){
        throw new IllegalArgumentException("negative times not al lowed");
    }
        String result = "";
        for (int i = 0; i < times; i++) {
            result += str;

        }
        return result;
    }
}


