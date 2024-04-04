package persona;
public class Persona {
    String colorPiel;
    int edad;
    float estatura;
    String sexo;
    String nombre;
    String id;
    String telefono;

    public static void cantar() {
        System.out.println("estoy cantando");
    }

    public void bailar() {
        System.out.println("estoy bailando");
    }

    public int caminar(int cuadras) {
        return cuadras*100;
    }

}
