package com.lella.arrays;

public class RotateAnArray {
    public static void main(String...args) {
        int arr[] = {1,2,3,4,5,6};
        int rotateBy = 2;
        int [] rotatedArray = rotateAnArray(arr,rotateBy);
        for(int x :rotatedArray){
            System.out.println(x);
        }
    }
    public static int [] rotateAnArray(int arr[], int rotate){
        //int arr[] = {1,2,3,4,5,6};
        int[] firstReverse = reverseAnArray(arr, rotate, arr.length-arr.length, rotate-1); //2,1,3,4,5,6
        int [] secondReverse = reverseAnArray(firstReverse,arr.length-rotate,rotate,arr.length-1);// 2,1,6,5,4,3
        int [] finalArray = reverseAnArray(secondReverse,0,arr.length-arr.length,arr.length-1); // 3,4,5,6,1,2
        return finalArray;
    }
    public static int [] reverseAnArray(int arr[], int rotate,int start,int end ){
        int temp;
        while(start<end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
           return arr;
    }
}
