/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios_semana04tarea;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Ejercicio04 {
    
 public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int n1;
	int n2;
	System.out.print("Introduce un número: ");
	n1=teclado.nextInt();
	System.out.print("Introduce otro número: ");
	n2=teclado.nextInt();
	if(n1==n2)
            System.out.println("Son iguales");
	else
            System.out.println("No son iguales");
    }
}
