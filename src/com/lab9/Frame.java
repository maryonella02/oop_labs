package com.lab9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame {

    Frame() {
        JFrame f = new JFrame("Division Calculator");


        JLabel label1 = new JLabel();
        label1.setText("First number :");
        label1.setBounds(20, 10, 100, 100);

        JTextField field1 = new JTextField();
        field1.setBounds(130, 40, 130, 30);

        JLabel label1Error = new JLabel();
        label1Error.setBounds(30, 70, 340, 30);
        label1Error.setForeground (Color.red);


        JLabel label2 = new JLabel();
        label2.setText("Second number :");
        label2.setBounds(20, 100, 100, 100);


        JTextField field2 = new JTextField();
        field2.setBounds(130, 130, 130, 30);

        JLabel label2Error = new JLabel();
        label2Error.setBounds(30, 160, 340, 30);
        label2Error.setForeground (Color.red);


        JLabel resultLabel = new JLabel();
        resultLabel.setBounds(190, 210, 120, 40);

        JButton btn = new JButton("=");
        btn.setBounds(130, 210, 50, 40);

        f.add(label1);
        f.add(field1);
        f.add(label1Error);
        f.add(label2);
        f.add(field2);
        f.add(label2Error);
        f.add(resultLabel);
        f.add(btn);
        f.setSize(400, 330);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {

                label1Error.setText("");
                label2Error.setText("");
                resultLabel.setText("");

                String firstInput = field1.getText();
                String secondInput = field2.getText();

                ParsedField field1 = Frame.analyzeFirstField(firstInput);
                ParsedField field2 = Frame.analyzeSecondField(secondInput);

                boolean failed = false;

                if (!field1.success) {
                    label1Error.setText(field1.errorText);
                    failed = true;
                }

                if (!field2.success) {
                    label2Error.setText(field2.errorText);
                    failed = true;
                }

                if (failed) {
                    return;
                }

                double value1 = field1.value;
                double value2 = field2.value;

                double result = value1 / value2;

                resultLabel.setText(String.valueOf(result));

            }
        });
    }

    public static ParsedField analyzeFirstField(String input) {

        double value1;
        if (input.equals("")) {
            return new ParsedField(false, "Invalid input type!");
        }

        try {
            value1 = Double.parseDouble(input);
            return new ParsedField(true, "", value1);
        } catch (NumberFormatException e) {
            return new ParsedField(false, "Can't read the given format!");
        }


    }

    public static ParsedField analyzeSecondField(String input) {

        double value;

        if (input.equals("")) {
            return new ParsedField(false, "Invalid input type!");
        }

        try {
            value = Double.parseDouble(input);
            if (value == 0) {
                return new ParsedField(false, "Can't divide by zero!");
            }
            if (value == 13) {
                try {
                    throw new UnluckyException("Change the input value or you will have 7 years of bad luck. ");
                } catch (UnluckyException unluckyException) {
                    return new ParsedField(false, unluckyException.getLocalizedMessage());

                }
            }
            return new ParsedField(true, "", value);

        } catch (NumberFormatException e) {
            return new ParsedField(false, "Can't read the given format!");
        }
    }
}

class ParsedField {
    public boolean success;
    public String errorText;
    public double value;

    public ParsedField(boolean success, String text, double value) {
        this.success = success;
        this.errorText = text;
        this.value = value;
    }

    public ParsedField(boolean success, String text) {
        this.success = success;
        this.errorText = text;
    }
}
