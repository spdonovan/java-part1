package com.exercise1.hellojava;

import java.io.PrintStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, Makers!");
    }
}

class Calculator {
    public static void main(String[] args) {
        double result = 2.5 + 2.89;
        System.out.printf("The result is %s \n", result);
    }
}


class Clock {
    public static void main(String[] args) {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
        System.out.printf("Current time is.....");
        System.out.printf(dateFormat.format(date));
    }
}

class PriceDisplay {
    public static void main(String[] args) {
      String name = "Coffee Machine";
      double price = 15.99;
      try (PrintStream printStream = System.out.printf("The item is a %s the price is %s \n", name, price)) {
        }
    }
}

class App {
    public static void main(String[] args) {
        String name = "Anna";
        String greeting = "Hello";
        String message = " ";

        message = greeting + " " + name;

        System.out.println(message);
    }
}




