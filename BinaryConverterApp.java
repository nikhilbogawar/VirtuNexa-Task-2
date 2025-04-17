
package com.app;

import javax.swing.*;
import java.awt.event.*;

public class BinaryConverterApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Binary to Decimal Converter");
        JTextField input = new JTextField(20);
        JButton convertButton = new JButton("Convert");
        JLabel resultLabel = new JLabel("Decimal: ");

        convertButton.addActionListener(e -> {
            String binary = input.getText();
            try {
                if (!binary.matches("[01]+")) throw new Exception("Invalid binary number");
                int decimal = Integer.parseInt(binary, 2);
                resultLabel.setText("Decimal: " + decimal);
            } catch (Exception ex) {
                resultLabel.setText("Error: " + ex.getMessage());
            }
        });

        JPanel panel = new JPanel();
        panel.add(input);
        panel.add(convertButton);
        panel.add(resultLabel);

        frame.add(panel);
        frame.setSize(400, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
