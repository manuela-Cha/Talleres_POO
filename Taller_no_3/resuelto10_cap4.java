package Taller_no_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class resuelto10_cap4 extends JFrame{

    private JTextField campoNumeroInscripcion, campoNombre, campoPatrimonio, campoEstrato;
    private JTextArea areaResultado;

    public resuelto10_cap4 (){
        setTitle("Pago Matricula");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(7, 2));
        
        add(new JLabel("Numero inscripcion:"));
        campoNumeroInscripcion = new JTextField();
        add(campoNumeroInscripcion);
        
        add(new JLabel("Nombre:"));
        campoNombre = new JTextField();
        add(campoNombre);

        add(new JLabel("Patrimonio:"));
        campoPatrimonio = new JTextField();
        add(campoPatrimonio);

        add(new JLabel("Estrato social:"));
        campoEstrato = new JTextField();
        add(campoEstrato);

        JButton botonCalcular = new JButton("Debe pagar:");
        botonCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pago_matricula();
            }
        });
        add(botonCalcular);
        areaResultado = new JTextArea();
        areaResultado.setEditable(false);
        add(new JScrollPane(areaResultado));
        setVisible(true);

    }
    
    public void pago_matricula(){
        Double pago_matricula = 50000.0;
        Double patrimonio = Double.parseDouble(campoPatrimonio.getText());
        Double estrato_social = Double.parseDouble(campoEstrato.getText());
        int numero_inscripcion = Integer.parseInt(campoNumeroInscripcion.getText());
        String nombre = campoNombre.getText();
        try {
            if (patrimonio > 2000000 && estrato_social > 3){
                pago_matricula = pago_matricula + 0.03*patrimonio;
            }
            String frase = "EL ESTUDIANTE CON NUMERO DE INSCRIPCION: " + numero_inscripcion + "\nNOMBRE: " + nombre + "\nDEBE PAGAR:"+ pago_matricula;
            areaResultado.setText(frase);
        }
        catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese datos válidos.", "Error de Entrada", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String args[]){
        new resuelto10_cap4();
    }
}
