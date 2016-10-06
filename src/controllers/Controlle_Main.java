package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import views.View_Main;

public class Controlle_Main implements ActionListener{
   View_Main viewMain;
   
   JPanel views[];
   

    public Controlle_Main(View_Main viewMain, JPanel []  views) {
   
        this.viewMain = viewMain;
        this.views = views;
        this.viewMain.jmi_convercion.addActionListener(this);
        this.viewMain.jmi_acerca.addActionListener(this);
        this.viewMain.jmi_cifrado.addActionListener(this);
        this.viewMain.jmi_imc.addActionListener(this);
        this.viewMain.jmi_operaciones.addActionListener(this);
        initView();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == viewMain.jmi_convercion)
            jmi_conversionActionPerformed();
        else if(e.getSource() == viewMain.jmi_acerca)
            jmi_acercaActionPerformed();
        else if(e.getSource() == viewMain.jmi_cifrado)
            jmi_cifradoActionPerformed();
        else if(e.getSource() == viewMain.jmi_imc)
            jmi_ImcActionPerformed();
        else if(e.getSource() == viewMain.jmi_operaciones)
           jmi_OperacionActionPerformed();
    }

    public void jmi_acercaActionPerformed(){
        this.viewMain.setContentPane(views [0]);
        this.viewMain.revalidate();
        this.viewMain.repaint();
    }
     public void jmi_conversionActionPerformed(){
        this.viewMain.setContentPane(views [1]);
        this.viewMain.revalidate();
        this.viewMain.repaint();
    }
    
     public void jmi_cifradoActionPerformed(){
        this.viewMain.setContentPane(views [2]);
        this.viewMain.revalidate();
        this.viewMain.repaint();
    }
    
     public void jmi_ImcActionPerformed(){
        this.viewMain.setContentPane(views [3]);
        this.viewMain.revalidate();
        this.viewMain.repaint();
    }
      public void jmi_OperacionActionPerformed(){
        this.viewMain.setContentPane(views [4]);
        this.viewMain.revalidate();
        this.viewMain.repaint();
    }
    private void initView(){
        this.viewMain.setTitle("Operaciones");
        this.viewMain.setLocationRelativeTo(null);
        this.viewMain.setVisible(true);
    }
 
}
