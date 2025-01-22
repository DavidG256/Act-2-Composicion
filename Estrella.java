package EJ2;

public class Estrella {
    private String estilo;
    private boolean bateria;
    private int calificacion;


    public Estrella(String estilo, boolean bateria, int calificacion) {
        this.estilo = estilo;
        this.bateria = bateria;
        this.calificacion = calificacion;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public boolean hayBateria() {
        return bateria;
    }

    public void setBateria(boolean bateria) {
        this.bateria = bateria;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public void encender(){
        System.out.println("La lampara se ha encendido");

    }

}



