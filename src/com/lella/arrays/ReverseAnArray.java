package com.lella.arrays;

public class ReverseAnArray {

    public int [] temporaryArray(int[] arr){

        int [] temp = new int[arr.length];
        int j=0;
        for(int i=arr.length-1;i>=0;i--){
            temp [j] = arr[i];
            j++;
        }
        return temp;
    }
    public int[] usingWhileLoop(int [] arr){
      // int[] arr ={1,2,3,4,5};
        int low =0,high=arr.length-1,temp;
        while (low<high){
            temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
        low++;
        high--;
        }

        return arr;
    }
    public static void main(String[] args) {

       ReverseAnArray r = new ReverseAnArray();
        int[] arr ={1,2,3,4,5};
        int[] tempArray = r.temporaryArray(arr);
        System.out.println("Printing reverse of an array using temporary Array");
        for(int i=0;i<tempArray.length;i++){
            System.out.println(tempArray[i]);
        }
        System.out.println("Printing reverse of an array using WHILE LOOP");
        int[] revArray = r.usingWhileLoop(arr);
        for(int i=0;i<revArray.length;i++){
            System.out.println(revArray[i]);
        }

    }

}
