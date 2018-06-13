package com.github.sellersj;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HelloWorldTest {

    @Test
    public void test() {
        HelloWorld world = new HelloWorld();
        assertEquals("greeting", "Hello World!", world.getGreeting());
    }

}
