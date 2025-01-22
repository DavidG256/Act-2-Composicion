package Ej1;

public class Techo {
    private int altura;
    private String color;

    public Techo(int altura, String color) {
        this.altura = altura;
        this.color = String.valueOf(color);
    }

    public int getAltura() {
        return altura;
    }

    public String getColor() {
        return color;
    }
}
