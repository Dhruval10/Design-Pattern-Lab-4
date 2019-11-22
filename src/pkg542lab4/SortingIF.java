/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg542lab4;

import java.util.List;

/**
 *
 * @author Dhruval
 */

public interface SortingIF{
    
    /**
     *
     * @param items
     * @param sortingApproach
     * @return
     */
    public List<Product>sort(List<Product>items,int sortingApproach );
    
}