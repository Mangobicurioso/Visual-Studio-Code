public class Pacientes {
    private String nombre;
    private int id;
    private int sintomas;
    private String signos;
    private String procedimiento;

    public Pacientes(String nombre, int id, int sintomas, String signos, String procedimiento) {
        this.nombre = nombre;
        this.id = id;
        this.sintomas = sintomas;
        this.signos = signos;
        this.procedimiento = procedimiento;
    }

    public void atributos() {
        System.out.println("El nombre del paciente es: " + nombre);
        System.out.println("El id del paciente es: " + id);
        System.out.println("El paciente tiene: " + sintomas + " síntomas");
        System.out.println("El paciente tiene los signos vitales en: " + signos);
        System.out.println("Procedimiento del paciente: " + procedimiento);
    }

    public int getSintomas() {
        return sintomas;
    }

    public String getSignos() {
        return signos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setSignos(String signos) {
        this.signos = signos;
    }

    public void setProcedimiento(String procedimiento) {
        this.procedimiento = procedimiento;
    }
}
