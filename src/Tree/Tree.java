/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tree;

import java.util.List;

/**
 *
 * @author admin
 */
public class Tree 
{
    Tree left;
    Tree right;
    int key;
    public Tree(int key) 
    {
        this.key=key;        
    }
    public void add(Tree aTree)
    {
       if ( aTree.key < key )
        if ( left != null ) left.add( aTree );
        else left = aTree;
     else
        if ( right != null ) right.add( aTree );
        else right = aTree;
    }
    public void toArrayList(List<Integer> a)
    {
      if(this!=null)
      {
          if(this.left!=null)
              this.left.toArrayList(a);
          a.add(key);  
       if(this.right!=null)
          this.right.toArrayList(a);
      }
    }
}
