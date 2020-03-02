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
public class Pila {

    private Lista listaPila;

    // constructor sin argumentos
    public Pila() {
        listaPila = new Lista("pila");
    }

    public void push(char objeto) {
        listaPila.insertarAlFrente(objeto);
    }

    public Object pop() throws ExcepcionListaVacia {
        return listaPila.eliminarDelFrente();
    }

    public boolean estaVacia() {
        return listaPila.estaVacia();
    }

    public void imprimir() {
        listaPila.imprimir();
    }

    public Object parteSuperiorPila() {
        Object operador = listaPila.parteSuperiorPila();
        return operador;
    }

    public boolean first() {
        return listaPila.first();
    }

    public boolean ultimo() {
        return listaPila.ultimo();
    }

    public boolean anterior() {
        return listaPila.anterior();
    }

    public boolean next() {
        return listaPila.next();
    }

    public Nodo getActual() {
        return listaPila.getActual();
    }
}
