package Taller_no_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TrianguloRectangulo extends JFrame{

    private JTextArea areaResultadoArea, areaResultadoPerimetro, areaResultadoHipotenusa, areaResultadoTipoTriangulo;

    int base; 
    int altura; 
    
    public TrianguloRectangulo(int base, int altura) {

        this.base = base;
        this.altura = altura;

        setTitle("Triángulo Rectángulo");
        setSize(400, 400);
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

        JButton botonCalcularHipotenusa = new JButton("Calcular Hipotenusa");
        botonCalcularHipotenusa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcularHipotenusa();
            }
        });

        JButton botonDeterminarTipoTriangulo = new JButton("Calcular el tipo de triángulo");
        botonDeterminarTipoTriangulo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                determinarTipoTriángulo();
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

        add(botonCalcularHipotenusa);
        areaResultadoHipotenusa = new JTextArea();
        areaResultadoHipotenusa.setEditable(false);
        add(new JScrollPane(areaResultadoHipotenusa));

        add(botonDeterminarTipoTriangulo);
        areaResultadoTipoTriangulo = new JTextArea();
        areaResultadoTipoTriangulo.setEditable(false);
        add(new JScrollPane(areaResultadoTipoTriangulo));
        setVisible(true);
    }
    
    void calcularArea() {
        Double resultado = (double) (base * altura / 2);
        areaResultadoArea.setText("" + resultado);
    }
    void calcularPerimetro() {
        Double resultado =  (base + altura + calcularHipotenusaRetorna()); 
        areaResultadoPerimetro.setText("" + resultado);
    }
    void calcularHipotenusa(){
        Double resultado =  calcularHipotenusaRetorna();
        areaResultadoHipotenusa.setText("" + resultado);
    }
    Double calcularHipotenusaRetorna() {
        Double resultado =  Math.pow(base*base + altura*altura, 0.5);
        return resultado;
        
    }
    void determinarTipoTriángulo() {
        if ((base == altura) && (base == calcularHipotenusaRetorna()) && (altura == calcularHipotenusaRetorna())){
            areaResultadoTipoTriangulo.setText("Es un triángulo equilátero");
        }
        else if ((base != altura) && (base != calcularHipotenusaRetorna()) && (altura != calcularHipotenusaRetorna())){
            areaResultadoTipoTriangulo.setText("Es un triángulo escaleno");
        }
        else {
            System.out.println("Es un triángulo isósceles");
        }
    }
}
