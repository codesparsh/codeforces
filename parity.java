package com.sparshi;

import java.util.Scanner;

public class parity {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int b=sc.nextInt();
        int k=sc.nextInt();
        int sum=0;
        int arr[]= new int[k];
        for (int i=0;i<k;i++) {
            arr[i]=sc.nextInt();
            if(i==k-1) {
                break;
            }
            sum+=arr[i];
        }
        if(((sum*b)+arr[k-1])%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}
