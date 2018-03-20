/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Melissa Ramírez R
 */
public class Deportivo extends Zapato{
    private String deporte;

    public Deportivo() {
         super();
    }
    
 
    public Deportivo(String deporte) {
        this.deporte = deporte;
    }

    public Deportivo(String deporte, int numCalzado) {
        super(numCalzado);
        this.deporte = deporte;
    }

    @Override
    public String toString() {
        return super.toString() + "Deportivo{" + "deporte=" + deporte + '}';
    }
    


}
