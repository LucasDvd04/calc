/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.projectcalculator.controll;

import java.util.List;

/**
 *
 * @author My&Lucas
 */
public interface Convert {
    public static String Converter(List list){
        int size = list.size();
        int cont = size;
        int index = 0;
        String concat = "";
        while(cont != 0){
            cont--;
            concat = concat+=list.get(index);
            index++;
        }
            return concat;
    
 }
}
