package com.example.customlistener;
//STEP 2 -
public class AddValueClass {
    public void addTwoNumber(int a,int b,SumInterface sumInterface){
       int c= a+b;
        sumInterface.addTwoNum(c) ;
    }
    public void addThreeNumber(int a,int b,int c,SumInterface sumInterface){
        int sum  = a + b + c;
        sumInterface.addThreeNum(sum);
    }
}
