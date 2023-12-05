package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }
    public int permutation(int number){
        StringBuilder str = new StringBuilder();
        List<String> list = Arrays.stream(String.valueOf(number)
                        .split(""))
                        .toList();
        while (true){
            number++;
            List<String> list1 = Arrays.stream(String.valueOf(number)
                            .split(""))
                            .toList();
            if (list1.containsAll(list)){
                for (String s : list1) {
                    str.append(s);

                }
                break;
            }

        }
        return Integer.parseInt(str.toString());
    }
}