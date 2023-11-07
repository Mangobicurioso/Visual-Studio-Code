public class Urgente extends Pacientes {

    public Urgente(String nombre, int id, int sintomas) {
        super(nombre, id, sintomas);
    }

    public void atender() {
        System.out.println("Exámenes hechos al paciente...");
        System.out.println("");
        System.out.println("Paciente dado de alta...");
        System.out.println("");
    }
}
