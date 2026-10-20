public class Main {
    static void main() {
        Campania c1 = new Campania();
        Campania c2 = new Campania();
        Campania c3 = new Campania();

        c1.nombre = "Modelaje";
        c1.plataforma = "Instagram";
        c1.presupuesto = 150;
        c1.activa = true;

        c2.nombre = "Videojuegos";
        c2.plataforma = "Tik Tok";
        c2.presupuesto = 60;
        c2.activa = true;

        c3.nombre = "Recaudación de fondos";
        c3.plataforma = "Facebook";
        c3.presupuesto = 150;
        c3.activa = true;

        System.out.println("Campaña 1");
        c1.mostrarInformacion();

        System.out.println("\nCampaña 2");
        c2.mostrarInformacion();

        System.out.println("\nCampaña 3");
        c3.mostrarInformacion();

        System.out.println("\nCambio de estado campaña 1");
        c1.desactivar();

        c1.mostrarInformacion();
    }
}
