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
public class QuickSort extends Sort {

    
    @Override
   public void sort(List<Product>p){
       quickSort(p,0,p.size()-1);
   }
   private void quickSort(List<Product>p,int first,int last){
       if(first<last){
           int pivIndex=partition(p,first,last);
           quickSort(p,first,pivIndex-1);
           quickSort(p,pivIndex+1,last);
           
       }
   } 
   private int partition(List<Product>p,int first,int last){
       sortMid(p,first,last);
       swap(p,first,(first+last)/2);
       Product pivot=p.get(first);
       int head=first;
       int tail=last;
       while(head<tail){
           while(head<last&&pivot.getID()>=p.get(head).getID()){
               head++;
           }
           while(pivot.getID()<p.get(tail).getID()){
               tail--;
           }
           if(head<tail){
               swap(p,head,tail);
           }
       }
       swap(p,first,tail);
       return tail;
   }
   private void sortMid(List<Product>p,int first,int last){
       int mid=(first+last)/2;
       if(p.get(mid).getID()<p.get(first).getID()){
           swap(p,first,mid);
       }
       if (p.get(last).getID()<p.get(mid).getID()){
           swap(p,mid,last);
       }
       if(p.get(mid).getID()<p.get(first).getID()){
           swap(p,first,mid);
       }
   }
   private void swap(List<Product>p, int index1,int index2){
       Product temp=p.get(index1);
       p.set(index1,p.get(index2));
       p.set(index2,temp);
   }

   
    @Override
   public void display(List<Product>p){
       System.out.println("Using QuickSort to sort the product list");
       System.out.printf("%s%10s%11s\n","Name","ID","Price");
       for(Product item:p){
           System.out.printf("%5s%12s%13.5f",item.getName(),item.getID(),item.getPrice());
           System.out.println();
       }
   }

    
}
