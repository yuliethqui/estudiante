/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.claseestudiante;

/**
 *
 * @author EIT
 */
public class Estudiante {
// Atributos privados
private String nombre;
private int edad;
private double[] calificaciones;

public Estudiante(String nombre, int edad) {
this.nombre = nombre;
this.edad = edad;
this.calificaciones = new double[5]; // Suponemos 5 calificaciones

}

// Getter para el nombre
public String getNombre() {
return nombre;
}
public void setnombre (String nombre){
this. nombre = nombre;
}

public int getedad() {
return edad;
}
// Setter para la edad
public void setEdad(int edad) {
this.edad = edad;
}

// Getter para una calificación específica
public double getCalificacion(int indice) {
return calificaciones[indice];
}

// Setter para una calificación específica
public void setCalificacion(int indice, double calificacion) {
calificaciones[indice] = calificacion;
}
}

