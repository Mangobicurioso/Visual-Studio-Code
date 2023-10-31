import java.util.Random;

public class Triage {

    ListaEnlazada listaGeneral = new ListaEnlazada();
    private int idCounter = 1;

    public void crearPaciente() {
        Random rand = new Random();
        // Generar un número aleatorio para seleccionar un nombre
        int randomIndex = rand.nextInt(Nombres.nombres.length);
        String nombre = Nombres.nombres[randomIndex];

        // Generar un ID único
        int id = idCounter++;

        // Generar un número aleatorio para los síntomas (1-30)
        int sintomas = rand.nextInt(30) + 1;

        // Establecer signos y procedimiento como "Null"
        String signos = "Null";
        String procedimiento = "Null";

        // Crear el paciente crítico
        Pacientes paciente = new Pacientes(nombre, id, sintomas, signos, procedimiento);
        Triage.triage(paciente);

        listaGeneral.agregar(paciente);

    }

    public static void triage(Pacientes paciente) {
        if (paciente.getSintomas() > 10) {
            paciente.setSignos("Estado critico");
            paciente.setProcedimiento("Operado, medicado y dado de alta");
        } else if (paciente.getSintomas() < 10 && paciente.getSintomas() > 5) {
            paciente.setSignos("Estado urgente");
            paciente.setProcedimiento("Exámenes listos y dado de alta");
        } else if (paciente.getSintomas() < 6) {
            paciente.setSignos("Estado no urgente");
            paciente.setProcedimiento("Medicado y dado de alta");

        }
    }
}
