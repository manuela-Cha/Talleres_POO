package Taller_no_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Circulo extends JFrame{

    private JTextArea areaResultadoArea, areaResultadoPerimetro;

    int radio; 
    
    Circulo(int radio) {
        this.radio = radio;

        setTitle("Círculo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(7, 2));

        JButton botonCalcularArea = new JButton("Calcular Area");
        botonCalcularArea.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcularArea();
            }
        });

        JButton botonCalcularPerimetro = new JButton("Calcular Perímetro");
        botonCalcularPerimetro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcularPerimetro();
            }
        });

        add(botonCalcularArea);
        areaResultadoArea = new JTextArea();
        areaResultadoArea.setEditable(false);
        add(new JScrollPane(areaResultadoArea));

        add(botonCalcularPerimetro);
        areaResultadoPerimetro = new JTextArea();
        areaResultadoPerimetro.setEditable(false);
        add(new JScrollPane(areaResultadoPerimetro));

        setVisible(true);
    
    }
        
    void calcularArea() {
        Double resultado =  Math.PI*Math.pow(radio,2);
        areaResultadoArea.setText("" + resultado);
        
    }
        
    void calcularPerimetro() {
        Double resultado = 2*Math.PI*radio;
        areaResultadoPerimetro.setText("" + resultado);
    }
}

