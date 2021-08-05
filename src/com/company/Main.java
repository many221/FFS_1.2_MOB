package com.company;

import com.company.Fruit;

public class Main{

    public static void main(String[] args) {
	// write your code here
        Fruit fruitOne = new Fruit ("Apple","Gala","Red",0,1.99f,20 );

        Meat meatOne = new Meat ( "Cow", "Ground Beef",2,5.99f,20,100 );

        System.out.println (fruitOne.checkColor ( "Brown" ));
        System.out.println (meatOne.getPrice ());
        Stand.addInv ( fruitOne );
        Stand.addInv ( meatOne );
        Stand.displayStand ();
    }



}
