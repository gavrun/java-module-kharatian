package com.example.hello;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class HelloAppTest {
    
    @Test
    public void testMessageHello() {
        HelloApp hello = new HelloApp();
        assertEquals("Hello, VSCode!", hello.messageHello("VSCode"));
    }

    @Test
    public void testReadAndMessageHello() {
        String simulateInput = "TestUser\n";
        InputStream origIn = System.in;
        System.setIn(new ByteArrayInputStream(simulateInput.getBytes()));
        HelloApp hello = new HelloApp();
        String result = hello.readAndMessageHello();
        System.setIn(origIn);
        assertEquals("Hello, TestUser!", result);
    }
}
