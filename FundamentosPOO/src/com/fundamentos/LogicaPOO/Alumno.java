package com.fundamentos.LogicaPOO;

public class Alumno {

  //? Atributos del alumno
  int id;
  String nombre;
  String apellido;
  int edad;
  String carrera;

  //? Constructor
  //? Un constructor es un método especial que se llama cuando se crea un objeto de una clase.
  public Alumno(){
  }
  
  //? Constructor que recibe parámetros
  public Alumno(int id, String nombre, String apellido, int edad, String carrera){
    this.id = id;
    this.nombre = nombre;
    this.apellido = apellido;
    this.edad = edad;
    this.carrera = carrera;
  }

  public void mostrarNombre(String nombre){
        System.out.println("Hola, Soy un alumno, mi nombre es: " + nombre);
  }

  public void saberAprobado(double calificacion){
    if(calificacion >= 6.0){
      System.out.println("Aprobade la materia");
    }
    else{
      System.out.println("No he aprobado");
    }
  }

}
