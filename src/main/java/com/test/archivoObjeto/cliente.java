/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.archivoObjeto;

import java.io.Serializable;

/**
 *
 * @author Royer
 */
public class cliente implements Serializable {

    static final long serialVersionUID = 43L;//------ }es un codigo para nuestro onjeto{45L(L por es de tipo long) ----
    /*Cuando realizamos la serializacion de una clase denominamos una variable serialVersionUID ES UN CODIGO para identificar al objeto*/
    private String nombre;
    private String paterno;
    private String materno;
    private int cedula;
    //DEFINIENDO AGREGACION
    private TarjetaDebito tarjeta;

    public void mostrarCliente() {

        System.out.println("nombre: " + this.nombre);
        System.out.println("paterno: " + this.paterno);
        System.out.println("materno: " + this.materno);
        System.out.println("Nro cedula:" + this.cedula);
        if (tarjeta != null) {
            tarjeta.mostrarTarjeta();
        } else {
            System.out.println("El cliente no tiene  tajeta  de debito agregado");
        }
        System.out.println("----------------------");
    }
    //getters and setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public TarjetaDebito getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(TarjetaDebito tarjeta) {
        this.tarjeta = tarjeta;
    }
    
}
