public class Campania {
    public String nombre;
    public double presupuesto;
    String plataforma;
    boolean activa;

    public void mostrarInformacion(){
        System.out.println("Nombre: " +nombre+ "\nPlataforma: " +plataforma+ "\nEstado: " +(activa? "ACTIVADO":"DESACTIVADO"));
        mostrarPresupuesto();
    }

    public void activar(){
        activa = true;
    }

    void desactivar(){
        activa = false;
    }

    void mostrarPresupuesto(){
        System.out.println("Presupuesto: " +presupuesto);
    }
}