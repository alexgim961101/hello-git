package com.example.create_project_practice;

public class Hello {
    public static void main(String[] args) {
        print("hello world");

        PrintBye printBye = new PrintBye();
        printBye.printBye();
        System.out.println(1 + 1);
    }

    public static void print(String str) {
        System.out.println(str);
    }
}
