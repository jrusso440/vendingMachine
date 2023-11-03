/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vending1;

/**
 *
 * @author JohnRusso
 */
public class Vending1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CashBox cb = new CashBox("CB123",10,10,10,10);
        cb.printContents();
        System.out.println(cb.getBalance());
        double cbBalance;
        cbBalance=cb.emptyBox(5,5,5, 5);
        System.out.println(cbBalance);
        System.out.println(cb.validateChange(2.25,1.75));
        CashBox tbox;
        tbox=cb.makeChange(2.25, 1.75);
        System.out.print(tbox.getQuarters()+" "+tbox.getDimes()+" "+tbox.getNickels());
        /*int vmid, String ip,CashBox cb,int npr*/
        ProductInventory pinv = new ProductInventory(3);
        pinv.loadProducts();
        VendingMachine vm1 = new VendingMachine(24,"10.10.10.10",tbox,3);
        vm1.addProduct(pinv, 1, 100);
    }
    
}
