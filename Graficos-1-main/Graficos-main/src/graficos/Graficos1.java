/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;


/**
 *
 * @author soryl
 */
public class Graficos1 extends JFrame {
    
    private JLabel result;
    private JLabel label1;
    private JLabel label2;
    private JLabel labelresta;
    private JTextField dato1;
    private JTextField dato2;
    private JButton btnsumar;
    private JButton btnrestar;
    private JButton btndividir;
    private JButton btnmultiplicar;

    public Graficos1() {
        setTitle("Operaciones Básicas"); //titulo de la ventana
             // alto ancho
        setSize(550, 300); //tamaño de ventana
        setLocationRelativeTo(null); //centrar la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // funcion terminar la ejecución al cerrar la ventana
        //componentes
        result = new JLabel("Resultado");
        label1 = new JLabel("Valor 1");
        label2 = new JLabel("Valor 2");
        labelresta = new JLabel("Valor 1");
                
        dato1 = new JTextField(5);
        dato2 = new JTextField(5);
        btnsumar = new JButton("Sumar");
        btnrestar = new JButton("Restar");
        btndividir = new JButton("Dividir");
        btnmultiplicar = new JButton("Multiplicar");
    }
    
    public void Componentes(Graficos1 ventana){
                 
        ventana.add(label1);
        ventana.add(dato1);
        ventana.add(label2);
        ventana.add(dato2);
        ventana.add(btnsumar);    
        ventana.add(btnrestar);
        ventana.add(btndividir);  
        ventana.add(btnmultiplicar);  
        ventana.add(result);

        btnsumar.addActionListener(new java.awt.event.ActionListener() { //tipo de evento, al dar click en el componente 
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) { // metodo del evento
                btnsumarActionPerformed(evt);
            }
        });   
        
        btnsumar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() { // tipo de evento, al posicionar el maouse sobre el componente
            @Override
            public void mouseMoved(java.awt.event.MouseEvent evt) { // metodo del evento
                btnsumarActionPerformed2(evt);
            }
        });
        
        btnrestar.addActionListener(new java.awt.event.ActionListener() { //tipo de evento, al dar click en el componente 
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) { // metodo del evento
                btnrestarActionPerformed(evt);
            }
        });   
        
        btnrestar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() { // tipo de evento, al posicionar el maouse sobre el componente
            @Override
            public void mouseMoved(java.awt.event.MouseEvent evt) { // metodo del evento
                btnrestarActionPerformed2(evt);
            }
        });
        
        btndividir.addActionListener(new java.awt.event.ActionListener() { //tipo de evento, al dar click en el componente 
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) { // metodo del evento
                btndividirActionPerformed(evt);
            }
        });   
        
        btndividir.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() { // tipo de evento, al posicionar el maouse sobre el componente
            @Override
            public void mouseMoved(java.awt.event.MouseEvent evt) { // metodo del evento
                btndividirActionPerformed2(evt);
            }
        });
        
        btnmultiplicar.addActionListener(new java.awt.event.ActionListener() { //tipo de evento, al dar click en el componente 
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) { // metodo del evento
                btnmultiplicarActionPerformed(evt);
            }
        });   
        
        btnmultiplicar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() { // tipo de evento, al posicionar el maouse sobre el componente
            @Override
            public void mouseMoved(java.awt.event.MouseEvent evt) { // metodo del evento
                btnmultiplicarActionPerformed2(evt);
            }
        });
         
    }
    
    private void btnsumarActionPerformed(ActionEvent evt) {
        int v1 = Integer.parseInt(dato1.getText()); 
        int v2 = Integer.parseInt(dato2.getText());
        int re = v1+v2;
        result.setText("Resultado: " + re);
    }
    
    private void btnsumarActionPerformed2(MouseEvent evt) {
        int v1 = Integer.parseInt(dato1.getText()); 
        int v2 = Integer.parseInt(dato2.getText());
        int re = v1+v2;
        result.setText("Resultado Mouse: " + re);
    }
    
    private void btnrestarActionPerformed(ActionEvent evt) {
        int v1 = Integer.parseInt(dato1.getText()); 
        int v2 = Integer.parseInt(dato2.getText());
        int re = v1-v2;
        result.setText("Resultado Mouse: " + re);
    }
    
    private void btnrestarActionPerformed2(MouseEvent evt) {
        int v1 = Integer.parseInt(dato1.getText()); 
        int v2 = Integer.parseInt(dato2.getText());
        int re = v1-v2;
        result.setText("Resultado Mouse: " + re);
    }
    
    private void btndividirActionPerformed(ActionEvent evt) {
        float v1 = Integer.parseInt(dato1.getText()); 
        float v2 = Integer.parseInt(dato2.getText());
        float re = v1/v2;
        result.setText("Resultado Mouse: " + re);
    }
    
    private void btndividirActionPerformed2(MouseEvent evt) {
        int v1 = Integer.parseInt(dato1.getText()); 
        int v2 = Integer.parseInt(dato2.getText());
        int re = v1/v2;
        result.setText("Resultado Mouse: " + re);
    }
    
    private void btnmultiplicarActionPerformed(ActionEvent evt) {
        float v1 = Integer.parseInt(dato1.getText()); 
        float v2 = Integer.parseInt(dato2.getText());
        float re = v1*v2;
        result.setText("Resultado Mouse: " + re);
    }
    
    private void btnmultiplicarActionPerformed2(MouseEvent evt) {
        int v1 = Integer.parseInt(dato1.getText()); 
        int v2 = Integer.parseInt(dato2.getText());
        int re = v1*v2;
        result.setText("Resultado Mouse: " + re);
    }
    
    public static void main(String[] args) {
        Graficos1 ventana = new Graficos1();
        ventana.setLayout(new FlowLayout(FlowLayout.LEFT,10,20));
        ventana.setBackground(Color.yellow);
        ventana.Componentes(ventana); 
          
        ventana.setVisible(true); //activar la ventana 
             
    }
    
}



