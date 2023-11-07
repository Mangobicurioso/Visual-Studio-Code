public class Critico extends Pacientes {

    public Critico(String nombre, int id, int sintomas) {
        super(nombre, id, sintomas);
    }

    public void atender() {
        System.out.println("Operando al paciente...");
        System.out.println("");
        System.out.println("Paciente dado de alta...");
        System.out.println("");
    }
}
