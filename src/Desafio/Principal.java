/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Desafio;

import java.util.ArrayList;

/**
 *
 * @author Phobos
 */
public class Principal {

    public static void main(String[] args) {
        //Crear La Estructura.

        int filas = (int) (Math.random() * 9 + 1);//rows
        int columnas = (int) (Math.random() * 9 + 1);//colums
        //int datos = (int) (Math.random() * 9 + 1);
        System.out.println("Filas: " + filas + " Columnas : " + columnas);
        System.out.println("---------------------------------");
        ArrayList<ArrayList<Integer>> matris = new ArrayList<ArrayList<Integer>>();

        //creo elemento vacio
        //matris.add(new ArrayList<Integer>());
        for (int i = 0; i < filas; i++) {
            //creo elementos vacio
            matris.add(new ArrayList<Integer>());
            for (int j = 0; j < columnas; j++) {
                matris.get(i).add((int) (Math.random() * 9 + 1));
            }
        }

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("[" + matris.get(i).get(j) + "]");

            }
            System.out.println(" ");
        }

        System.out.println("---------------------------------");
        System.out.println("CAMINO");
        System.out.println("---------------------------------");
        //algoritmo
        ArrayList<Integer> vectorCamino = new ArrayList<Integer>();

        
    }//endMain

}
