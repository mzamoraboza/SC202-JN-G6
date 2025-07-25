/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sc202jng6.proyectofinalpoo;

/**
 *
 * @author mzamo
 */
public class Usuario {
    // Atributos de la clase Usuario
    private final int id;
    private String nombre;
    private String correo;
    private String password;
    private RolUsuario rol;
    
    // Constructor de la clase Usuario
    public Usuario(int id, String nombre, String correo, String password,RolUsuario rol){
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.password = password;
        this.rol = rol;
    }

    // GET
    public int getId() {
        return id;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getCorreo(){
        return correo;
    }
    
    public String getPassword(){
        return password;
    }
    
    public RolUsuario getRol(){
        return rol;
    }
    
    // SET
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setCorreo(String correo){
        this.correo = correo;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    public void setRol(RolUsuario rol){
        this.rol = rol;
    }
    
}
