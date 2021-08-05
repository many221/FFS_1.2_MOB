package com.company;

public class Meat extends Product {


    private static String[] meatGrade = {"Prime","Choice","Select"};
    //Index Prime 0, Choice 1, Select 2.
    private String grade;
    private int weight;

    public Meat(String product, String name,int gradeIndex ,float price, int weight ,int stock) {
        super ( product, name, price, stock );

        this.grade = meatGrade[gradeIndex];
        this.weight = weight;
    }

    void getGrade(){
        System.out.println (grade);
    }

    int getPricePerPound(int lbs){
       
        int  pLbs = (int) (this.getPrice () * weight);
        
        return pLbs;
    }

//    void purchase(int sold , int weightSold){
//        stock -= sold;
//        stockSold += sold;
//        weight -= weightSold;
//
//    }
}
