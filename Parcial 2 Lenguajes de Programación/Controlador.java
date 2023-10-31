public class Controlador {

    public void ejecutor() {
        Triage triage = new Triage();
        triage.crearPaciente();
        triage.crearPaciente();
        triage.crearPaciente();
        triage.crearPaciente();
        triage.crearPaciente();

        System.out.print("Lista de pacientes: ");
        triage.listaGeneral.medicos();
        triage.listaGeneral.imprimirLista();
        // Concatenar las tres listas en el orden deseado
    }
}
