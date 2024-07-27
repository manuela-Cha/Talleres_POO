package Taller_no_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class propuesto22_cap4 extends JFrame {

    private JTextField campoSalarioHora, campoNombre, campoHorasTrabajadasMes;
    private JTextArea areaResultado;

    public propuesto22_cap4() {
        setTitle("Salario");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));

        add(new JLabel("Salario por hora:"));
        campoSalarioHora = new JTextField();
        add(campoSalarioHora);

        add(new JLabel("Nombre:"));
        campoNombre = new JTextField();
        add(campoNombre);

        add(new JLabel("Horas trabajadas al mes:"));
        campoHorasTrabajadasMes = new JTextField();
        add(campoHorasTrabajadasMes);

        JButton botonCalcular = new JButton("Calcular Salario");
        botonCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                salario();
            }
        });
        add(botonCalcular);

        areaResultado = new JTextArea();
        areaResultado.setEditable(false);
        add(new JScrollPane(areaResultado));

        setVisible(true);
    }

    public void salario() {
        try {
            double salarioPorHora = Double.parseDouble(campoSalarioHora.getText());
            double horasTrabajadasMes = Double.parseDouble(campoHorasTrabajadasMes.getText());
            String nombre = campoNombre.getText();
            
            double salario = salarioPorHora * horasTrabajadasMes;
            String frase;
            if (salario > 450000) {
                frase = "Nombre: " + nombre + "\nSalario: " + salario;
            } else {
                frase = "Nombre: " + nombre;
            }

            areaResultado.setText(frase);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese datos válidos.", "Error de Entrada", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new propuesto22_cap4();
    }
}
