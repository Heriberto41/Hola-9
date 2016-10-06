package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import models.Model_Cifrado;
import views.View_Cifrado;

public class Controller_Cifrado implements ActionListener{
    private Model_Cifrado model;
    private View_Cifrado view;
    
    public Controller_Cifrado (Model_Cifrado model, View_Cifrado view){
        this.model=model;
        this.view=view;
      
        this.view.setVisible(true);
        this.view.jbtn_aceptar.addActionListener(this);
    }
    
   
    public void cifra_texto(){
        String letras= this.view.jt_texto.getText();
         char array[]=letras.toCharArray();
        
        for (int i = 0; i < array.length; i++) {
            array[i]=(char)(array[i]+(char)3);
        }
        String cifrar = String.valueOf(array);
        this.view.jt_texto.setText(""+cifrar);
      
    }
    
    public void decifra_texto(){
     String letras= this.view.jt_texto.getText();
         char array2[]=letras.toCharArray();
        
        for (int i = 0; i < array2.length; i++) {
            array2[i]=(char)(array2[i]-(char)3);
        }
       String descifrar=String.valueOf(array2);
        this.view.jt_texto.setText(""+ descifrar);
        
    }
            
  
    @Override
    public void actionPerformed(ActionEvent ae) {
      if(ae.getSource()==view.jbtn_aceptar){
          if(this.view.jr_cifrar.getModel().isSelected())
          {
              cifra_texto();
          }else
          {
              decifra_texto();
          }
      }
       
    }
           
}
