public abstract class Pacientes {
    private String nombre;
    private int id;
    private int sintomas;

    public Pacientes(String nombre, int id, int sintomas) {
        this.nombre = nombre;
        this.id = id;
        this.sintomas = sintomas;
    }

    public void atributos() {
        System.out.println("El nombre del paciente es: " + nombre);
        System.out.println("El id del paciente es: " + id);
        System.out.println("El paciente tiene: " + sintomas + " síntomas");
    }

    public int getSintomas() {
        return sintomas;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract void atender();
}
