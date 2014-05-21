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
public class SomeStrangeSort implements ISorterStrategy {

    @Override
    public void sort(int[] arr) {
        Item list = new Item(arr[0],1,null);
        for (int i = 1; i< arr.length; i++){
            list.add(arr[i]);
        }
        int i = 0,val = list.getValue(), count = list.getCount(),j;
        while (list.hasNext()){
            j = 0;
            while (j<count){
                arr[i] = val;
                i++; j++;
            }
            list = list.getNext();
            val = list.getValue();
            count = list.getCount();
        }
        j = 0;
        while (j<count){
            arr[i] = val;
            i++; j++;
        }
    }
    
}

class Item {
    private int value;
    private int count;
    private Item next;
    
    public Item (int aValue, int aCount, Item aNext){
        value = aValue;
        count = aCount;
        next = aNext;
    }
    
    public void add (int aValue){
        if (aValue < value) {
            Item tmp = new Item(value,count,next);
            value = aValue;
            count = 1;
            next = tmp;
        } else if (aValue > value){
            if (next != null)
                next.add(aValue);
            else {
                Item tmp = new Item(aValue,1,null);
                next = tmp;
            }
        } else count++;
    }
    
    public int getValue (){
        return value;
    }
    
    public int getCount (){
        return count;
    }
    
    public Item getNext (){
        return next;
    }

    boolean hasNext() {
        return next != null;
    }
}

