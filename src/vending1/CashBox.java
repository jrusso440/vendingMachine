/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vending1;

/**
 *
 * @author JohnRusso
 */
public class CashBox {
    private String CashBoxID;
    private double Balance;
    private int nDollars;
    private int nQuarters;
    private int nDimes;
    private int nNickels;
    
    CashBox(String cid, int nd, int nq, int ndi, int nn)
    {
        CashBoxID = cid;
        nDollars = nd;
        nQuarters = nq;
        nDimes = ndi;
        nNickels = nn;
        Balance = nd+((double)nq*.25)+((double)ndi*.10)+((double)nn * .05);
    }
    
    public double loadBox(int d, int q, int di, int nick)
    {
        nDollars +=d;
        nQuarters += q;
        nDimes += di;
        nNickels += nick;
        Balance = d+((double)q*.25)+((double)di*.10)+((double)nick * .05);
        return Balance;
 }
       
        
    public void printContents()
    {
        System.out.println(CashBoxID+" "+nDollars+" dollars "+nQuarters+" quarters "+nDimes + " dimes "+nNickels+" nickels");
    }
    
    public double emptyBox(int d, int q, int di, int nick)
    {
        nDollars -= d;
        nQuarters -=d;
        nDimes -=di;
        nNickels -= nick;
        Balance -= d+((double)q*.25)+((double)di*.1)+((double)nick * .05);
        return Balance;
    }
    public double getBalance()
    {
        return Balance;
    }
    public int getDollars()
    {
        return nDollars;
    }
    
    public int getQuarters()
    {
        return nQuarters;
    }
    
    public int getDimes()
    {
        return nDimes;
    }
    
    public int getNickels()
    {
        return nNickels;
    }
    
    public boolean validateChange(double changeInserted, double cost)
    {
        int q,d,n;
        double diff;
        diff = (changeInserted-cost)*100;
        if (diff < 0)
        {
            return false;
        }
        else
        {
            //do I have enough change to accommodate this
            q = (int) diff/25;
            diff = diff % 25;
            d = (int) diff/10;
            diff = diff % 10;
            n = (int) diff/5;
            if (nQuarters >= q && nDimes >=d && nNickels >=n)
            {
                return true;
            }
            else return false;
        }
    }
    
    public CashBox makeChange(double changeInserted, double cost)
    {
        int q,d,n;
        double diff;
        diff = (changeInserted-cost)*100;

            //do I have enough change to accommodate this
            q = (int) diff/25;
            diff = diff % 25;
            d = (int) diff/10;
            diff = diff % 10;
            n = (int) diff/5;
            CashBox newCB = new CashBox("",0,q,d,n);
            return newCB;
     
        
    }
}
