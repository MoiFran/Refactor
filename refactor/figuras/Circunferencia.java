package figuras;

public class Circunferencia {
    private double radio;
    private String color;  // Convertir color en atributo de clase

    public Circunferencia(double radio) {
        this.radio = radio;
        this.color = "rojo";  // Inicializar en el constructor
    }

    public double calcularArea() {
        return 3.1416 * radio * radio;
    }

    public void imprimir() {
        System.out.println("Diámetro: " + (2 * radio));
        System.out.println("Color: " + color);
        System.out.println("Área: " + (3.1416 * radio * radio));
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

    public boolean esIgual(boolean considerarDecimales, Circunferencia otraCircunferencia) {
        double radio1 = this.radio;
        double radio2 = otraCircunferencia.getRadio();
        if (considerarDecimales) {
            return radio1 == radio2;
        } else {
            return Math.abs(radio1 - radio2) < 1;
        }
    }
}
