package com.sparshi;

import java.util.Scanner;

public class Word {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String s=sc.next();
        int U=0,L=0;
        for(int i=0;i<s.length();i++) {
            if (Character.isUpperCase(s.charAt(i))) U++;
            else L++;

        }
        if(U>L) System.out.println(s.toUpperCase());
        else System.out.println(s.toLowerCase());
    }

    }

