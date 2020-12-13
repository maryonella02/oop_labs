package com.lab4;

import java.io.*;

import static com.lab4.BalancedExpression.areBracketsBalanced;

public class Main {
    public static void main(String[] args) {
        String thisLine;
        try {

            BufferedReader br = new BufferedReader(new FileReader("D:\\univer\\OOP\\OOP_lab1\\src\\com\\lab4\\three_expressions.txt"));
            //BufferedReader br = new BufferedReader(new FileReader("D:\\univer\\OOP\\OOP_lab1\\src\\com\\lab4\\one_expression.txt"));

            while ((thisLine = br.readLine()) != null) {
                System.out.println(thisLine);
               if(areBracketsBalanced(thisLine))
                   System.out.println("Balanced expression");
               else
                   System.out.println("Not balanced expression");
            }
        } catch(Exception e) {
            e.printStackTrace();
        }

    }
}
