package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {

        //Exercise 3

        // Problem 1.
        double bobSalary = 87094.34;
        double garySalary = 192033.67;
        double highestSalary = Math.max(bobSalary, garySalary);

        System.out.println("The highest salary is " + highestSalary + "\n");

        //Problem 2.
        double carPrice = 267767.69;
        double truckPrice = 125000.35;
        double lowestCarPrice = Math.min(carPrice,truckPrice);

        System.out.println("The Lowest priced car is " + lowestCarPrice + "\n");

        //Problem 3.
        double  radius = 7.25;
        double area = Math.PI * Math.pow(radius, 2);

        System.out.println("The area of the circle is " + area + "\n");

        //Problem 4.
        double y = 5.0;
        double box = Math.sqrt(y);

        System.out.println("The square root of the box is: " + box + "\n");

        //Problem 5
        int x1 = 5;
        int x2 = 10;
        int x3 = 85;
        int x4 = 50;

        double distance = Math.sqrt(Math.pow(x1-x3,2) + Math.pow(x2-x4,2));

        System.out.println("The differnce is/distance " + distance + "\n");

        //Problem 6
        double pX = -3.8;
        double positive = Math.abs(pX);

        System.out.println("The absolute positive vaulue of -3.8 is: " + positive + "\n");

        //Problem 7.
        double rand = Math.random();

        System.out.println( "This number will never be the same: " + rand + "\n");

        //Problem 8

        long days = 24;
        long hoursPerDay = 24;
        long minsPerHour = 60;
        long secondsPerMin = 60;
        long millisecondsPerSec = 1000;

        long totalMin = hoursPerDay *  minsPerHour * days;

        long milliSecondsTotal = totalMin * millisecondsPerSec * secondsPerMin;

        System.out.println("There are " + totalMin + " minutes in " + days + " days\n");

        System.out.println("There are " + milliSecondsTotal + " milliseconds in " + days + " days\n");





    }



}




