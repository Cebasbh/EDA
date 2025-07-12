package Estructuras;

public class Lista_Circular {
    Nodo head;
    Nodo current;
    int size;

    public Lista_Circular() {
        this.head = null;
        this.current = null;
        this.size = 0;
    }
    
    public void add(Expediente exp) {
        Nodo temp = new Nodo(exp);
        if (head == null){
            head = temp;
            head.siguiente = head;
            current = head;
            }
        else
        {
        Nodo tail = head;
        while (tail.siguiente != head)
        {
            tail = tail.siguiente;
        }
        temp.siguiente = tail.siguiente;
        tail.siguiente = temp;
        }
        size++;
    }
    public void delete(Expediente exp) {
    Nodo actual = head;
    Nodo anterior = null;

    do {
        if (actual.getExp().getId() == exp.getId()) {
            if (actual == head) {
                if (head.siguiente == head) {
                    head = null;
                } else {
                    Nodo tail = head;
                    while (tail.siguiente != head) {
                        tail = tail.siguiente;
                    }
                    head = head.siguiente;
                    tail.siguiente = head;
                }

            } else {
                anterior.siguiente = actual.siguiente;
            }

            size--;
            return;
        }

        anterior = actual;
        actual = actual.siguiente;

    } while (actual != head);
    }

    public void next() {
    if (current != null) {
        current = current.siguiente;
    }
    }

    public Expediente getCurrentExp() {
        return current.getExp();
    }

    public boolean isEmpty() {
        return head == null;
    }
    
    public void Mostrar(){
    Nodo temp = head;
        for (int i = 0; i < size; i++) {
            System.out.print(temp.getExp().getDocumento().getNombres() + " -> ");
            temp = temp.siguiente;
        }
        System.out.println("");
    }
}
