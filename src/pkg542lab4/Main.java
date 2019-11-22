/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg542lab4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Mayank
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Product>items=generateList();
        Company ABC =new Company("ABC","San Marcos",items);
        System.out.println("---------------");
        System.out.println("Original list");
        System.out.println(ABC.getProducts());
        System.out.println("--------------");
        
        System.out.println("Testing Sorting proxy with Quick Sort");
        SortingIF service=new SortingServiceProxy();
        ABC.sortService(service,2);
        
        System.out.println("------------");
        items=generateList();
        ABC.setProducts(items);
        System.out.println("Original list");
        System.out.println(ABC.getProducts());
        System.out.println("---------------");
        System.out.println("Testing Sorting proxy with Bubble Sort");
        ABC.sortService(service,1);
        
        System.out.println("---------------");
        System.out.println("Testing Sorting Utility");
        service=new SortingUtility();
        System.out.println("Original list");
        items=generateList();
        ABC.setProducts(items);
        System.out.println(ABC.getProducts());
        ABC.sortService(service,1);
        System.out.println("Result after sorting");
        System.out.println(ABC.getProducts());
            }
    private static List<Product>generateList(){
        String names="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random r=new Random();
        List<Product>items=new ArrayList();
        int totalNum=10;
        for(int i=0;i<totalNum;i++){
            StringBuilder sb=new StringBuilder();
            sb.append(names.charAt(r.nextInt(names.length())));
            String name=sb.toString();
            int ID=r.nextInt(50);
            double price=0.0+(r.nextDouble()*(100.0-0.0));
            price=(double)Math.round(price*100)/100;
            items.add(new Product(name,ID,price));
        }
        return items;
    }
}