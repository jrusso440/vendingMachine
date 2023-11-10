/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vending1;

/**
 *
 * @author JohnRusso
 */
public class VendingMachine {
    private int vendingMachineID;
    private String ipAddress;
    private CashBox cbox;
    private LocalProduct[] lpr;
    private int nProducts;
    private int lastIndex;
    private CashBox tcbox;
    
    VendingMachine(int vmid, String ip,CashBox cb,int npr)    {
        vendingMachineID = vmid;
        ipAddress = ip;
        cbox = cb;
        nProducts = npr;
        lastIndex = -1;
        lpr = new LocalProduct[nProducts];
        }
   
     public boolean addProduct(ProductInventory pi,int pid, int qty)
     {
         lastIndex++;
         if (lastIndex <= nProducts)
         {
            Product tempProd=pi.findProduct(pid);
            lpr[lastIndex]= new LocalProduct(pid,tempProd.getDesc(),tempProd.getPrice(),
            tempProd.getType(),tempProd.getCalories(),qty);
            return true;
         }
         else
             return false;
     }
     public double depositMoney(CashBox tb)
     {
         tcbox = tb;
         return tcbox.getBalance();
     }
     
    public double findProduct(int pid)
    {
        double pr = -1;
        for (int i = 0;i<lpr.length;i++)
        {
            if (lpr[i].getProductID() == pid)
            {
                pr=lpr[i].getPrice();
                break;
            }
        }
        return pr;
    }
    
     
     public boolean dispenseProduct(int pid)
     {
         
     /*to do method to select product 
     should include check to make sure we can pay for this and
     make change
     1. pass in product id done
     2. get price of product
           do we have the product in our local inventory?
            if not return false if so get price
     3. assuming user insert money check against temp cb balance
        validateChange method
     4. makeChange method
     5. update inventory (to be written inside of product and vendingmachine)
     */
     double prodPrice = findProduct(pid);
     if (prodPrice > 0)
     {
         //check price against what user put in for money
         if (prodPrice >= tcbox.getBalance())
                 {
                     /*can I make change?*/
                     if (cbox.validateChange(tc.balance(), prodPrice))
                     {
                         //make change
                         //call cashbox method to make change - update cashbox and also return a cashbox
                         //update quantity
                         //call update quantity method
                     }
                     else
                         return false;
                 }
         else
             return false;
     }
     else
         return false;
     return true;
    }
}