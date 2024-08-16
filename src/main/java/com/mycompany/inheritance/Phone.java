/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance;

/**
 *
 * @author ST.EDWARDS
 */
public class Phone {
    String brand = "";
    int year = 0;
    String country = "";
    
    public Phone(String br, int yr, String cou){
        brand = br;
        year = yr;
        country = cou;
    }
    public void Show_phone_details(){
        System.out.println("My phone is " + brand);
        System.out.println("The phone was made in " + year);
        System.out.println("The phone was made in " + country);
    }
    
}
