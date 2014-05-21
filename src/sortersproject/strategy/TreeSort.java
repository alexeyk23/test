/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sortersproject.strategy;
import Tree.Tree;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author admin
 */
public class TreeSort implements ISorterStrategy{

    @Override
    public void sort(int[] a)
    {
        Tree tr = new Tree(a[0]);
        for (int i = 1; i < a.length; i++) {
            tr.add(new Tree(a[i]));            
        }
        List<Integer> list = new ArrayList<Integer>();
       tr.toArrayList(list);
        for (int i = 0; i < a.length; i++) 
        {
            a[i]=list.get(i);
        }
    }

       
}
