package Taller_no_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class resuelto_7_cap4 extends JFrame {

    private JTextField campoA, campoB;
    private JTextArea areaResultado;

    public resuelto_7_cap4(){
        setTitle("Mayor que");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(7, 2));
        
        add(new JLabel("A:"));
        campoA = new JTextField();
        add(campoA);

        add(new JLabel("B:"));
        campoB = new JTextField();
        add(campoB);

        JButton botonCalcular = new JButton("Calcular cual es mayor");
        botonCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mayor_que();
            }
        });
        add(botonCalcular);

        areaResultado = new JTextArea();
        areaResultado.setEditable(false);
        add(new JScrollPane(areaResultado));

        setVisible(true);

    }

    public void mayor_que(){
        try {
            double A = Double.parseDouble(campoA.getText());
            double B = Double.parseDouble(campoB.getText());
            String frase;
            if (A > B){
                frase = "A es mayor que B";
            }
            else{
                frase = "A es menor que B";
            }

            areaResultado.setText(frase);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese datos válidos.", "Error de Entrada", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String args[]){
        new resuelto_7_cap4();
    }
}
