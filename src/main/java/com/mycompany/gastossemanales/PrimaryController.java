package com.mycompany.gastossemanales;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

public class PrimaryController implements Initializable {

    @FXML private TextField txtAlimentacion;
    @FXML private TextField txtRefrigerios;
    @FXML private TextField txtTransporte;
    @FXML private TextField txtTelefonia;
    @FXML private TextField txtOtros;
    @FXML private TextField txtTotal;
    @FXML private TextField txtGastoAlto;

    @FXML
    private void calcularEstadisticas(ActionEvent event) {
        double alim = Double.parseDouble(txtAlimentacion.getText());
        double refri = Double.parseDouble(txtRefrigerios.getText());
        double trans = Double.parseDouble(txtTransporte.getText());
        double telef = Double.parseDouble(txtTelefonia.getText());
        double otros = Double.parseDouble(txtOtros.getText());
        double total = alim + refri + trans + telef + otros;
        txtTotal.setText(String.valueOf(total));
        double mayor = alim;
        String nombreMayor = "Alimentación";

        if (refri > mayor) {
            mayor = refri;
            nombreMayor = "Refrigerios";
        }
        if (trans > mayor) {
            mayor = trans;
            nombreMayor = "Transporte";
        }
        if (telef > mayor) {
            mayor = telef;
            nombreMayor = "Telefonía";
        }
        if (otros > mayor) {
            mayor = otros;
            nombreMayor = "Otros";
        }
        txtGastoAlto.setText(nombreMayor);
    }

    @FXML
    private void limpiarCampos(ActionEvent event) {
        txtAlimentacion.clear();
        txtRefrigerios.clear();
        txtTransporte.clear();
        txtTelefonia.clear();
        txtOtros.clear();
        txtTotal.clear();
        txtGastoAlto.clear();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }
}
