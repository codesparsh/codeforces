package com.sparshi;

import java.util.Scanner;

public class Bear_and_Big_Brother {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int yr=0;
        int a=sc.nextInt();
        int b=sc.nextInt();
        while(a<=b){
            a*=3;
            b*=2;
            yr++;
        }
        System.out.println(yr);
    }
}
