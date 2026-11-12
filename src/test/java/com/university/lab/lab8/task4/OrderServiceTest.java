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

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderServiceTest {

    @Test
    void calculateTotal_appliesVipDiscount_withoutTouchingDatabase() {

        // ARRANGE
        VIPDiscount discount =
                new PercentageVipDiscount();

        OrderService service =
                new OrderService(discount);

        BigDecimal originalAmount =
                new BigDecimal("100.00");

        // ACT
        BigDecimal actualTotal =
                service.calculateTotal(originalAmount);

        // ASSERT
        BigDecimal expectedTotal =
                new BigDecimal("90.00");

        assertEquals(
                0,
                expectedTotal.compareTo(actualTotal),
                "VIP discount should reduce the total by 10%"
        );
    }
}

