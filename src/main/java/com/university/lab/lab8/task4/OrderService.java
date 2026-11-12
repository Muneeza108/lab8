/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.university.lab.lab8.task4;

/**
 *
 * @author natas
 */

import java.math.BigDecimal;
import java.util.Objects;

public class OrderService {

    private final VIPDiscount vipDiscount;

    public OrderService(VIPDiscount vipDiscount) {

        this.vipDiscount = Objects.requireNonNull(
                vipDiscount,
                "VIP discount cannot be null"
        );
    }

    public BigDecimal calculateTotal(BigDecimal amount) {

        Objects.requireNonNull(
                amount,
                "Amount cannot be null"
        );

        if (amount.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException(
                    "Amount cannot be negative"
            );
        }

        return vipDiscount.applyDiscount(amount);
    }
}
