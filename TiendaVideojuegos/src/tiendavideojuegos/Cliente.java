/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendavideojuegos;

/**
 *
 * @author mateo
 */
public class Cliente extends Dni{
    //nombre,apellido,codigo postal,telefono y dni
    private Dni dni;
    private String nombre;
    private String apellidos;
    private Telefono[] telefonos;
    private int edad;
    
    public Cliente()
    {
        dni = new Dni();
        nombre = "";
        apellidos = "";
        telefonos = new Telefono[0];
        edad = 0;
    }

    public Dni getDni() {
        return dni;
    }

    public void setDni(Dni dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Telefono[] getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(Telefono[] telefonos) {
        this.telefonos = telefonos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    public Cliente(Dni dni, String nombre, String apellidos, int edad){
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefonos = new Telefono[0];
        this.edad = edad;
    }
    
    private void insertarTelefono(Telefono t)
    {
        Telefono[] aux = new Telefono[telefonos.length+1];
        for (int i = 0; i < telefonos.length; i++)
            aux[i] = telefonos[i];
        aux[telefonos.length] = t;
        telefonos = aux;
    }
    
    public void anadirTelefono(Telefono t) 
    {        
        insertarTelefono(t);        
    }
    
    public void anadirTelefono(String n) throws TelefonoException
    {
        Telefono t = new Telefono(n);
        insertarTelefono(t);        
    }
    
    public void anadirTelefono(String p, String n) throws TelefonoException
    {
        Telefono t = new Telefono(p,n);
        insertarTelefono(t);
    }

    @Override
    public String toString()
    {
        String t = dni+" "+ nombre+" "+apellidos+" ("+edad+")"+"\nTeléfonos:";
        for (int i = 0; i < telefonos.length; i++)
            t+="\n\t"+telefonos[i];
        return t;
    }
    
    
}
