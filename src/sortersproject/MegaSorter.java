/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sortersproject;
import sortersproject.strategy.*;
/**
 *
 * @author admin
 */
enum SortStrategy
{
    BubleSort,MergeSort,TreeSort,CountSort;
}
public class MegaSorter {
   private ISorterStrategy strategy;
   
   public void doSort(int[] a)
    {
       this.strategy.sort(a);
       
    }

    public MegaSorter()
    {
        this.strategy=new MergeSort();//default
    }
   
    public void setSortStrategy(SortStrategy strat)
    {
       switch(strat)
       {        
            case BubleSort:
                this.strategy= new BubleSort();
                break;
            case MergeSort:
                this.strategy=new MergeSort();
                break;
            case TreeSort:
                this.strategy=new TreeSort();
            case CountSort:
                this.strategy=new SomeStrangeSort();
            default:
                   this.strategy= new MergeSort();
       }
    }
}
