package com.generation.animales;

public class Perro extends Animal implements Mascota, Mamiferos{

    private int patas;
    private boolean cola;
    private String raza;

    public Perro(String nombre){
        super(nombre);
    }

    @Override
    public void jugar(){
        System.out.println("Estoy jugando");
    }

    @Override
    public void dormir() {
        System.out.println("zzzzzz");
    }

    @Override
    public void hablar() {
        System.out.println("guaaafff");
    }

    public void ladrar(){
        System.out.println("goff");
    }

    @Override
    public void comer(){
        System.out.println("Comiendo croquetas");
    }
    @Override
    public void respirar(){
        System.out.println("Estoy respirando por la nariz");
    }

    @Override
    public void ingestarLeche() {
        System.out.println("Amamantando...");
    }

    @Override
    public void gestar() {
        System.out.println("Pariendo...");
    }

    @Override
    public void movilidad() {
        System.out.println("Avanzando...");
    }
}
