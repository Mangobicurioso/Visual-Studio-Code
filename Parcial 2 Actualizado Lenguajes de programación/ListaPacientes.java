import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListaPacientes {

    private static List<Pacientes> listaPacientes = new ArrayList<>();

    public void agregar(Pacientes paciente) {
        listaPacientes.add(paciente);
    }

    public static void ordenarLista() {
        // Ordenar la lista en función del número de síntomas, de mayor a menor
        Collections.sort(listaPacientes, new Comparator<Pacientes>() {
            @Override
            public int compare(Pacientes paciente1, Pacientes paciente2) {
                return Integer.compare(paciente2.getSintomas(), paciente1.getSintomas());
            }
        });
    }

    public static void imprimir() {
        for (Pacientes paciente : listaPacientes) {
            paciente.atributos();
            System.out.println("--------------------");
        }
    }

    public static void imprimir_atender() {
        for (Pacientes paciente : listaPacientes) {
            paciente.atributos();
            System.out.println();
            paciente.atender();
            System.out.println("--------------------");
        }
    }
}
