package com.aluracursos.reproductorMusica.principal;

import com.aluracursos.reproductorMusica.modelos.Cancion;
import com.aluracursos.reproductorMusica.modelos.MisFavoritos;
import com.aluracursos.reproductorMusica.modelos.Podcast;

public class Pincipal {
    public static void main(String[] args) {

        // nueva instancia de Canciom
        Cancion miCancion = new Cancion();
        miCancion.setTitulo("Forever");
        miCancion.setCantante("Kiss");

        // nueva instacia de Podcast
        Podcast miPodcast = new Podcast();
        miPodcast.setPresentador("Gabriela Aguilar");
        miPodcast.setTitulo("Cafe.Tech");

        // miCacion
        for (int i = 0; i < 100; i++) {
            miCancion.meGusta();
        }

        for (int i = 0; i < 200; i++) {
            miCancion.reproduce();
        }

        // miPodcast
        for (int i = 0; i < 100; i++) {
            miPodcast.meGusta();
        }

        for (int i = 0; i < 8000; i++) {
            miPodcast.reproduce();
        }

        System.out.println("Canción: " + miCancion.getTitulo() + " del cantante: " + miCancion.getCantante());
        System.out.println("Total de repoducciones: " + miCancion.getTotalDeReproducciones());
        System.out.println("Total de me gusta: " + miCancion.getTotalDeMeGusta());

        // nueva instancia
        MisFavoritos favoritos = new MisFavoritos();
        favoritos.adiciones(miPodcast);
        favoritos.adiciones(miCancion);

    }
}