package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Stand {

    private  static ArrayList<Product> inventory =new ArrayList <>();


    static void addInv(Product val){
        inventory.add ( val );
    }

    public static void displayStand(){

        for (Product i:
             inventory) {
            System.out.println ( i.getProductType () + " "+ i.getProductName ());
        }
    }
}
