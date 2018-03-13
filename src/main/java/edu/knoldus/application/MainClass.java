package edu.knoldus.application;

import edu.knoldus.operation.DateOperations;

public class MainClass {
    public static void main(String[] args) {
        System.out.println(DateOperations.dayOfWeek());
        System.out.println(DateOperations.getTimeByTimeZone("Asia/Dhaka"));
        System.out.println(DateOperations.leapYearsTillDate());
        System.out.println(DateOperations.secondsMahatmaLived());
    }
}
