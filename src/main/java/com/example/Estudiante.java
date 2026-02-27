package com.example;

public class Estudiante {
    String nombre;
    int edad;
    double promedio;

    public Estudiante() {
        this.nombre = "Desconocido";
        this.edad = 0;
        this.promedio = 0.0;
    }

    public Estudiante(String nombre, int edad, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public double getPromedio() {
        return promedio;
    }
    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    public boolean ahAprobado() {
        if(promedio >= 3.0) {
            return true;
        } else {
            return false;
        }
    }
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Promedio: " + promedio);
        if (ahAprobado()) {
            System.out.println("El estudiante ha aprobado.");
        } else {
            System.out.println("El estudiante no ha aprobado.");
        }
    }
}
