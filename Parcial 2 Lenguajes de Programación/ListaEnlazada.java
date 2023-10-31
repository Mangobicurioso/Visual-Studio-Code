public class ListaEnlazada {
    Node head;

    public ListaEnlazada() {
        this.head = null;
    }

    public void concatenar(ListaEnlazada otraLista) {
        if (this.head == null) {
            this.head = otraLista.head;
        } else {
            Node current = this.head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = otraLista.head;
        }
        otraLista.head = null;
    }

    public void agregar(Pacientes datos) {
        Node nuevoNodo = new Node(datos);
        nuevoNodo.next = this.head;
        this.head = nuevoNodo;
    }

    public void agregarFinal(Pacientes datos) {
        Node nuevoNodo = new Node(datos);
        if (this.head == null) {
            this.head = nuevoNodo;
        } else {
            Node current = this.head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = nuevoNodo;
        }
    }

    public void imprimirLista() {
        Node current = this.head;
        while (current != null) {
            current.datos.atributos();
            System.out.println();
            current = current.next;
        }
        System.out.println("null");
    }

    public void medicos() {
        Node current = this.head;
        int size = 0;

        // Calcula el tamaño de la lista enlazada
        while (current != null) {
            current = current.next;
            size++;
        }

        // Ordena la lista enlazada en función de la cantidad de síntomas (de mayor a
        // menor)
        for (int i = 0; i < size - 1; i++) {
            current = this.head;
            for (int j = 0; j < size - i - 1; j++) {
                Pacientes pacienteActual = current.datos;
                Pacientes pacienteSiguiente = current.next.datos;
                if (pacienteActual.getSintomas() < pacienteSiguiente.getSintomas()) {
                    // Intercambia los pacientes
                    current.datos = pacienteSiguiente;
                    current.next.datos = pacienteActual;
                }
                current = current.next;
            }
        }
    }
}
