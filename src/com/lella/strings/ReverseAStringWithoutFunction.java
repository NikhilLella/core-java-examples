package com.lella.strings;

public class ReverseAStringWithoutFunction {
    public static void main(String[] args) {
        String s ="naruto",rev = "";
        char c [] = s.toCharArray();
for(int i=c.length-1;i>=0;i--){
rev=rev+c[i];

}
        System.out.println("Reverse of a string "+s+" with out using inbuilt function is "+rev);
    }
}
