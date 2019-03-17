package com.sparshi;

import java.util.Scanner;

public class Petya_and_Strings {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String n=sc.next();
        String m=sc.next();
        int l=n.compareToIgnoreCase(m);
        if (l>0){
            System.out.println("1");
        }
        else if (l<0){
            System.out.println("-1");
        }
        else{
            System.out.println(l);
        }
    }
}
