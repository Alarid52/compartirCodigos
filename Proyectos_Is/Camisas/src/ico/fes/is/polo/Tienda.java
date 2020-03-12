/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.is.polo;

/**
 *
 * @author usuario-13
 */
public class Tienda {

    private Camisa c1;
    private Camisa c2;
    private Camisa c3;

    public Tienda() {
    }

    public Tienda(Camisa c1, Camisa c2, Camisa c3) {
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
    }

    public Camisa getC3() {
        return c3;
    }

    public void setC3(Camisa c3) {
        this.c3 = c3;
    }

    public Camisa getC1() {
        return c1;
    }

    public void setC1(Camisa c1) {
        this.c1 = c1;
    }

    public Camisa getC2() {
        return c2;
    }

    public void setC2(Camisa c2) {
        this.c2 = c2;
    }

    public float calcularTotal() {
        float total = 0;
        int cantidad = c1.getCantidad() + c2.getCantidad() + c3.getCantidad();
        float subTotal = ((float) c1.getCantidad() * c1.getPrecio())
                + ((float) c2.getCantidad() * c2.getPrecio())
                + ((float) c3.getCantidad() * c3.getPrecio());

        if (cantidad <= 2) {
            total = subTotal;
        } else {
            if (cantidad >= 3 && cantidad <= 5) {
                total = subTotal * 0.95f;
            } else {
                if (cantidad >= 6) {
                    total = subTotal * 0.92f;
                }
            }
        }
        return total;
    }
}
