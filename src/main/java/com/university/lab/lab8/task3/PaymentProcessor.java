/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.university.lab.lab8.task3;

/**
 *
 * @author natas
 */

public class PaymentProcessor {

    public void charge(String txId, double amount) {

        try {

            System.out.println(
                    "[TraceID: " + txId +
                    "] Processing payment..."
            );

            if (amount <= 0) {
                throw new IllegalArgumentException(
                        "Amount must be positive");
            }

            System.out.println(
                    "[TraceID: " + txId +
                    "] Payment successful: $" + amount
            );

        } finally {

            System.out.println(
                    "[TraceID: " + txId +
                    "] Context Cleared"
            );
        }
    }
}
