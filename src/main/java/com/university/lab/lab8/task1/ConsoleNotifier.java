/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.university.lab.lab8.task1;

/**
 *
 * @author natas
 */
public class ConsoleNotifier implements Notifier {

    @Override
    public void send(String recipient, String message) {
        System.out.println("Email sent to: " + recipient);
        System.out.println("Message: " + message);
    }
}
