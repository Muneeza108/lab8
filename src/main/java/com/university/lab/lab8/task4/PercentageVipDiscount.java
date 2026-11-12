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

public class PercentageVipDiscount implements VIPDiscount {

    @Override
    public BigDecimal applyDiscount(BigDecimal amount) {

        BigDecimal discountRate =
                new BigDecimal("0.10");

        BigDecimal discount =
                amount.multiply(discountRate);

        return amount.subtract(discount);
    }
}
