/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import views.View_Imc;
import models.Model_Imc;

public class Controller_Imc implements ActionListener{
    private Model_Imc model;
    private View_Imc view;
    public Controller_Imc(Model_Imc model, View_Imc view)
    {
     this.model = model;
     this.view = view;

     this.view.jbtn_calcular.addActionListener(this);
     this.view.jt_nombre.addKeyListener(solo_Letras);
     this.view.jt_edad.addKeyListener(solo_Numeros);
     this.view.jt_peso.addKeyListener(solo_Numeros);
     this.view.jt_altura.addKeyListener(solo_Numeros);
     init_view();
    }
    
    public void  init_view (){
        boolean bloque = false;
         view.jbtn_calcular.setEnabled(bloque);
        this.view.jt_altura.setText("" + this.model.getAltura());
        this.view.jt_peso.setText("" + this.model.getPeso());
        this.view.jt_nombre.setText(""+this.model.getNombre()) ;
        this.view.jc_sexo.setName(""+this.model.getSexo());
        this.view.jt_edad.setText(""+ this.model.getEdad());
        this.view.jp_resultados.setVisible(false);
        this.view.setVisible(true);   
    }
  
    private void calcula(){
        double altura = Double.parseDouble(this.view.jt_altura.getText());
        double peso = Double.parseDouble(this.view.jt_peso.getText());
        int edad = Integer.valueOf(this.view.jt_edad.getText());
        this.model.setAltura(altura);
        this.model.setPeso(peso);
        this.model.setEdad(edad);
    }
    
  
    private void asigna_resultados(){
        String sexo = String.valueOf(this.view.jc_sexo.getSelectedItem());
        this.view.jt_nombre2.setText(""+ model.getNombre());
        this.view.jt_sexo2.setText(sexo);
        this.view.jt_edad2.setText(""+model.getEdad());
        this.view.jt_peso2.setText(""+model.getPeso());
        this.view.jt_altura2.setText(""+model.getAltura());
        this.view.jt_imc.setText(""+ this.model.IMC());
    }
    
    public void condiciones(){
        if (model.getEdad() >= 8  && model.getEdad() <= 18 && model.IMC()>= 15  && model.IMC() <= 19){
                this.view.jt_estado.setText("Saludable");
        }
        else if (model.getEdad() >= 19  && model.getEdad() <= 24 && model.IMC()>= 19  && model.IMC() <= 24){
                this.view.jt_estado.setText("Saludable");
        }
        else  if (model.getEdad() >= 25  && model.getEdad() <= 34 && model.IMC()>= 20  && model.IMC() <= 25){
                this.view.jt_estado.setText("Saludable");
        }
        else  if (model.getEdad() >= 35  && model.getEdad() <= 44 && model.IMC()>= 21  && model.IMC() <= 26){
                this.view.jt_estado.setText("Saludable");
        }
        else  if (model.getEdad() >= 45  && model.getEdad() <= 54 && model.IMC()>= 22  && model.IMC() <= 27){
                this.view.jt_estado.setText("Saludable");
        }
        else  if (model.getEdad() >= 55  && model.getEdad() <= 64 && model.IMC()>= 23  && model.IMC() <= 28){
                this.view.jt_estado.setText("Saludable");
        }
        else  if (model.getEdad() >= 65  && model.IMC()>= 24  && model.IMC() <= 29){
                this.view.jt_estado.setText("Saludable");
        }
        else if (model.getEdad() >= 8  && model.IMC()<= 15  && model.IMC() > 19){
                this.view.jt_estado.setText("Sobre peso");
        }
        else if(model.getEdad() >= 19  && model.getEdad() <= 24 && model.IMC()> 24) {
          this.view.jt_estado.setText("Sobre peso");  
        }
        else  if (model.getEdad() >= 25  && model.getEdad() <= 34 &&  model.IMC() > 25){
                this.view.jt_estado.setText("Sobre peso");
        }
        else  if (model.getEdad() >= 35  && model.getEdad() <= 44 &&model.IMC() > 26){
                this.view.jt_estado.setText("Sobre peso");
        }
        else  if (model.getEdad() >= 45  && model.getEdad() <= 54 && model.IMC() > 27){
                this.view.jt_estado.setText("Sobre peso");
        }
        else  if (model.getEdad() >= 55  && model.getEdad() <= 64 && model.IMC() > 28){
                this.view.jt_estado.setText("Sobre peso");
        }
        else  if (model.getEdad() >= 65  &&  model.IMC() > 29){
                this.view.jt_estado.setText("Sobre peso");
        }
        else if (model.getEdad() >= 8  && model.IMC()<= 15  && model.IMC() < 19){
                this.view.jt_estado.setText("Te falta peso");
        }
        else if(model.getEdad() >= 19  && model.getEdad() <= 24 && model.IMC()< 19) {
          this.view.jt_estado.setText("Te falta peso");  
        }
        else  if (model.getEdad() >= 25  && model.getEdad() <= 34 &&  model.IMC() < 20){
                this.view.jt_estado.setText("Te falta peso");
        }
        else  if (model.getEdad() >= 35  && model.getEdad() <= 44 &&model.IMC() < 21){
                this.view.jt_estado.setText("Te falta peso");
        }
        else  if (model.getEdad() >= 45  && model.getEdad() <= 54 && model.IMC() < 21){
                this.view.jt_estado.setText("Te falta peso");
        }
        else  if (model.getEdad() >= 55  && model.getEdad() <= 64 && model.IMC() < 23){
                this.view.jt_estado.setText("Te falta peso");
        }
        else  if (model.getEdad() >= 65  &&  model.IMC() < 24){
                this.view.jt_estado.setText("Te falta peso");
        }
    }
    
   

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == view.jbtn_calcular) {
            calcula();
            condiciones();
            asigna_resultados();
            this.view.jp_resultados.setVisible(true);
            
        }
    }
    
     private  KeyListener solo_Numeros = new KeyListener(){
        @Override
        public void keyTyped(KeyEvent e) {
         char caracter = e.getKeyChar();
                if(((caracter < '0') || (caracter > '9')) && (caracter != KeyEvent.VK_BACK_SPACE) && (caracter !='.')){
                e.consume();
                }
              
        }

        @Override
        public void keyPressed(KeyEvent e) {
            
        }

        @Override
        public void keyReleased(KeyEvent e) {
           view.jbtn_calcular.setEnabled(
                   view.jt_altura.getText().length() != 0 &&
                   view.jc_sexo.getSelectedIndex() != 0 &&
                   view.jt_nombre.getText().length() != 0 &&
                   view.jt_edad.getText().length() != 0 &&
                   view.jt_peso.getText().length() != 0
           );
        }
            
    };
     
     private  KeyListener solo_Letras = new KeyListener(){
        @Override
        public void keyTyped(KeyEvent e) {
           char c= e.getKeyChar();
             if (c<'A' || c>'Z'){
               if (c<'a' || c>'z')
             e.consume();
             }
        }

        @Override
        public void keyPressed(KeyEvent e) {
        }

        @Override
        public void keyReleased(KeyEvent e) {
        }
        };
     
      

}
