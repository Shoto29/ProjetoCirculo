package principal;

import javax.swing.JOptionPane;
import model.Circulo;

public class Principal {

    public static void main(String[] args) {
        //Declara e instãncia o objeto
        Circulo cir1 = new Circulo();

        //Entrada
        cir1.setRaio(Double.parseDouble(JOptionPane.showInputDialog("Escreva o raio do circulo")));

        //Saida
        JOptionPane.showMessageDialog(null, "A área do circulo é igual a: " + cir1.getArea());
    }

}
