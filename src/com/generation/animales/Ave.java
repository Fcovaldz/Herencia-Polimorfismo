package com.generation.animales;

public class Ave extends Animal{
    private int cantidadAlas;
    private int cantidadPatas;
    private boolean vuela;

    public Ave(){
        super();
    }

    public Ave(String nombre){
        super(nombre);
        System.out.println("Constructor hijo");
    }

    public void hacerNido() {
        System.out.println("Mira como me hago mi casa");
    }

    public void ponerHuevo(){
        System.out.println("Mira el tamaño de este huevo");
    }

    @Override
    public void comer(){
        System.out.println("Comiendo alpiste");
    }
    @Override
    public void respirar(){
        System.out.println("Respirando por el pico");
    }
}
