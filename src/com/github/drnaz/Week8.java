package com.github.drnaz;

import java.util.Arrays;

public class Week8 {

    public static String validate(String[] card, int[] num){
        int i = 0;
        for (String a : card) {
            // EXPRESION REGULAR POR SI HAY MAS DE UN ESPACIO.
            for (String b : a.split("\\s+")) {
                i++;
            }
        }
        int[] res = new int[i];
        try {
            i = 0;
            for (String a : card) {
                for (String b : a.split("\\s+")) {
                    res[i++] = Integer.parseInt(b);
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Hubo un error generando el nuevo arreglo.");
            return "NO VALIDO";
        }

        if(res.length % card.length != 0){
            System.out.println("La carta no es de n x n.");
            return "NO VALIDO";
        }

        // ORGANIZAR num PARA PODER BUSCAR VALORES DENTRO DE EL.
        Arrays.sort(num);

        int b = 0;
        //BUSQUEDA HORIZONTAL
//        System.out.println("Busqueda Horizontal...");
        for (int k = 0; k < res.length; k+=card.length) {
            for (int j = 0+k; j < card.length+k; j++) {
                if(Arrays.binarySearch(num, res[j]) >= 0){
//                    System.out.println("Se encontro en la casilla "+ (j+1) + " el numero "+ res[j]);
                    b++;
                }
            }
            if (b >= card.length) return "VALIDO";
            else b = 0;
//            System.out.println("----------- SIGUIENTE FILA --------------");
        }

        // BUSQUEDA VERTICAL
//        System.out.println("Busqueda Vertical...");
        for (int j = 0; j < card.length; j++) {
            for (int k = 0+j; k < res.length+j; k+=card.length) {
                if(Arrays.binarySearch(num, res[k]) >= 0){
//                    System.out.println("Se encontro en la casilla "+ (k+1) + " el numero "+ res[k]);
                    b++;
                }
            }
            if (b >= card.length) return "VALIDO";
            else b = 0;
//            System.out.println("------------- SIGUIENTE COLUMNA -----------");
        }

        // BUSQUEDA DIAGONAL
//        System.out.println("Busqueda Diagonal...");
        for (int j = 0; j < res.length; j+=card.length) {
            if(Arrays.binarySearch(num, res[j]) >= 0){
//                System.out.println("Se encontro en la casilla "+ (j+1) + " el numero "+ res[j]);
                b++;
            }
            j++;
        }
        if (b >= card.length) return "VALIDO";
        else b = 0;

        for (int j = res.length-card.length; j > 0; j-=card.length) {
            if(Arrays.binarySearch(num, res[j]) >= 0){
//                System.out.println("Se encontro en la casilla "+ (j+1) + " el numero "+ res[j]);
                b++;
            }
            j++;
        }
        if (b >= card.length) return "VALIDO";
        else b = 0;

        return "NO VALIDO";
    }

    public static String calculate(int[] bills, int amount){
        if(bills.length > 0){
            int c;
            Arrays.sort(bills); // LOS ORGANIZO PRIMERO
            for (int i = 0; i < bills.length; i++) {
                c = bills[i];
                for (int j = 0; j < bills.length; j++) {
                    c+=bills[j];
//                    System.out.println(c);
                    if(c > amount) break;
                    else if(c ==amount) return "OK";
                }
            }
        }
        return "NO OK";
    }
}
