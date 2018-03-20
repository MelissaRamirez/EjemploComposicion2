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
public class Trabajo extends Zapato {
    private String tipoTrabajo; 

    public Trabajo() {
    }

    public Trabajo(String tipoTrabajo) {
        this.tipoTrabajo = tipoTrabajo;
    }

    public Trabajo(String tipoTrabajo, int numCalzado) {
        super(numCalzado);
        this.tipoTrabajo = tipoTrabajo;
    }

    public String getTipoTrabajo() {
        return tipoTrabajo;
    }

    public void setTipoTrabajo(String tipoTrabajo) {
        this.tipoTrabajo = tipoTrabajo;
    }

    @Override
    public String toString() {
        return super.toString() + "Trabajo{" + "tipoTrabajo=" + tipoTrabajo + '}';
    }
    
}
