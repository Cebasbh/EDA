/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructuras;

/**
 *
 * @author sebas
 */
public class Cola {
    public Nodo head;
    private int size;
    
public Cola() {
    this.head = null;
    this.size = 0;
}
public void EnqueuePrio1(Expediente exp) {
    Nodo bloque = new Nodo(exp);
    Nodo lastprio = null;
    if (head == null)
        {
            head = bloque;
        }
    else{
        lastprio = head;
        if (lastprio.getExp().getPrioridad().equals("2"))
        {
            bloque.siguiente = lastprio;
            head = bloque;
        }
        else
        {
            while (lastprio.siguiente != null && lastprio.siguiente.getExp().getPrioridad().equals("1"))
            {
                lastprio = lastprio.siguiente;
            }               
            bloque.siguiente = lastprio.siguiente;
            lastprio.siguiente = bloque;
        }
        }
    size++;
}
public void EnqueuePrio2(Expediente exp) {
    Nodo bloque = new Nodo(exp);
    Nodo temp = head;
    if (head == null)
        {
        head = bloque;
        }
    else{
        temp = head;
        while (temp.siguiente != null)
        {
            temp = temp.siguiente;
        }
        temp.siguiente = bloque;
    }
        size++;
}
public Expediente Dequeue() {
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
public Nodo IterarHastaFinal(){
    Nodo temp = head;
        while (temp.siguiente != null)
        {
            temp = temp.siguiente;
        }
    return temp;
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
