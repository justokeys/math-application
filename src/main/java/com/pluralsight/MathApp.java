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
        double highestCarPrice = Math.max(carPrice,truckPrice);

        System.out.println("The highest priced car is " + highestCarPrice + "\n");

        //Problem 3.
        double  radius = 7.25;
        double area = Math.PI * Math.pow(radius, 2);

        System.out.println("The radius is " + area);

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

        System.out.println("The differnce is/distance " + distance);









    }



}
