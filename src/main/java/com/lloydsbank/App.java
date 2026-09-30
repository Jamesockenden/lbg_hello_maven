package com.lloydsbank;

/**
 * Hello world!
 * Very Simple App
 */
public class App 
{
    
    public static void main( String[] args )
    {
        System.out.println("=- Version 3 Release! -=");
        System.out.println(sayHello());
        String[] names = { "James", "Person B", "Person C", "Person D" };
        for (String name : names) {
           System.out.println(sayHelloToSomeone(name));
        }
        System.out.println(sayGoodbye());
    }

    public static String sayHello(){
        return "Hello User!";
    }

    public static String sayGoodbye(){
        return "Goodbye User!";
    }

    public static String sayHelloToSomeone(String name){
        return "Hello " + name ;
    }
}

