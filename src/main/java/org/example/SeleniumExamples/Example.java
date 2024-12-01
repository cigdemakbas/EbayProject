package org.example.SeleniumExamples;



public class Example {
    int instanceVar; // Instance variable
    static int staticVar; // Static variable

    void method() {
        int localVar = 10; // Local variable
        instanceVar = 20;
        staticVar = 30;

        System.out.println("Local variable: " + localVar);
        System.out.println("Instance variable: " + instanceVar);
        System.out.println("Static variable: " + staticVar);
    }

    public static void main(String[] args) {
        Example obj = new Example();
        obj.method();

        // Accessing static variable from the class itself
        System.out.println("Accessing static variable: " + Example.staticVar);
    }
}