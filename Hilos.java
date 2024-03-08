/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.matriz;

/**
 *
 * @author Papubonilla
 */
public class Hilos extends Thread {
    private int[][] matriz;
    private int num;
     
    public Hilos(int[][] matriz, int num) {
        this.matriz = matriz;
        this.num = num;
    }
    
    @Override
    public void run() {
        for (int x = 0; x < matriz.length; x++) {
            for (int i = 0; i < matriz[0].length; i++) {
                matriz[x][i] *= num;
            }
        }
    }
    
}
