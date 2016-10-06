
package main;

import models.*;
import views.*;
import controllers.*;
import javax.swing.JPanel;
public class Main {
 
    
    public static void main(String[] args) {
        
        Model_Acerca model_About = new Model_Acerca();
        View_Acerca viewAcerca = new View_Acerca();
        Controlle_Acerca controllerAbout = new Controlle_Acerca(viewAcerca, model_About);
        
        
        Model_Convercion model_Num = new Model_Convercion();
        View_Convercion viewSisNum = new View_Convercion();
        Controlle_Conversion controllerSisNum = new Controlle_Conversion(viewSisNum, model_Num);
        
         Model_Cifrado cifrado = new Model_Cifrado();
         View_Cifrado viewcifrado = new View_Cifrado();
         Controller_Cifrado controller = new Controller_Cifrado(cifrado, viewcifrado);
         
         Model_Imc mv = new Model_Imc();
         View_Imc vi = new View_Imc();
         Controller_Imc controller_Imc = new Controller_Imc(mv, vi);
         
         Model_Operaciones model_Operaciones = new Model_Operaciones();
         View_Operaciones vo = new View_Operaciones();
         Controller_Operaciones co = new Controller_Operaciones(model_Operaciones, vo);
        
        JPanel  views[] = new JPanel [5];
        views [0] = viewAcerca;
        views[1] = viewSisNum;
        views [2] = viewcifrado;
        views  [3] = vi;
        views [4] = vo;
        View_Main main = new View_Main();
        Controlle_Main controle = new Controlle_Main(main, views);
         
     
    }
    
    
}
