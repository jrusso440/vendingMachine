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
         /* todo 
         add 1 to lastIndex if > nProducts, return false
         otherwise findProduct with pid
         if found, add object to array and return true
         otherwise if return object's pid = -1 return false
         */
         Product tempProd=pi.findProduct(pid);
         lpr[0]= new LocalProduct(pid,tempProd.getDesc(),tempProd.getPrice(),
         tempProd.getType(),tempProd.getCalories(),qty);
         return true;
 
}
     /*to do add money to temp cashbox 
     parameters - ndollars, nquarters, ndimes,nnicks
     */
}