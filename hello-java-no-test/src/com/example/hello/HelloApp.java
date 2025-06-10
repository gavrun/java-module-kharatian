package com.example.hello;

import java.util.Scanner;

public class HelloApp {
    public String messageHello(String name) {
        return "Hello, " + name + "!";
    }

    public String readAndMessageHello() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        scanner.close();
        return messageHello(name);
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        HelloApp hello = new HelloApp();
        //System.out.println(hello.messageHello(null));
        // System.out.println(hello.messageHello("VSCode"));
        System.out.println(hello.readAndMessageHello());
    }
}


// cd .\hello-java-no-test

// javac -d out -cp lib\junit-platform-console-standalone-1.10.2.jar src\com\example\hello\*.java

// java -cp out com.example.hello.HelloApp

// java -jar lib\junit-platform-console-standalone-1.10.2.jar --class-path out --scan-class-path

