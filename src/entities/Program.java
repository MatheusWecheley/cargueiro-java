package entities;

import javax.swing.*;

public class Program {
    public static void main(String[] args) {

        String confirm = "s";
        ControllerCarga controller = new ControllerCarga();
        int id = 0;

        while (confirm.equalsIgnoreCase("s")) {

            String typeCarga = JOptionPane.showInputDialog("Digite o tipo da carga: ");
            double weight = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso da carga: "));
            id++;

            controller.validateCarga(typeCarga, weight, id);
            confirm = JOptionPane.showInputDialog("Deseja colocar mais carga? S|N");
        }

        controller.podeDecolar();
    }
}
