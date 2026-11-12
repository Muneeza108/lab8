/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.university.lab.lab8.task1;

/**
 *
 * @author natas
 */
import java.util.List;
import java.util.Objects;

public class ReportManager {

    private final ReportFormatter formatter;
    private final Notifier notifier;

    public ReportManager(ReportFormatter formatter,
                         Notifier notifier) {

        this.formatter = Objects.requireNonNull(
                formatter, "Formatter cannot be null");

        this.notifier = Objects.requireNonNull(
                notifier, "Notifier cannot be null");
    }

    public void generate(List<String> data,
                         boolean sendEmail) {

        Objects.requireNonNull(data, "Data cannot be null");

        String output = formatter.format(data);

        System.out.println(output);

        if (sendEmail) {
            notifier.send("admin@company.com", output);
        }
    }
}

