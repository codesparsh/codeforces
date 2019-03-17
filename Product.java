package com.sparshi;
import java.math.BigInteger;
import java.util.*;
public class Product {
    public void main(String[] args){
        Scanner sc= new Scanner(System.in);
        BigInteger big1= new BigInteger(sc.nextInt());
        BigInteger big2= new BigInteger(sc.nextInt());
        BigInteger big3= big1.multiply(big2);
        System.our.println(big3);
    }
}
