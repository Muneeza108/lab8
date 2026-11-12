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
import java.util.Objects;

public record BankTransfer(
        String fromAccount,
        String toAccount,
        BigDecimal amount) {

    public BankTransfer {

        Objects.requireNonNull(
                fromAccount,
                "Source account cannot be null"
        );

        Objects.requireNonNull(
                toAccount,
                "Destination account cannot be null"
        );

        Objects.requireNonNull(
                amount,
                "Amount cannot be null"
        );

        if (fromAccount.isBlank()) {
            throw new IllegalArgumentException(
                    "Source account cannot be empty");
        }

        if (toAccount.isBlank()) {
            throw new IllegalArgumentException(
                    "Destination account cannot be empty");
        }

        if (amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException(
                    "Transfer amount must be positive");
        }
    }
}

