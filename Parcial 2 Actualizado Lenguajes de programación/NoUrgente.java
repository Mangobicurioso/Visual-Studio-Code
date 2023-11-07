public class NoUrgente extends Pacientes {
    public NoUrgente(String nombre, int id, int sintomas) {
        super(nombre, id, sintomas);
    }

    public void atender() {
        System.out.println("Medicado al paciente...");
        System.out.println("");
        System.out.println("Paciente dado de alta...");
        System.out.println("");
    }
}
