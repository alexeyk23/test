/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sortersproject;

import Tree.Tree;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 *
 * @author admin
 */
public class SortersProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] a = new int[10];
        Random rnd= new Random();
      for (int i = 0; i < 10; i++)
        {
            a[i]=rnd.nextInt(100);
        }
      
        System.out.println("Array="+Arrays.toString(a));
        MegaSorter megaSorter = new MegaSorter();
        megaSorter.setSortStrategy(SortStrategy.MergeSort);
        megaSorter.doSort(a);
        System.out.println("MergeSort="+Arrays.toString(a));
        
        megaSorter.setSortStrategy(SortStrategy.BubleSort);
        megaSorter.doSort(a);
        System.out.println("BubleSort="+Arrays.toString(a));
       
        megaSorter.setSortStrategy(SortStrategy.TreeSort);
        megaSorter.doSort(a);
        System.out.println("TreeSort="+Arrays.toString(a));       
        
        megaSorter.setSortStrategy(SortStrategy.CountSort);
        megaSorter.doSort(a);
        System.out.println("CountSort="+Arrays.toString(a));    
         
    }
    
}
