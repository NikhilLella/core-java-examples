package com.lella.strings;

import java.sql.SQLOutput;

public class ReverseAString {
    public static void main(String[] args) {
        String s= "naruto";
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        System.out.println("The reverse of a String "+s +"is  "+sb);

    }
}
