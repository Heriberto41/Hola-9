/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;


public class Model_Imc {

 private double peso;
 private double altura;
 private String Sexo;
 private String Nombre = "Julio";
 private int Edad ;

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }


    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
       
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    
    public String getSexo(){
       return Sexo;
    }
    
    public void setSexo (String Sexo){
        this.Sexo = Sexo;
    }


    public double IMC(){
        double altura = this.altura * this.altura;
        double imc = this.peso / altura;
        return imc;
    } 
    

}
