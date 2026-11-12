/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.university.lab.lab8.task3;

/**
 *
 * @author natas
 */

public class Task3main {

    public static void main(String[] args) {

        PaymentProcessor processor =
                new PaymentProcessor();

        processor.charge("TXN-1001", 500.00);

        System.out.println("----------------");

        processor.charge("TXN-1002", 1200.00);
    }
}
