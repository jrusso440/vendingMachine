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
        */
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
