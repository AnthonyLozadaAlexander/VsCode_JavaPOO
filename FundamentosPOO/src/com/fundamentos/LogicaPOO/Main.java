package com.fundamentos.LogicaPOO;

public class Main {
  public static void main(String[] args) {
  // int id, String nombre, String apellido, int edad, String carrera
    Alumno alumno1 = new Alumno(); //Creacion de objeto alumno

    Alumno alumno2 = new Alumno(23, "Pepito", "Ramirez", 20, "Ing Sistema"); //Creacion de objeto alumno con parametros.

    alumno2.mostrarNombre(alumno2.nombre);
  }
}
