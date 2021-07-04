package org.example.javatest;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringUtilTest {
    @Test
    public void repeat_string_once(){


        Assert.assertEquals("hola",StringUtil.repeat("hola",3));

    }
    @Test
    public void repeat_string_multiple_times(){


        Assert.assertEquals("holaholahola",StringUtil.repeat("hola",3));

    }
    @Test
    public void repeat_string_zero_times(){
        Assert.assertEquals("",StringUtil.repeat("hola",-0));

    }
    @Test(expected = IllegalArgumentException.class)
    public void repeat_negative_times(){
        Assert.assertEquals("",StringUtil.repeat("hola",-1));

    }


}