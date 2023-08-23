package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class TestExpresionLambda {

    public static void main(String[] args) {
        //forma tradicional
//        for (Integer numero: Arrays.asList(1,32,3,4,4)){
//            System.out.println(numero+" ");
//        }
        //lista usando lambda
       // Arrays.asList(1,2,3,4,5).forEach(num-> System.out.println(num+" "));
        //Arrays.asList(1,2,3,4,5).forEach( System.out::print);
        //filtrar los numeros mayores a 5 y aladirlos a la lista menor
        ArrayList<Integer> mayores=(ArrayList<Integer>) Arrays
                .asList(1,2,3,4,5,6,7,8,9)
                .stream()
                .filter(x -> x>5)
                //pone los elementos que se filtro dentro de una nueva lista
                .collect(Collectors.toList());//igual a : .collect(Collectors.toCollection(()->new ArrayList<Integer>()));

        mayores.forEach(e-> System.out.println(e));



    }
}
