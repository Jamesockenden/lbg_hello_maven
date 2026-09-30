package com.qa;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(sayHello());
        String[] names = { "Alice", "Bob", "Charlie", "Zena" };
        for (String name : names) {
           System.out.println(sayHelloToSomeone(name));
        }
        System.out.println(sayGoodbye());
    }


    public static String sayHello(){
        return "Hello World!";
    }

    public static String sayGoodbye(){
        return "Goodbye World!";
    }

    public static String sayHelloToSomeone(String name){
        return "Hello " + name ;
    }
}
