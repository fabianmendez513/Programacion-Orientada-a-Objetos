
public class Usuario {

    // Propiedades de objeto
    private String nombre;
    private String apellidos;
    private int edad ;
    private int fechaNacimiento;
    
    //
    public Usuario (String nombre , String apellidos , int edad , int fehaNacimiento) {
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.edad = edad;
            this.fechaNacimiento = fechaNacimiento;

    }

    //Metodo gets
    public int getEdad(int edad){
        return edad ;
    
    }
        

    public int geFchaNacimiento(int fechaNacimiento){
        return fechaNacimiento ;

    }

    public String getNombre(String nombre){
        return nombre;
    }

    public String getapellidos(String apellidos){
        return apellidos;
    }

    //Metodos sets
    public void setNombre (String nombre){
        this.nombre  = nombre;
    }


    //Metodos
    public void mostrarDatos (){
        System.out.println("Nombre: " + nombre );
        System.out.println("Apellidos: " + apellidos );
        System.out.println("Edad: " + edad );
        System.out.println("Fecha Nacimiento: " +  fechaNacimiento );



    }
}