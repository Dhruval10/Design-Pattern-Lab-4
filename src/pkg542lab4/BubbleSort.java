/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg542lab4;

import java.util.List;


/**
 *
 * @author Mayank
 */
public class BubbleSort extends Sort {

   
    private int ID;
    private String Name;
    private double Price;
    
    public int getID(){
        return this.ID;
    }
    public String getName(){
        return this.Name;
    }
    public double getPrice(){
        return this.Price;
    }
    
    @Override
    public void sort(List<Product>p){
        int n=p.size();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(p.get(j).getID()>p.get(j+1).getID()){
                    Product temp=p.get(j);
                    p.set(j,p.get(j+1));
                    p.set(j+1,temp);
                }
            }
        }
    }
    @Override
   public  void display(List<Product> p){
       System.out.println("Using BubbleSort to sort the product list");
       System.out.printf("%s%12s%11s","ID","Name","Price:\n");
       for(Product item: p)
       {
           System.out.printf("%-2s %10s %12s", item.getID(), item.getName(), item.getPrice() + "\n");
       }
   }

}