/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.pt.calculadora.backend;


public class BackEnd_Code {
    
    private double Numero_01 =0 ;
    private double Numero_02 =0 ;

    
    //////////////// Atributos ////////////////
    
    public double getNumero_01() {
        return Numero_01;
    }

    public void setNumero_01(double Numero_01) {
        this.Numero_01 = Numero_01;
    }

    public double getNumero_02() {
        return Numero_02;
    }

    public void setNumero_02(double Numero_02) {
        this.Numero_02 = Numero_02;
    }
        
    //////////////// Metódos ////////////////
    
    public double OpSomar(){
    //Coersão de Double para Float - Economiza Memoria
    return (double)(Numero_01+Numero_02);        
    }
    
    public double OpSuntrair(){
    return (double)(Numero_01-Numero_02);        
    }
    
    public double OpMultiplicar(){
    return (double)(Numero_01*Numero_02);        
    }
    
    public double OpDividir (double OpDividir) throws Exception{

        if(Numero_01 == 0) throw new Exception ("Divisão por 0, redigite !");
           this.Numero_01 = Numero_01;
       
        if(Numero_02 == 0) throw new Exception ("Divisão por 0, redigite !");
           this.Numero_02 = Numero_02;   
             
           return (double)(Numero_01/Numero_02);        
    }    
    
    public double OpRaizQuadrada (double OpRaizQuadrada) throws Exception{
        
        if(Numero_01 < 0) throw new Exception ("Raiz Quadrada Negativa, redigite !");
           this.Numero_01 = Numero_01;       
            
           return (double)(Math.sqrt(Numero_01));        
    }
    
    public double OpPontecializar (){                        
            return (double)(Math.pow(Numero_01, Numero_02));        
    }
    
    public double OpRadiar (double OpRadiar) throws Exception{
        
        if(Numero_01 < 0) throw new Exception ("Raiz Quadrada Negativa, redigite !");
           this.Numero_01 = Numero_01;                        
        
            return (double)(Math.pow(Numero_01,1.0 / Numero_02));        
    }    
}
