package controllers;

import views.View_Operaciones;
import models.Model_Operaciones;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class Controller_Operaciones implements ActionListener {

    private Model_Operaciones model;
    private View_Operaciones view;

    private MouseListener mouseListener = new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {
            if (e.getSource() == view.btn_increment) {
                suma();
            }
        }

        @Override
        public void mousePressed(MouseEvent e) {
            if (e.getSource() == view.btn_multiplicar) {
                multiplicacion();
            }
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            if (e.getSource() == view.btn_decrement) {
                resta();
            }
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            if (e.getSource() == view.btn_dividir) {
                division();
            }
        }

        @Override
        public void mouseExited(MouseEvent e) {
            if (e.getSource() == view.btn_modulo) {
                modulo();
            }
        }

    };
    
    private KeyListener keyType = new KeyListener(){
        @Override
        public void keyTyped(KeyEvent e) {
           char c= e.getKeyChar();
             if (c<'1' || c>'9'){
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

    public Controller_Operaciones(Model_Operaciones model, View_Operaciones view) {
        this.model = model;
        this.view = view;

        this.view.btn_decrement.addMouseListener(mouseListener);
        this.view.btn_dividir.addMouseListener(mouseListener);
        this.view.btn_increment.addMouseListener(mouseListener);
        this.view.btn_modulo.addMouseListener(mouseListener);
        this.view.btn_multiplicar.addMouseListener(mouseListener);
        this.view.jtx_numero1.addKeyListener(keyType);
        this.view.jtx_numero2.addKeyListener(keyType);
    }

    public void int_view() {
        this.view.jtx_numero1.setText("" + this.model.getNume1());
        this.view.jtx_numero2.setText("" + this.model.getNum2());
        this.view.jtx_resultado.setText("" + this.model.getResultado());
        this.view.setVisible(true);
    }

    
    private void suma() {
        double num1 = Double.parseDouble(this.view.jtx_numero1.getText());
        double num2 = Double.parseDouble(this.view.jtx_numero2.getText());
        this.model.setNumeros(num1, num2);
        this.view.jtx_resultado.setText("" + this.model.suma());
    }

    private void resta() {
        double num1 = Double.parseDouble(this.view.jtx_numero1.getText());
        double num2 = Double.parseDouble(this.view.jtx_numero2.getText());
        this.model.setNumeros(num1, num2);
        this.view.jtx_resultado.setText("" + this.model.resta());
    }

    private void division() {
        double num1 = Double.parseDouble(this.view.jtx_numero1.getText());
        double num2 = Double.parseDouble(this.view.jtx_numero2.getText());
        this.model.setNumeros(num1, num2);
        this.view.jtx_resultado.setText("" + this.model.division());
    }

    private void multiplicacion() {
        double num1 = Double.parseDouble(this.view.jtx_numero1.getText());
        double num2 = Double.parseDouble(this.view.jtx_numero2.getText());
        this.model.setNumeros(num1, num2);
        this.view.jtx_resultado.setText("" + this.model.multiplicacion());
    }

    private void modulo() {
        double num1 = Double.parseDouble(this.view.jtx_numero1.getText());
        double num2 = Double.parseDouble(this.view.jtx_numero2.getText());
        this.model.setNumeros(num1, num2);
        this.view.jtx_resultado.setText("" + this.model.modulo());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
