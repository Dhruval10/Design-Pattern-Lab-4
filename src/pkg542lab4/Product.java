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
public class Product {
    private final String Name;
    private final int ID;
    private final double Price;
    
    public Product(String Name,int ID, double Price){
        this.Name=Name;
        this.ID=ID;
        this.Price=Price;
    }
    public String getName(){
        return this.Name;
    }
    public int getID(){
        return this.ID;
    }
    public double getPrice(){
        return this.Price;
    }
    @Override
    public String toString(){
        return getName()+" "+getID()+" "+getPrice();
    }
}