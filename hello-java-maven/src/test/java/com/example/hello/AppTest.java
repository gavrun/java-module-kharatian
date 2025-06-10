package com.example.hello;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void testMessageHello() {
        App hello = new App();
        assertEquals("Hello, VSCode!", hello.messageHello("VSCode"));
    }

    @Test
    public void testReadAndMessageHello() {
        String simulateInput = "TestUser\n";
        InputStream origIn = System.in;
        System.setIn(new ByteArrayInputStream(simulateInput.getBytes()));
        App hello = new App();
        String result = hello.readAndMessageHello();
        System.setIn(origIn);
        assertEquals("Hello, TestUser!", result);
    }
}
