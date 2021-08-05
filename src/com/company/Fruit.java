package com.company;

public class Fruit extends Product{


    private String color;
    private static String[] flavorTypes = {"Sweet","Sour", "Bitter","Nutty","Tangy"};
    //Index Sweet 0, Sour 1, Bitter 2, Nutty 3, Tangy 4.
    private String flavor;

    public Fruit(String product, String name,String color,int flavIndex, float price, int stock) {
        super ( product, name, price, stock );
        this.color = color;
        this.flavor = flavorTypes[flavIndex];

    }


    void getFlavor(){
        System.out.println (flavor);
    }

     boolean checkColor(String clr){
        if(color == clr){
            return true;
        } else return false;
    }
}
