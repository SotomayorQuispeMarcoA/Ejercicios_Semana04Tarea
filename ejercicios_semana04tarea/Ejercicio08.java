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
public class Ejercicio08 {
    
public static void main(String[]args){
           Scanner teclado=new Scanner(System.in);
            int a;
            int b;
            System.out.print("ingrese el primer numero : ");
            a=teclado.nextInt();
            System.out.print("ingrese el segundo numero : ");
            b=teclado.nextInt();
            if(a==b)
            System.out.print("Los numeros ingresados son  iguales");
            if(a>b)
            System.out.print("El numero mayor es : "+a);
            if(b>a)   
            System.out.print("El numero mayor es : "+b);
         
    }
}
