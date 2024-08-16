/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance;

/**
 *
 * @author ST.EDWARDS
 */
public class Laptop extends Phone {
    String color = "";
    int cost = 0;
    String screen = "";
    
    public Laptop(String br, int yr, String cou, String col, int co, String scr){
        super(br, yr, cou);
        color = col;
        cost = co;
        screen = scr;
    }
    public void show_laptop_details(){
        System.out.println("This is my laptop");
        System.out.println("The color of my laptop is " + color);
        System.out.println("The laptop costs shs" + cost );
        System.out.println("The size of this laptop screen is " + screen);
    }
}
