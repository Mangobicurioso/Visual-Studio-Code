public class Hospital {

    public void ejecutor() {
        PacienteBase crear = new PacienteBase();
        // Creamos el numero de pacientes
        for (int i = 0; i < 6; i++) {
            crear.crearPacienteBase();
        }

        // Se añaden los pacientes a listaPacientes en triage...
        System.out.println("Se añaden los pacientes a listaPacientes en triage...");
        ListaPacientes.imprimir();
        System.out.println("");

        // Ordenamos listas en orden de sintomas
        System.out.println("Ordenamos listas en orden de sintomas");
        ListaPacientes.ordenarLista();

        // imprimimos Lista ordenada
        System.out.println("imprimimos Lista ordenada");
        ListaPacientes.imprimir();
        System.out.println("");

        // Atendemos y damos de alta
        System.out.println("Atendemos y damos de alta");
        ListaPacientes.imprimir_atender();
    }
}
