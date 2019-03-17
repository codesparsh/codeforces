package com.sparshi;

import java.util.Arrays;
import java.util.Scanner;

public class _Tape {
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int m=sc.nextInt();
       int k=sc.nextInt();
       int arr[]=new int[n];
       for (int i=0;i<n;i++){
           arr[i]=sc.nextInt();
       }
        Arrays.sort(arr);
        int check[]=new int[n-1];
        for (int i=0;i<n-1;i++){
            check[i]=arr[i+1]-arr[i]+1;
        }
        Arrays.sort(check);
        int sum=0;
        for (int i=0;i<k;i++){
            sum+=check[i];
        }
        System.out.println(sum);
    }
}
