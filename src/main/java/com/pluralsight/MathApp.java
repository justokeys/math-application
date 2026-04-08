package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        double bobSalary = 87094.34;
        double garySalary = 192033.67;
        double highestSalary = Math.max(bobSalary, garySalary);
        double carPrice = 267767.69;
        double truckPrice = 125000.35;
        double highestCarPrice = Math.max(carPrice,truckPrice);

        System.out.println("The highest priced car is " + highestCarPrice + "\n");

        System.out.println("The highest salary is " + highestSalary + "\n");

        double  radius = 7.25;

        double area = Math.PI * Math.sqrt(radius);

        System.out.println("The radius is " + area);

        int x1 = 5;
        int x2 = 10;







    }



}
