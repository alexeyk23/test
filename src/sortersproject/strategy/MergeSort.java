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
public class MergeSort implements ISorterStrategy
{

    @Override
    public void sort(int[] a)
    {
        Merge(a, 0, a.length-1);
    }
    private void Merge(int[] a, int left,int right)
    {
        int mid;
        if (right > left)
      {
        mid = (right + left) / 2;
        Merge(a, left, mid);
        Merge(a, (mid + 1), right);
    
        doMerge(a, left, (mid+1), right);
      }
    }
    private void doMerge(int[] a,int left, int mid, int right)
    {
        int [] temp = new int[a.length*4];
        int i, left_end, n, tmp_pos;
    
        left_end = (mid - 1);
        tmp_pos = left;
        n = (right - left + 1);//сколько всего
    
        while ((left <= left_end) && (mid <= right))
        {
            if (a[left] <= a[mid]) 
                temp[tmp_pos++] = a[left++];
            else
                temp[tmp_pos++] = a[mid++];
        }
    
        while (left <= left_end)
            temp[tmp_pos++] = a[left++];
 
        while (mid <= right)
            temp[tmp_pos++] = a[mid++];
 
        for (i = 0; i < n; i++)
        {
            a[right] = temp[right];
            right--;
        }
    }
    
    
}
