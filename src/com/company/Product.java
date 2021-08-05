package com.company;

import java.util.Date;

public class Product {

    private String productType;
    private String productName;
    private int stock;
    private float price;
    private int stockSold;
    private int profit = (int) (stockSold * price);
    private int potentialProfit = (int) (profit * price);
    private boolean isPerishable;

    public float getPrice() {
        return price;
    }

    public String getProductType() {
        return productType;
    }

    public String getProductName() {
        return productName;
    }

    public int getStock() {
        return stock;
    }

    public int getStockSold() {
        return stockSold;
    }

    public int getProfit() {
        return profit;
    }

    public int getPotentialProfit() {
        return potentialProfit;
    }

    public boolean isPerishable() {
        return isPerishable;
    }


    //private Date expDate;


    public Product(String product,String name, float price, int stock){

        this.productName = name;
        this.productType = product;
        this.price = price;
        this.stock = stock;

    }

   public void addStock(int sum){

        stock += sum;
    }

    public void purchase(int sold){

        stock -= sold;
        stockSold += sold;

    }





}
