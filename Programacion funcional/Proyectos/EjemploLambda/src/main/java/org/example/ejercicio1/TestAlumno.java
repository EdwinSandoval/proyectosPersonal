package org.example.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class TestAlumno {
    public static void main(String[] args) {
        List<Alumno> listaAlumnos=new ArrayList<>();
        listaAlumnos.add(new Alumno(1,"34343","Joel","Sando","Microservicios",16.0,22));
        listaAlumnos.add(new Alumno(2,"543545","Leo","Sando","Microservicios",11.0,43));
        listaAlumnos.add(new Alumno(3,"4343","Juan","Sando","Microservicios",16.0,54));
        listaAlumnos.add(new Alumno(4,"544","Jhon","Sando","Microservicios",13.0,23));
        listaAlumnos.add(new Alumno(5,"64533","Nela","Sando","Microservicios",15.0,32));
        listaAlumnos.add(new Alumno(6,"787897","Mary","Sando","Microservicios",10.0,43));
        listaAlumnos.add(new Alumno(7, "56565", "Laura", "Gómez", "Bases de datos", 18.5, 20));
        listaAlumnos.add(new Alumno(8, "78787", "Pedro", "Ramírez", "Programación orientada a objetos", 15.7, 24));
        listaAlumnos.add(new Alumno(9, "90909", "María", "López", "Redes de computadoras", 14.2, 18));
        listaAlumnos.add(new Alumno(10, "12121", "Carlos", "García", "Inteligencia artificial", 17.8, 26));
        listaAlumnos.add(new Alumno(11, "45454", "Ana", "Martínez", "Desarrollo web", 19.3, 23));
        System.out.println("lista de alumnos");
        listaAlumnos.stream().forEach(a->a.imprimirDatos());

        System.out.println("alumnos que inician con L o G");
        System.out.println("------------------------------");
        listaAlumnos.stream()
                .filter(a->a.getNombres().charAt(0)=='L' || a.getNombres().charAt(0)=='G')
                .forEach(a->a.imprimirDatos());

        System.out.println("numero de alumnos");
        System.out.println("------------------------------");
        System.out.println(listaAlumnos.stream().count());

        System.out.println("Alumno con menor edad");
        System.out.println("------------------------------");
        System.out.println(listaAlumnos.stream().min((a1,a2)->a1.getEdad()- a2.getEdad()) );
        System.out.println("------------------------------");
        listaAlumnos.stream().filter(a-> a.getNombreCurso().endsWith("s")).forEach(Alumno::imprimirDatos);//endsWith sirve para ver cual termina en dicha letra
        System.out.println("------------------------------");
        listaAlumnos.stream().filter(alumno -> alumno.getNombreCurso().contains("a")).forEach(Alumno::imprimirDatos);//contains para ver si contiene una letra


    }
}
