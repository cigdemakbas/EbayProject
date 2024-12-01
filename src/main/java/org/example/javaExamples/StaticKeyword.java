package org.example.javaExamples;

public class StaticKeyword {
    public String name;
    public int age;
    public static String address;

    public static void main(String[] args) {
        StaticKeyword h= new StaticKeyword();
        h.name="John";
        h.age=35;
        address="7 david dr montville nj";
        System.out.println(address);
        System.out.println(h.age);
        System.out.println(h.name);
    }
    /* The static keyword in Java, mainly used for memory management.
    The static keyword in Java is used to share the same variable or method of a given class.
    When a member is declared static, it can be accessed before any objects of its class are
    created, and without reference to any object.
    Static variables belong to class. They do not belong to specific object.

     */

}
