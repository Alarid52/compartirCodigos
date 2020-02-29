/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.is;

/**
 *
 * @author usuario-13
 */
public class Aritmetica {
    private int operador;
    private int operandoUno;
    private int operandoDos;
    public static final int SUMA = 1;
    public static final int RESTA = 2;
    public static final int MULT = 3;
    public static final int DIVI = 4;

    public Aritmetica() {
    }

    public Aritmetica(int operador, int operandoUno, int operandoDos) {
        this.operador = operador;
        this.operandoUno = operandoUno;
        this.operandoDos = operandoDos;
    }

    public int getOperandoDos() {
        return operandoDos;
    }

    public void setOperandoDos(int operandoDos) {
        this.operandoDos = operandoDos;
    }

    public int getOperador() {
        return operador;
    }

    public void setOperador(int operador) {
        this.operador = operador;
    }

    public int getOperandoUno() {
        return operandoUno;
    }

    public void setOperandoUno(int operandoUno) {
        this.operandoUno = operandoUno;
    }
    
    public int calcular(){
        int resultado = 0;
        switch (this.operador) {
            case Aritmetica.SUMA:
                resultado = this.operandoUno+this.operandoDos;
                break;
            case Aritmetica.RESTA:
                resultado = this.operandoUno-this.operandoDos;
                break;
            case Aritmetica.MULT:
                resultado = this.operandoUno*this.operandoDos;
                break;
            case Aritmetica.DIVI:
                resultado = this.operandoUno/this.operandoDos;
                break;
            default:
                throw new AssertionError();
        }
        return resultado;
    }
    
    
}
