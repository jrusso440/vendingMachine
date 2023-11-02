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
     }
   
     public boolean addProduct(int pid, int qty)
     {
         /* todo 
         add 1 to lastIndex if > nProducts, return false
         otherwise findProduct with pid
         if found, add object to array and return true
         otherwise if return object's pid = -1 return false
         */
      }
    
   
}