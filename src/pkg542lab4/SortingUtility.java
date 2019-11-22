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
public class SortingUtility implements SortingIF {
    private Sort s;
    private List<Product>p;
    
    public SortingUtility(){
        
    }
    @Override
   public List<Product>sort(List<Product>items,int sortingApproach){
       this.p=items;
       if(sortingApproach==1){
           bubbleSort(items);
       }else if(sortingApproach==2){
           quickSort(items);
       }
       return items;
   } 
   private void bubbleSort(List<Product>items){
       s=new BubbleSort();
       s.sort(items);
   }
   private void quickSort(List<Product>items){
       s=new QuickSort();
       s.sort(items);
   }
}
