package entities;

import javax.swing.*;

public class ControllerWeight {
    Cargas carga = new Cargas();

    public void validateWeightSimple(double weight, int id) {

        if(weight > carga.getPrincipal() && weight > carga.getAux()) {
            JOptionPane.showMessageDialog(null, "Capacidade maxima atingida!");

        } else if(weight > carga.getPrincipal()) {
            carga.setAux(weight);
            JOptionPane.showMessageDialog(null, "Carga de " + weight +
                    "KG armazenada em compartimento Auxiliar \n" +
                    "numero de rastreamento: " + id +
                    "\nCapcidade disponivel: " + carga.getAux());

        } else {
            carga.setPrincipal(weight);
            JOptionPane.showMessageDialog(null, "Carga de "
                    + weight + " armazenada em compartimento Principal \n" +
                    "Numero de rastreamento: " + id +
                    "\n Capacidade disponivel " + carga.getPrincipal() );
        }
    }

    public void validateWeightPrecious(double weight, int id) {
        carga.setPrecious(weight);
        JOptionPane.showMessageDialog(null, "Carga de " + weight +
                "KG armazenada em compartimento Precioso" + "\n Numero de Rastreamento: " +
                id + "\n Capacidade disponivel: " + carga.getPrecious());
    }
}
