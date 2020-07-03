package com.example.test.codecov.module1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by rhazama on 2018/03/09.
 */
public class HelloWorld2Test {

    private HelloWorld2 helloWorld = new HelloWorld2();

    @Test
    public void helloTest() {
        String actual = helloWorld.hello();
        assertEquals("hello", actual);
    }
}
