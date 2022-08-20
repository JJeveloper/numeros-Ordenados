package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.JOptionPane;
import view.FrmView;

/**
 *
 * @author JJeveloper
 */
public class ViewController implements ActionListener {

    FrmView view;
    AlgoritmosOrdenamiento ordenar = new AlgoritmosOrdenamiento();

    public ViewController(FrmView view) {
        this.view = view;
        this.view.btnGenerar.addActionListener(this);
        this.view.btnBurbuja.addActionListener(this);
        this.view.btnSeleccion.addActionListener(this);
        this.view.btnInsercion.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == view.btnGenerar) {

            if (!view.txtCantidad.getText().equals("") && !view.txtDe.getText().equals("") && !view.txtHasta.getText().equals("")) {

                if (soloNumerosEnteros()) {

                    if (Integer.parseInt(view.txtCantidad.getText()) >= 1 && Integer.parseInt(view.txtCantidad.getText()) <= 500) {

                        if (Integer.parseInt(view.txtDe.getText()) >= -1000 && Integer.parseInt(view.txtHasta.getText()) <= 1000) {

                            mostrarNumeros();

                        } else {
                            JOptionPane.showMessageDialog(view, "Rango de numeros de entre -1000 hasta 1000 !!!", "", JOptionPane.INFORMATION_MESSAGE);
                        }

                    } else {
                        JOptionPane.showMessageDialog(view, "Cantidad de numeros de entre 1 a 500 !!!", "", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(view, "Ingrese solo numeros !!!", "", JOptionPane.INFORMATION_MESSAGE);
                }

            } else {
                JOptionPane.showMessageDialog(view, "Llene todos los campos !!!", "", JOptionPane.INFORMATION_MESSAGE);
            }

        }

        if (e.getSource() == view.btnBurbuja) {

        }

        if (e.getSource() == view.btnSeleccion) {

        }

        if (e.getSource() == view.btnInsercion) {

        }

    }

    public boolean soloNumerosEnteros() {

        try {
            Integer.parseInt(view.txtCantidad.getText());
            Integer.parseInt(view.txtDe.getText());
            Integer.parseInt(view.txtHasta.getText());
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public void mostrarNumeros() {

        view.txaAreaUno.setLineWrap(true);
        view.txaAreaDos.setLineWrap(true);
        view.txaAreaDos.setText(" ");

        view.btnBurbuja.setEnabled(true);
        view.btnSeleccion.setEnabled(true);
        view.btnInsercion.setEnabled(true);        

        view.txaAreaUno.setText(Arrays.toString(ordenar.generarNumerosAleatorios(Integer.parseInt(view.txtCantidad.getText()), Integer.parseInt(view.txtDe.getText()), Integer.parseInt(view.txtHasta.getText()))));

    }

}
