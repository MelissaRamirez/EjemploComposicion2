/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

//la clase padre tiene ciertos atributos, cuando la clase hijo hereda de la clase padre hereda sus atributos
//los atributos que se encuentran en la clase padre no se encuentran en la clase hijo

public class Zapato {
    private  int numCalzado ;

    public Zapato() {
    }

    public Zapato(int numCalzado) {
        this.numCalzado = numCalzado;
    }

    public int getNumCalzado() {
        return numCalzado;
    }

    public void setNumCalzado(int numCalzado) {
        this.numCalzado = numCalzado;
    }

    @Override
    public String toString() {
        return "Zapato{" + "numCalzado=" + numCalzado + '}';
    }
    
    
}
