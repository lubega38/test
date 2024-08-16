/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inheritance;
import java.util.Scanner;

/**
 *
 * @author ST.EDWARDS
 */
public class Inheritance {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the brand name of your phone: ");
        String my_brand = scan.nextLine();
        System.out.println("Which year was it made? ");
        int my_year = scan.nextInt();
        System.out.println("Which country was it made? ");
        String my_country = scan.next();
        System.out.println("What is the color of your laptop? ");
        String laptop_color = scan.next();
        System.out.println("What is the cost of your laptop? ");
        int laptop_cost= scan.nextInt();
        System.out.println("What is the screen type of your laptop?  ");
        String laptop_screen = scan.next();
        Laptop obj = new Laptop(my_brand, my_year, my_country,laptop_color, laptop_cost, laptop_screen);
        obj.Show_phone_details();
        obj.show_laptop_details();
    }
}
