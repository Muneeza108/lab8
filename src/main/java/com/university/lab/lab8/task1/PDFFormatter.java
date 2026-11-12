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

public class PDFFormatter implements ReportFormatter {

    @Override
    public String format(List<String> data) {
        return "Writing PDF: " + String.join(",", data);
    }
}
