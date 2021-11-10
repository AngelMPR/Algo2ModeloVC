/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.OperacionSuma;
import Vista.frmSuma;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.JOptionPane;


public class ControladorfrmOperaciones {
    
    private OperacionSuma modelo;
   
    private frmSuma vista;

    public ControladorfrmOperaciones(OperacionSuma modelo, frmSuma vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.vista.btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.dispose();
            }
        });
        
        this.vista.btnSumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modelo.setNum1(Integer.valueOf(vista.txtNum1.getText()));
                modelo.setNum2(Integer.valueOf(vista.txtNum2.getText()));
                modelo.sumar();
                JOptionPane.showMessageDialog(vista,"La suma es: "+ modelo);
                vista.txtNum1.setText("     ");
                vista.txtNum2.setText("     ");
            }
        });
    }
    public void iniciar(){
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
    }
    
    
    
    
}
