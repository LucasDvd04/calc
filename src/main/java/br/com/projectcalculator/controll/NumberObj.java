/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.projectcalculator.controll;

/**
 *
 * @author My&Lucas
 */
public class NumberObj {
    
    private String number;

    public NumberObj(String number) {
        this.number = number;
    }
    
   
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return number;
    }

    
    
    
}
