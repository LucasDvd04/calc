/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.projectcalculator.controll;

/**
 *
 * @author My&Lucas
 */
public interface Operation {
    public static double Operate(double a,double b,String define){
        double result = 0;
        switch(define){
            case "sum":
                result = a+b;
                break;
            case "div":
                result = a/b;
                break;
            case "sub":
                result = a - b;
                break;
            case "mult":
                result = a * b;
                break;
            case "square":
                result = Math.sqrt(a);
                break;
            case "percent":
                result = a/100;
                break;
        }
            return result;
    }
}
