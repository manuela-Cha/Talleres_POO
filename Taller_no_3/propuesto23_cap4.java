package Taller_no_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class propuesto23_cap4 extends JFrame {
    public static void main(String args[]){
        new propuesto23_cap4();
    }
    private JTextField campoA, campoB, campoC;
    private JTextArea areaResultado;
    public propuesto23_cap4(){
        setTitle("Ecuacion");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(7, 2));
        
        add(new JLabel("Numero A:"));
        campoA = new JTextField();
        add(campoA);
        
        add(new JLabel("Numero B:"));
        campoB = new JTextField();
        add(campoB);

        add(new JLabel("Numero C:"));
        campoC = new JTextField();
        add(campoC);

        JButton botonCalcular = new JButton("Soluciones");
        botonCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ecuacion();
            }
        });
        add(botonCalcular);

        areaResultado = new JTextArea();
        areaResultado.setEditable(false);
        add(new JScrollPane(areaResultado));
        setVisible(true);
    }
    public void ecuacion(){
        Double A = Double.parseDouble(campoA.getText());
        Double B = Double.parseDouble(campoB.getText());
        Double C = Double.parseDouble(campoC.getText());
        double discriminante = B * B - 4 * A * C;
        try{
            if (discriminante > 0) {
                double x1 = (-B + Math.sqrt(discriminante)) / (2 * A);
                double x2 = (-B - Math.sqrt(discriminante)) / (2 * A);
                areaResultado.setText("Las soluciones son x1 = " + x1 + " y x2 = " + x2);
            } else if (discriminante == 0) {
                double x = -B / (2 * A);
                areaResultado.setText("La solución es x = " + x);
            } else {
                double parteReal = -B / (2 * A);
                double parteImaginaria = Math.sqrt(-discriminante) / (2 * A);
                areaResultado.setText("Las soluciones son x1 = " + parteReal + " + " + parteImaginaria + "i y x2 = " + parteReal + " - " + parteImaginaria + "i");       
            }
        }
        catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese datos válidos.", "Error de Entrada", JOptionPane.ERROR_MESSAGE);
        }
    }
}
