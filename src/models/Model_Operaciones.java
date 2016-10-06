package models;
import views.View_Operaciones;
/**
 *
 * @author Lenovo
 */
public class Model_Operaciones {
     private View_Operaciones view;
     
      private double num1 = 0;
      private double num2 = 0;
      private double resultado = 0;


    public double getResultado() {
        return resultado;
    }
    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public double getNume1() {
        return num1;
    }
    public double getNum2() {
        return num2;
    }
    public void setNumeros (double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public double suma(){
     return this.num1+ this.num2;
    }
    
    public double resta(){
        return this.num1-this.num2;
    }
    
    public double multiplicacion(){
        return this.num1* this.num2;
    }
    
    public double division(){
      return this.num1/this.num2;  
    }
    
    public double modulo(){
       return this.num1 %this.num2; 
    }
}
