package Taller_no_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class propuesto18_cap3 extends JFrame {

    private JTextField campoCodigo, campoNombre, campoHorasTrabajadas, campoValorHora, campoRetencion;
    private JTextArea areaResultado;

    public propuesto18_cap3() {
        
        setTitle("Información del Empleado");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(7, 2)); 

        
        add(new JLabel("Código:"));
        campoCodigo = new JTextField();
        add(campoCodigo);

        add(new JLabel("Nombre:"));
        campoNombre = new JTextField();
        add(campoNombre);

        add(new JLabel("Horas trabajadas al mes:"));
        campoHorasTrabajadas = new JTextField();
        add(campoHorasTrabajadas);

        add(new JLabel("Valor por hora trabajada:"));
        campoValorHora = new JTextField();
        add(campoValorHora);

        add(new JLabel("Retención en la fuente (%):"));
        campoRetencion = new JTextField();
        add(campoRetencion);

        JButton botonCalcular = new JButton("Calcular Salario");
        botonCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcularSalario();
            }
        });
        add(botonCalcular);

        areaResultado = new JTextArea();
        areaResultado.setEditable(false);
        add(new JScrollPane(areaResultado));

        setVisible(true);
    }

    private void calcularSalario() {
        try {
            int codigo = Integer.parseInt(campoCodigo.getText());
            String nombre = campoNombre.getText();
            double horasTrabajadas = Double.parseDouble(campoHorasTrabajadas.getText());
            double valorHora = Double.parseDouble(campoValorHora.getText());
            double retencion = Double.parseDouble(campoRetencion.getText()) / 100;

            double salarioBruto = valorHora * horasTrabajadas;
            double salarioNeto = salarioBruto - salarioBruto * retencion;

            String resultado = "Código: " + codigo + "\nNombre: " + nombre + 
                               "\nSalario bruto: " + salarioBruto + 
                               "\nSalario neto: " + salarioNeto;
            areaResultado.setText(resultado);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese datos válidos.", "Error de Entrada", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new propuesto18_cap3();
    }
}
