package b3;

public class Colombiano {

    private String cedula;
    private String nombre;
    private String apellido;
    private String tipoDocumento;
    private String tipoSangre;

    public Colombiano(String cedula, String nombre, String apellido, String tipoDocumento, String tipoSangre) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoDocumento = tipoDocumento;
        this.tipoSangre = tipoSangre;
    }
    public  String getNombre(){
        return nombre;
    }

    public void  setNombre(String nombre){
        this.nombre=nombre;
    }

    public  String  getApellido(){
        return apellido;
    }
}
