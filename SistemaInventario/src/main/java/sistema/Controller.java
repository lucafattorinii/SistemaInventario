package main.java.sistema;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField nombreField;
    @FXML
    private TextField precioField;
    @FXML
    private TextField cantidadField;

    @FXML
    public void agregarProducto(ActionEvent event) {
        String nombre = nombreField.getText();
        double precio = Double.parseDouble(precioField.getText());
        int cantidad = Integer.parseInt(cantidadField.getText());

        Database.agregarProducto(nombre, precio, cantidad);
        System.out.println("Producto agregado: " + nombre);
    }
}

