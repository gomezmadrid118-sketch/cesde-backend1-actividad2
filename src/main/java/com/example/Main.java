package com.example;

public class Main {
    public static void main(String[] args) {

        // Prueba de la clase Libro
       Libro libro1 = new Libro();
       Libro libro2 = new Libro("Cien Años de Soledad", "Gabriel García Márquez");
       Libro libro3 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 500);

         System.out.println(libro1.toString());
         System.out.println(libro2.toString());
         System.out.println(libro3.toString());

         // Prueba de la clase CuentaBancaria
         CuentaBancaria cuenta1 = new CuentaBancaria("Juan Pérez", 1000.0);
            System.out.println("El saldo de la cuenta es  de " + cuenta1.getSaldo());
            cuenta1.depositar(500.0);
            System.out.println("El saldo de la cuenta es  de " + cuenta1.getSaldo());
            cuenta1.retirar(400);
            System.out.println("El saldo de la cuenta es  de " + cuenta1.getSaldo());

            // Prueba de la clase Estudiante
            Estudiante estudiante1 = new Estudiante();
            Estudiante estudiante2 = new Estudiante("Ana Gómez", 20, 3.5);

            estudiante1.mostrarInformacion();
            estudiante2.mostrarInformacion();
        
            estudiante1.setNombre("Paco");
            estudiante1.setEdad(18);
            estudiante1.setPromedio(2.5);
            estudiante1.mostrarInformacion();
        
    }
}