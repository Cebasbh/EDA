/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructuras;

/**
 *
 * @author sebas
 */
public class Pila {
    public Nodo head;
    private int size;
    
public Pila() {
    this.head = null;
    this.size = 0;
}
public void Push(Expediente exp) {
    Nodo bloque = new Nodo(exp);
    bloque.siguiente = head;
    head = bloque;
    size++;
}
public Expediente Pop() {
        Nodo temp = null;
        if (head == null){
        }
        else{
            temp = head;
            head = head.siguiente;
            size--;
        }
        Expediente value;
        value = temp.getExp();
        return value;
    }
public void Mostrar(){
    Nodo temp = head;
    while (temp != null){
        System.out.print(temp.getExp().getDocumento().getNombres() + " -> ");
        temp = temp.siguiente;
    }
    System.out.println("null");
}
}
