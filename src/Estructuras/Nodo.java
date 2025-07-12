/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructuras;

/**
 *
 * @author sebas
 */
    
public class Nodo {
    private Expediente exp;
    public Nodo siguiente;

    public Nodo(Expediente exp) {
        this.exp = exp;
        this.siguiente = null;
    }
    
    public Nodo() {
        this.exp = null;
        this.siguiente = null;
    }

    public Expediente getExp() {
        return exp;
    }

    public void setExp(Expediente exp) {
        this.exp = exp;
    }

}

    
    