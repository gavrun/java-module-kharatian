package com.example.hello;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public String messageHello(String name) 
    {
        return "Hello, " + name + "!";
    }

    public String readAndMessageHello() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        // scanner.close();
        return messageHello(name);
    }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        App hello = new App();
        System.out.println(hello.readAndMessageHello());
    }
}
