package com.example.test.codecov.module1;

import org.junit.Test;

import com.example.test.codecov.module1.HelloWorld;

import static org.junit.Assert.assertEquals;

/**
 * Created by rhazama on 2018/03/09.
 */
public class HelloWorldTest {

    private HelloWorld helloWorld = new HelloWorld();

    @Test
    public void helloTest() {
        String actual = helloWorld.hello();
        assertEquals("hello", actual);
    }
}
