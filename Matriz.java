/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matriz;

/**
 *
 * @author Papubonilla
 */
public class Matriz {

    public static void main(String[] args) {
        
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        Hilos hilo1 = new Hilos(matrix, 2);
        Hilos hilo2 = new Hilos(matrix, 2);
        
        System.out.println("Matriz Inicial:");
        for (int x = 0; x < matrix.length; x++) {
            for (int i = 0; i < matrix[0].length; i++) {
                System.out.print(matrix[x][i] + " ");
            }
            System.out.println();
        }
        System.out.println();
        
        hilo1.start();
        hilo2.start();
        
        try {
            hilo1.join();
            hilo2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("Matriz multiplicada por 2 hilos:");
        for (int x = 0; x < matrix.length; x++) {
            for (int i = 0; i < matrix[0].length; i++) {
                System.out.print(matrix[x][i] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
