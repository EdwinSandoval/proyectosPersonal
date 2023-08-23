package org.example.ejercicio1;

public class Alumno {
    private int id;
    private String cedula;
    private String nombres;
    private String apellidos;
    private String nombreCurso;
    private double nota;
    private int edad;

    public Alumno(int id, String cedula, String nombres, String apellidos, String nombreCurso,double nota, int edad) {
        this.id = id;
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.nombreCurso = nombreCurso;
        this.nota=nota;
        this.edad = edad;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public Alumno() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    public void imprimirDatos() {
        System.out.println("\nID: "+id);
        System.out.println("CEDULA: "+cedula);
        System.out.println("NOMBRES: "+nombres);
        System.out.println("APELLIDOS: "+apellidos);
        System.out.println("NOMBRE DEL CURSO: "+nombreCurso);
        System.out.println("NOTA: "+nota);
        System.out.println("EDAD: "+edad);

    }

    @Override
    public String toString() {
        return "Alumno{" +
                "id=" + id +
                ", cedula='" + cedula + '\'' +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", nombreCurso='" + nombreCurso + '\'' +
                ", nota=" + nota +
                ", edad=" + edad +
                '}';
    }
}
