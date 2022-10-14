package model;

public class Persona {
    private  String nombre; //Darle valor a esta variables
    private  String apellido;
    private  int edad;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;

    }
        public void setNombre(String nom){
            this.nombre= nom;
        }
        public void setApellido (String ape){
            this.nombre= ape;
        }
        public void setEdad (int edad){
            this.edad= edad;
        }

        public String getNombre(){
            return this.nombre;
        }
        public String getApellido(){
            return this.apellido;
        }
        public int getEdad(){
            return this.edad;
        }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                '}';
    }
}
