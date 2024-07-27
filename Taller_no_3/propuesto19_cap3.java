package Taller_no_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class propuesto19_cap3 extends JFrame {

    private JTextField campoLado;
    private JTextArea areaResultado;

    public propuesto19_cap3(){
        setTitle("triangulo");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(7, 2));
        
        add(new JLabel("Lado:"));
        campoLado = new JTextField();
        add(campoLado);


        JButton botonCalcular = new JButton("Area, perimetro y altura");
        botonCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                triangulo();
            }
        });
        add(botonCalcular);

        areaResultado = new JTextArea();
        areaResultado.setEditable(false);
        add(new JScrollPane(areaResultado));

        setVisible(true);

    }

    public void triangulo (){
        try{
            double lado = Double.parseDouble(campoLado.getText()) ;
            double perimetro = lado*3;
            double altura = lado * Math.sqrt(3/2);
            double area = (lado*lado)/2;

            String frase = "Altura: "+ altura + "\nPerimetro: "+ perimetro + "\nArea del triangulo: "+ area;
            
            areaResultado.setText(frase);
        }
        catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese datos válidos.", "Error de Entrada", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String args[]){
        new propuesto19_cap3();
    }
}