/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simpleadder;

/**
 * Holds two values and can return their sum
 * @author novac
 */
public class Adder {
    private double num1;
    private double num2;
    
    public Adder(double n1, double n2) {
        num1 = n1;
        num2 = n2;
    }
    
    public double getSum() {
        return num1 + num2;
    }
}
