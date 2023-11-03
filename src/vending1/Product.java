/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vending1;

/**
 *
 * @author JohnRusso
 */
public class Product {
    private int productID;
    private String description;
    private double price;
    private String itemType;
    private int calories;

    Product()
    {
        productID = -1;
    }
    Product(String pid, String desc, double p, String it, int c)
    {
        productID = pid;
        description = desc;
        price = p;
        itemType =it;
        calories = c;
    }
    
    public String getDesc()
    {
        return description;
    }
    
    public void setPrice(double p)
    {
        price = p;
    }
    
    public int getProductID()
    {
        return productID;
    }
    /*to do getType and setPrice */
    public String getType()
    {
        return itemType;
    }
}
