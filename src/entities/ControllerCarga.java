package entities;

import javax.swing.*;

public class ControllerCarga {
    String typeCarga;
    double weight;
    Cargas carga = new Cargas();
    ControllerWeight controllerWeight = new ControllerWeight();


    public void validateCarga(String typeCarga, double weight, int id) {
        this.typeCarga = typeCarga;
        this.weight = weight;
        carga.setTotalWeight(weight);

        if(typeCarga.equalsIgnoreCase("simples")) {
            controllerWeight.validateWeightSimple(weight, id);

        } else if(typeCarga.equalsIgnoreCase("preciosa")) {
            controllerWeight.validateWeightPrecious(weight, id);

        }
    }

    public void podeDecolar() {
        if(carga.getTotalWeight() >= 500) {
            JOptionPane.showMessageDialog(null, "Cargueiro pronto pra decolar com "
                    + carga.getTotalWeight() + "Kg");

        } else {
            JOptionPane.showMessageDialog(null, "O cargueiro não pode decolar com apenas "
                    + carga.getTotalWeight() + "Kg");

        }
    }

}
