package com.example.customlistener;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements SumInterface{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AddValueClass addValueClass=new AddValueClass();
        addValueClass.addTwoNumber(5,5,this);
        addValueClass.addThreeNumber(1,7,9,this);

    }

    @Override
    public int addTwoNum(int sum) {
        Log.e("InterfaceSum","Sum of Two number \t"+sum);
        return sum;
    }

    @Override
    public int addThreeNum(int sum) {
        Log.e("InterfaceSum","Sum of Three Number \t"+sum);
        return sum;
    }
}