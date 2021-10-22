package com.generation;

import com.generation.animales.Ave;
import com.generation.animales.Perro;
import com.generation.conductor.ConductorUberBlack;
import com.generation.conductor.UberDriver;

public class Main {

    public static void main(String[] args) {

        UberDriver Joao = new UberDriver();
        ConductorUberBlack Juan = new ConductorUberBlack();

        System.out.println("Uber");
        System.out.println(Juan.calculatePrice(6));

        System.out.println("Uber Black");
        System.out.println(Joao.calculatePrice(6));
        /*

        Ave ave = new Ave("petirrojo");
        Ave ave2 = new Ave();
        //ave.comunicarse();
        //ave.hacerNido();
        //ave.comer();

        System.out.println("------------------------------------------");
        Perro lomito = new Perro("pulgas");
        //lomito.jugar();
        //lomito.comer();
        */



                /*
                * Animal animal = new Animal();
                * animal.comer();
                * animal.hacerNido();*/
    }
}
