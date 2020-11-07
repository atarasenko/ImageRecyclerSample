package com.example.myapplication;

import java.util.ArrayList;
import java.util.List;

public class DataTransform {

    public List<Integer> convert(byte[] data){

        List<Integer> output = new ArrayList<>(data.length);
        for (byte b: data){
            output.add(b & 0xFF);
        }

        return output;

    }

}
