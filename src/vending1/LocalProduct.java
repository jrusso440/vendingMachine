/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vending1;

/**
 *
 * @author JohnRusso
 */
public class LocalProduct extends Product {
    private int quantity;
    
    LocalProduct(String pid, String desc, double p, String it, int c,int q)
    {
        super(pid,desc,p,it,c);
        quantity = q;
    }
    
    public int getQuantity()
    {
        return quantity;
    }
    
    /*to do updateQuantity*/
    public int updateQuantity(int q)
    {
        quantity += q;
        return quantity;
    }
}
