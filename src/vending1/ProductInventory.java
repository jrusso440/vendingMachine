/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vending1;

/**
 *
 * @author JohnRusso
 */
public class ProductInventory {
    private Product[] Pr;
    private int numberProducts;
    
    ProductInventory(int nItems)
    {
        Pr = new Product[nItems];
        numberProducts = nItems;
    }
    
    public void loadProducts()
    {
        /*to do 11/1
        loop through using nProducts
        ask user for itemNo, description, price, item_type, calories
        create array element by instantiating a product object
                String pid, String desc, double p, String it, int c
        for (int i=0;i<numberProducts;i++)
        {
            
        }
        */
        Pr = new Product[numberProducts];
        /*future code
        for (int i=0;i<numberProducts;i++)
        {
            
        }*/
        Pr[0]= new Product(1,"Chips",1.50,"Snack",200);
        Pr[1] = new Product(2,"Pretzels",1.10,"Snack",150);
        Pr[2] = new Product(3,"Pepsi",2.25,"Drink",200);
    }
    
    public Product findProduct(int pid)
    {
        Product rProd = new Product();
        for (int i = 0;i<numberProducts;i++)
        {
            if (Pr[i].getProductID() == pid)
            {
                rProd = Pr[i];
                break;
            }
        }
        return rProd;
    }
    
    
}
