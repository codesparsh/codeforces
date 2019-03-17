package com.sparshi;

import java.util.Scanner;

public class Magnets {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        String x=s;
        int c=1;
        for (int i=1;i<n;i++){
            String t=sc.next();
            if (!t.equals(x)){
                c++;
                x=t;
            }
        }
        System.out.println(c);
    }
}
