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
public class Company {
    private String Name;
    private String Address;
    private SortingIF s;
    private List<Product> p;
    
    public Company(String name, String address){
        this.Name=name;
        this.Address=address;
        this.p=null;
    }
   public Company(String name, String address, List<Product>products){
     this.Name=name;
     this.Address=address;
     this.p=products;
   } 
   public void setProducts(List<Product> p){
       this.p=p;
   }
   public List<Product>getProducts(){
       return this.p;
   }

    public void sortService(SortingIF s, int sortingApproach) {
        this.s = s;
        s.sort(p, sortingApproach);
    }
}