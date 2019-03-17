package com.sparshi;

import java.util.Scanner;


public class Life_Without_zeros {
    public long remove(long x) {
        long n=0;
        while(x>0){
            long d=x%10;
            x/=10;
            if (d==0){
                continue;
            }
            n=n*10+d;
        }
        long t=0;
        while (n>0){
            long d=n%10;
            t=t*10+d;
            n=n/10;
        }
        return t;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long x=sc.nextLong();
        long y=sc.nextLong();
        long sum=x+y;
        Life_Without_zeros ob=new Life_Without_zeros();
        if (ob.remove(x)+ob.remove(y)==ob.remove(sum)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

    }
}
