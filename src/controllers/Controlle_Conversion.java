package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.Model_Convercion;
import views.View_Convercion;

public class Controlle_Conversion implements ActionListener{

    public  View_Convercion view_operaciones;
    public  Model_Convercion model_operciones;

    public Controlle_Conversion(View_Convercion view_operaciones, Model_Convercion model_operciones) {
        this.view_operaciones = view_operaciones;
        this.model_operciones = model_operciones;
        
        this.view_operaciones.jbtn_aceptar.addActionListener(this);
        
        int_view();
    }

    
    public void int_view(){
        model_operciones.getNumero();
        this.view_operaciones.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
     if (e.getSource() ==  this.view_operaciones.jbtn_aceptar){
         
         if(view_operaciones.jcbsisnum.getSelectedItem().equals("Binario")){
             Binario();
         }
         else if(view_operaciones.jcbsisnum.getSelectedItem().equals("Octal")){
             Octal();
         }
         else if(view_operaciones.jcbsisnum.getSelectedItem().equals("Hexadecimal")){
             Hexadecimal();
         }
     }
    }
    
     public void Binario(){
        Integer numero = Integer.parseInt(view_operaciones.jtx_uno.getText());
        String resultado = numero.toBinaryString(numero);
        model_operciones.setNumero(numero);
        model_operciones.setResultado(resultado);
        view_operaciones.jtx_dos.setText(resultado);
    } 
     
     public void Octal(){
        Integer numero = Integer.parseInt(view_operaciones.jtx_uno.getText());
        String resultado = numero.toOctalString(numero);
        model_operciones.setNumero(numero);
        model_operciones.setResultado(resultado);
        view_operaciones.jtx_dos.setText(resultado);
    } 
     
     
     public void Hexadecimal(){
       Integer numero = Integer.parseInt(view_operaciones.jtx_uno.getText());
        String resultado = numero.toHexString(numero);
        model_operciones.setNumero(numero);
        model_operciones.setResultado(resultado);
        view_operaciones.jtx_dos.setText(resultado);
    } 
    
    
}
