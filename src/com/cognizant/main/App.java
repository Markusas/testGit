package com.cognizant.main;

import com.cognizant.bean.Person;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Person person = new Person();
        person.sayHello("Marek");
    }
}
