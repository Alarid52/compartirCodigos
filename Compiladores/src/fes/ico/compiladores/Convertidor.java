/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.ico.compiladores;

import java.util.Scanner;

/**
 *
 * @author Abraham
 */
public class Convertidor {

    public static void main(String[] args) {

        System.out.println("Escribe una expresión infija: ");
        Scanner scan = new Scanner(System.in);
        String texto = scan.nextLine();
        StringBuffer prefijo = new StringBuffer(texto);
        StringBuffer posfijo = new StringBuffer(texto);

        ConvertidorInfijoAPrefijo pre = new ConvertidorInfijoAPrefijo();
        pre.convertidorInfijoAPrefijo(prefijo);
        System.out.println("Expresión prefija: " + pre.prefijo.toString());

        ConvertidorInfijoAPosfijo pos = new ConvertidorInfijoAPosfijo();
        pos.convertidorInfijoAPosfijo(posfijo);
        System.out.println("Expresión posfija: " + pos.posfijo.toString());

    }
}
