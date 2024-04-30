/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.claseestudiante;
//Yulieth Natalia Quiroga Alape
/**
 *
 * @author EIT
 */
public class Main {
public static void main(String[] args) {
Estudiante estudiante = new Estudiante("Juan&", 20);
estudiante.setCalificacion(0, 85.0);
estudiante.setCalificacion(1, 92.5);

System.out.println(";Nombre del estudiante:" + estudiante.getNombre());
System.out.println(";Edad del estudiante: " + estudiante.getedad());
System.out.println(";Calificación 1: " + estudiante.getCalificacion(0));
System.out.println(";Calificación 2: " + estudiante.getCalificacion(1));
}
}
