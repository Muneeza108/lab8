/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.university.lab.lab8.task1;

/**
 *
 * @author natas
 */
import java.util.Arrays;
import java.util.List;

public class Task1main {

    public static void main(String[] args) {

        List<String> data = Arrays.asList(
                "Student",
                "Teacher",
                "Admin"
        );

        Notifier notifier = new ConsoleNotifier();

        ReportFormatter pdfFormatter = new PDFFormatter();

        ReportManager pdfManager =
                new ReportManager(pdfFormatter, notifier);

        pdfManager.generate(data, true);

        System.out.println("----------------");

        ReportFormatter csvFormatter = new CSVFormatter();

        ReportManager csvManager =
                new ReportManager(csvFormatter, notifier);

        csvManager.generate(data, false);
    }
}
