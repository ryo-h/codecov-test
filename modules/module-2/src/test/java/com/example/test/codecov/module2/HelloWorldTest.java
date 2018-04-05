package com.example.test.codecov.module2;

import org.junit.Test;
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

    @Test
    public void hello2Test() {
        String actual = helloWorld.hello2();
        assertEquals("hello", actual);
    }
}
