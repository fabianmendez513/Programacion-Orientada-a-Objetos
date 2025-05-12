public class Main {

    public static void main(String[] args) {

        //Usuarios
        Usuario usuario1 = new Usuario ("Fabian Isai" , "Mendez P" , 16 , 2008);
        Usuario usuario2 = new Usuario ("Joel David" , "Andres" , 18 , 2006);

        //Metodos del objeto
        usuario1.setNombre("Nelson");
        usuario1.mostrarDatos();
        usuario2.mostrarDatos();

      System.out.println(usuario1.getNombre);

        if (usuario1.getEdad() >= 16){
            System.out.println("Mayor de edad");
        }

        

    

    }


}