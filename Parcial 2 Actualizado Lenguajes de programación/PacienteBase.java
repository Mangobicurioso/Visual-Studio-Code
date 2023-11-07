import java.util.Random;

public class PacienteBase {
    private int idCounter = 1;
    Triage triage = new Triage();

    public void crearPacienteBase() {
        Random rand = new Random();
        // Generar un número aleatorio para seleccionar un nombre
        int randomIndex = rand.nextInt(PacienteBase.nombres.length);
        String nombre = PacienteBase.nombres[randomIndex];

        int id = idCounter++;

        int sintomas = rand.nextInt(30) + 1;
        triage.triage(nombre, id, sintomas);
    }

    public static String[] nombres = new String[] {
            "Juan",
            "María",
            "Pedro",
            "Ana",
            "Luis",
            "Laura",
            "Carlos",
            "Sofía",
            "Daniel",
            "Lucía",
            "Diego",
            "Valentina",
            "Andrés",
            "Isabella",
            "Miguel",
            "Camila",
            "José",
            "Carmen",
            "Pablo",
            "Julieta"
    };
}