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
public class SortingServiceProxy implements SortingIF {
    private Sort s;
    private SortingIF ss;
    
    public SortingServiceProxy(){
        this.ss=new SortingUtility();
    }
    @Override
   public List<Product>sort(List<Product>items, int sortingApproach){
       /*if(sortingApproach==1)
       {
           s=new BubbleSort();
           s.sort(items);
       }
       else{
               s=new QuickSort();
               s.sort(items);
               }
       s.display(items);
       return items;*/
       
       ss.sort(items,sortingApproach);
       
         if(sortingApproach==1){
           s=new BubbleSort() {};
       }
       else if(sortingApproach==2){
           s=new QuickSort();
       }
       s.display(items);
       return items;
   } 

}