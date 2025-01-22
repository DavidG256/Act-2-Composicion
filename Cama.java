package Ej1;

public class Cama {
    private String estilo;
    private int almohadas;
    private int altura;
    private int sabanas;
    private int colchas;

    public Cama(String estilo, int almohadas, int altura, int sabanas, int colchas) {
        this.estilo = estilo;
        this.almohadas = almohadas;
        this.altura = altura;
        this.sabanas = sabanas;
        this.colchas = colchas;
    }

    public void hacer() {
        System.out.println("Se ha hecho la cama");

    }

    public String getEstilo() {
        return estilo;
    }

    public int getAlmohadas() {
        return almohadas;
    }

    public int getAltura() {
        return altura;
    }

    public int getSabanas() {
        return sabanas;
    }

    public int getColchas() {
        return colchas;
    }
}
