package figuras;

public class Circunferencia {
    private double radio;
    private String color;  // Convertir color en atributo de clase

    public Circunferencia(double radio) {
        this.radio = radio;
        this.color = "rojo";  // Inicializar en el constructor
    }

    public void imprimir() {
        double d = 2 * radio;  // Extracción del cálculo del diámetro
        System.out.println("Diámetro: " + d);
        System.out.println("Color: " + color);
        double area = 2 * 3.1416 * radio * radio;
        System.out.println(area);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getColor() {  // Getter para color
        return color;
    }

    public void setColor(String color) {  // Setter para color
        this.color = color;
    }

    public boolean esIgual(Circunferencia otro, boolean conDecimales) {
        double radio1 = this.radio;
        double radio2 = otro.getRadio();
        if (conDecimales) {
            return radio1 == radio2;
        } else {
            return Math.abs(radio1 - radio2) < 1;
        }
    }
}
