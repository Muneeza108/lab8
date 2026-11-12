/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.university.lab.lab8.task2;

/**
 *
 * @author natas
 */
import java.math.BigDecimal;

public class Task2main {

    public static void main(String[] args) {

        System.out.println("Testing valid transfer:");

        BankTransfer validTransfer = new BankTransfer(
                "ACC101",
                "ACC202",
                new BigDecimal("500.00")
        );

        System.out.println(validTransfer);

        System.out.println("\nTesting negative amount:");

        try {
            BankTransfer invalidTransfer = new BankTransfer(
                    "ACC101",
                    "ACC202",
                    new BigDecimal("-100.00")
            );
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        System.out.println("\nTesting null account:");

        try {
            BankTransfer invalidTransfer = new BankTransfer(
                    null,
                    "ACC202",
                    new BigDecimal("100.00")
            );
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}
