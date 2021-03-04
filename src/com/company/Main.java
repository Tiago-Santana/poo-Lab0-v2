package com.company;


import static com.company.Size.MEDIUM;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Size beverage = new Size(MEDIUM);
        Size size = MEDIUM;
        System.out.println("Name: " + size.getDescription());
        System.out.println("toString(): " + size.toString());
        System.out.println("Ordem: " + size.ordinal());
        System.out.println("Valor minimo: " + size.getMinValue());
        System.out.println("Valor máximo: " + size.getMaxValue());
        System.out.println("Código: " + size.getCode());
    }
}
