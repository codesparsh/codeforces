package com.sparshi;

import java.util.Scanner;

public class Boy_or_Girl {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int c=0;
        int b=0;
        for(int i=0;i<s.length();i++){
            for (int j=i+1;j<s.length();j++){
                if (s.charAt(i)==s.charAt(j)){
                    b++;
                }
            }
            if (b>0) {
                b = 0;
                continue;
            }
            c++;
        }
        if (c%2==0){
            System.out.println("CHAT WITH HER!");
        }
        else{
            System.out.println("IGNORE HIM!");
        }
    }
}
