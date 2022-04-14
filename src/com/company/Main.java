package com.company;

public class Main {

    public static void main(String[] args) {

        Cliente cliente=new Cliente();

        cliente.setCredito(20);
        cliente.setEdad(32);
        cliente.setNombre("Juan");
        cliente.setTelefono(2123456);

        System.out.println("Cliente");
        System.out.println("Edad:"+cliente.getEdad());
        System.out.println("Nombre:"+cliente.getNombre());
        System.out.println("Telefono:"+cliente.getTelefono());
        System.out.println("Credito:"+cliente.getCredito());


        Trabajador trabajador= new Trabajador();
        trabajador.setEdad(42);
        trabajador.setNombre("Luis");
        trabajador.setTelefono(2123456);
        trabajador.setSalario(500);
        System.out.println("Trabajador");
        System.out.println("Edad:"+trabajador.getEdad());
        System.out.println("Nombre:"+trabajador.getNombre());
        System.out.println("Telefono:"+trabajador.getTelefono());
        System.out.println("Salario $:"+trabajador.getSalario());




        // write your code here
    }
}

class Persona{

    private int edad;
    private  String nombre;
    private int telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}

class Cliente extends Persona{

    int credito;

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }




}

class Trabajador extends Persona{

    int salario;

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
                this.salario = salario;
    }


}