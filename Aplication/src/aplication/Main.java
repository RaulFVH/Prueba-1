package aplication;

import aplication.DTO.Usuarios;


public class Main {

    
    public static void main(String[] args) {
        
        System.out.println("Creando Usuarios...");
        Usuarios c = new Usuarios();
        
        c.setId(1874);
        c.setNombreCompleto("Raul");
        c.setRut(20908763);
        c.setDv ("k");
        c.setTelefono (982608976);
        c.setEmail("raulval@gmail.com");
        c.setContrasena("vivachile123");
        c.setNombreUsuario ("dcog");
        System.out.println (c.getId());
        System.out.println(c.getNombreCompleto());
        System.out.println(c.getRut());
        System.out.println(c.getDv());
        System.out.println(c.getTelefono());
        System.out.println(c.getEmail());
        System.out.println(c.getContrasena());
        System.out.println(c.getNombreUsuario());
        
 
                       
        
    }
    
}
