/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueva;

/**
 *
 * @author SENA
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TiendaElectrodomesticos extends JFrame {

    // Componentes de la interfaz
    private JTextField txtNombre, txtApellido, txtEdad, txtTelefono, txtTipo, txtProducto, txtPrecioUnitario, txtCantidad;
    private JLabel lblResultado, lblNombre, lblApellido, lblEdad, lblTelefono, lblTipo, lblProducto, lblPrecio, lblCantidad, lblDescuento, lblPrecioTotal;
    private JButton btnRealizarCompra, btnMostrarDatos, btnLimpiar;

    public TiendaElectrodomesticos() {
        setTitle("Tienda DON APARATO");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(12, 2));

        // Inicializar los componentes
        txtNombre = new JTextField();
        txtApellido = new JTextField();
        txtEdad = new JTextField();
        txtTelefono = new JTextField();
        txtTipo = new JTextField();
        txtProducto = new JTextField();
        txtPrecioUnitario = new JTextField();
        txtCantidad = new JTextField();

        lblNombre = new JLabel("Nombre:");
        lblApellido = new JLabel("Apellido:");
        lblEdad = new JLabel("Edad:");
        lblTelefono = new JLabel("Teléfono:");
        lblTipo = new JLabel("Tipo (A, B, C):");
        lblProducto = new JLabel("Producto:");
        lblPrecio = new JLabel("Precio Unitario:");
        lblCantidad = new JLabel("Cantidad:");
        lblDescuento = new JLabel("Descuento:");
        lblPrecioTotal = new JLabel("Precio Total:");

        lblResultado = new JLabel("");

        btnRealizarCompra = new JButton("Realizar Compra");
        btnMostrarDatos = new JButton("Mostrar Datos");
        btnLimpiar = new JButton("Limpiar");

        // Añadir los componentes a la ventana
        add(lblNombre);
        add(txtNombre);
        add(lblApellido);
        add(txtApellido);
        add(lblEdad);
        add(txtEdad);
        add(lblTelefono);
        add(txtTelefono);
        add(lblTipo);
        add(txtTipo);
        add(lblProducto);
        add(txtProducto);
        add(lblPrecio);
        add(txtPrecioUnitario);
        add(lblCantidad);
        add(txtCantidad);
        add(lblDescuento);
        add(lblResultado);
        add(lblPrecioTotal);
        add(new JLabel("")); // Espacio vacío
        add(btnRealizarCompra);
        add(btnMostrarDatos);
        add(btnLimpiar);

        // Acción del botón Realizar Compra
        btnRealizarCompra.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                realizarCompra();
            }
        });

        // Acción del botón Mostrar Datos
        btnMostrarDatos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarDatos();
            }
        });

        // Acción del botón Limpiar
        btnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpiar();
            }
        });
    }

    // Método para realizar la compra y calcular el precio final
    private void realizarCompra() {
        try {
            // Obtener datos del formulario
            String nombre = txtNombre.getText();
            String apellido = txtApellido.getText();
            String tipo = txtTipo.getText().toUpperCase();
            double precioUnitario = Double.parseDouble(txtPrecioUnitario.getText());
            int cantidad = Integer.parseInt(txtCantidad.getText());

            // Calcular precio total sin descuento
            double precioTotal = precioUnitario * cantidad;
            double descuento = 0;
            String mensajeDescuento = "";

            // Aplicar descuento según el tipo de usuario
            switch (tipo) {
                case "A":
                    descuento = 0.40 * precioTotal;
                    mensajeDescuento = "Descuento del 40%";
                    break;
                case "B":
                    descuento = 0.20 * precioTotal;
                    mensajeDescuento = "Descuento del 20%";
                    break;
                case "C":
                    descuento = 0.10 * precioTotal;
                    mensajeDescuento = "Descuento del 10%";
                    break;
                default:
                    mensajeDescuento = "No se le realiza descuento";
            }

            double precioReal = precioTotal - descuento;

            // Mostrar el resultado
            lblResultado.setText("<html>Nombre: " + nombre + " " + apellido + "<br>Tipo: " + tipo
                    + "<br>Precio Total: $" + precioTotal + "<br>" + mensajeDescuento + "<br>Precio Real: $" + precioReal + "</html>");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese valores válidos para los campos numéricos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Método para mostrar los datos del usuario
    private void mostrarDatos() {
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String edad = txtEdad.getText();
        String telefono = txtTelefono.getText();
        String tipo = txtTipo.getText();

        if (nombre.isEmpty() || apellido.isEmpty() || edad.isEmpty() || telefono.isEmpty() || tipo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese todos los datos del usuario.", "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Datos del Usuario:\n"
                    + "Nombre: " + nombre + " " + apellido + "\n"
                    + "Edad: " + edad + "\n"
                    + "Teléfono: " + telefono + "\n"
                    + "Tipo: " + tipo, "Datos del Usuario", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    // Método para limpiar los campos del formulario y las etiquetas
    private void limpiar() {
        txtNombre.setText("");
        txtApellido.setText("");
        txtEdad.setText("");
        txtTelefono.setText("");
        txtTipo.setText("");
        txtProducto.setText("");
        txtPrecioUnitario.setText("");
        txtCantidad.setText("");
        lblResultado.setText("");
    }

    // Método main para ejecutar la aplicación
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TiendaElectrodomesticos ventana = new TiendaElectrodomesticos();
            ventana.setVisible(true);
        });
    }
}
