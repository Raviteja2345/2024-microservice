package com.microservice.common.utils;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Component
public class NameValidator {

    public String validateName(String stringToValidate) {
        return stringToValidate.toUpperCase();
    }

    public static void main(String[] args) {

        String str = "Helmo";
        String[] array = {"Hello","Mellow","Bellow"};
        List<Integer> integerList = Arrays.asList(1,1,2,3,4,5,2,3,4,5);

        for(int i =0 ; i<integerList.size()-1;i++){
           if(Objects.equals(integerList.get(i), integerList.get(i + 1))){
               System.out.println(i);
           }
           i++;
        }
    }
}
