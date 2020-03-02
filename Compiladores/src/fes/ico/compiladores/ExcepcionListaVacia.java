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
public class ExcepcionListaVacia extends RuntimeException {
    // constructor sin argumentos

    public ExcepcionListaVacia() {
        this("Lista"); // llama al otro constructor de ExcepcionListaVacia
    } // fin del constructor de ExcepcionListaVacia sin argumentos

    // constructor con un argumento
    public ExcepcionListaVacia(String nombre) {
        super(nombre + " esta vacia"); // llama al constructor de la superclase
    } // fin del constructor de ExcepcionListaVacia con un argumento
}
