package com.sparshi;

import java.util.Scanner;

public class Anton_and_Danik {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int A=0,D=0;
        String s=sc.next();
        for (int i=0;i<n;i++){
            if(s.charAt(i)=='A'){
                A++;
            }
            else{
                D++;
            }
        }
        if (A>D){
            System.out.println("Anton");
        }
        else if(D>A){
            System.out.println("Danik");
        }
        else{
            System.out.println("Friendship");
        }
    }
}
