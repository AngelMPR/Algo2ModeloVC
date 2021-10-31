/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author PC
 */
public class OperacionSuma {
    
    private int num1;
    private int num2;
    private int suma;

    public OperacionSuma(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        this.sumar();
    }

    public OperacionSuma() {
    }
    
    public void sumar(){
        this.suma=this.num1+this.num2;
    }
    
    
    
    @Override
    public String toString() {
        return Integer.toString(suma);
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    
}
