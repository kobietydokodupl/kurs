﻿package pl.kobietydokodu.koty;

import java.util.Scanner;

import pl.kobietydokodu.koty.domain.Kot;


/**
 * Interfejs aplikacji - klasa, którą można uruchomić dzięki metodzie main(...)
 */
public class Interfejs {

    /**
     * Obiekt typu Scanner do wczytywania wejścia z klawiatury.
     */
    static Scanner inputScanner = new Scanner(System.in);

    /**
     * Metoda main, pozwalająca na uruchomienie klasy jako aplikacji.
     * @param args Argumenty konsoli - nieużywane
     */
    public static void main(String[] args) {
        Kot kot = new Kot();

        System.out.print("Podaj imię Psa: ");
        kot.setImie(getUserInput());

        System.out.print("Podaj, kto jest opiekunem Psa: ");
        kot.setImieOpiekuna(getUserInput());

        System.out.println("Dziękuję, teraz już wiem prawie wszystko o kocie!");
    }

    /**
     * Pomocnicza metoda pozwalająca pobrać jedną linijkę wpisaną przez użytkownika.
     * @return Wczytana linijka.
     */
    public static String getUserInput() {
        return inputScanner.nextLine().trim();
    }

}
