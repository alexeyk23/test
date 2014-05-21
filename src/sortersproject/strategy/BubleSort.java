/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sortersproject.strategy;

/**
 *
 * @author admin
 */
public class BubleSort implements ISorterStrategy{

    @Override
    public void sort(int[] a)
    {
        for (int i = 0; i < a.length-1; i++) 
        {
            for (int j = 0; j <a.length-1-i; j++)
            {
              if (a[j] > a[j+1]) 
              {
                int  sw = a[j];
                a[j]   = a[j+1];
                a[j+1] = sw;
              }
            }
        }
    }
    
    
}
