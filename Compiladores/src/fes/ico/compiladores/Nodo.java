/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.ico.compiladores;

/**
 *
 * @author Abraham
 */
class Nodo {

    char datos;
    Nodo siguienteNodo;

    Nodo(char objeto) {
        this(objeto, null);
    }

    Nodo(char objeto, Nodo nodo) {
        datos = objeto;
        siguienteNodo = nodo;
    }

    char obtenerChar() {
        return datos;
    }

    Nodo obtenerSiguiente() {
        return siguienteNodo;
    }
}
