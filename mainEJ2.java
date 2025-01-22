package EJ2;

public class mainEJ2 {
    public static void main(String[] args) {

        Lampara lampara = new Lampara("Minimalista", true, 7);
        Cama cama = new Cama("Colorido", 4, 17,6, 68);
        Techo techo = new Techo(20, "Amarillo");
        Pared pared1= new Pared("Direccion 1" );
        Pared pared2 = new Pared("Direccion 2" );
        Pared pared3 = new Pared("Direccion 3" );
        Pared pared4 = new Pared("Direccion 4" );
        Habitacion habitacion = new Habitacion("Hab1", pared1, pared2, pared3, pared4, techo, cama, lampara);
        lampara.encender();



    }
}

