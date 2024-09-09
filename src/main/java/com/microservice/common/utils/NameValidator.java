package com.microservice.common.utils;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class NameValidator {

    public String validateName(String stringToValidate) {
        return stringToValidate.toUpperCase();
    }

    public static void main(String[] args) {

        String str = "Helmo";
        String[] array = {"Hello","Mellow","Bellow"};
        List<Integer> integerList = Arrays.asList(1,1,2,3,4,5,2,3,4,5);


        int index = 0;
        for(int printItem : integerList){
            if(index == 2){
                System.out.println(printItem);
            }
            index++;
        }
    }
}
