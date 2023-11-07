public class Triage {
    ListaPacientes lista = new ListaPacientes();

    public void triage(String nombre, int id, int sintomas) {
        Pacientes paciente = null;
        if (sintomas > 10) {
            paciente = new Critico(nombre, id, sintomas);
            lista.agregar(paciente);
        } else if (sintomas < 10 && sintomas > 5) {
            paciente = new Urgente(nombre, id, sintomas);
            lista.agregar(paciente);
        } else if (sintomas < 6) {
            paciente = new NoUrgente(nombre, id, sintomas);
            lista.agregar(paciente);
        }
    }
}
