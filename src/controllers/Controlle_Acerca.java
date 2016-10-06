package controllers;

import views.View_Acerca;
import models.Model_Acerca;

public class Controlle_Acerca {
    View_Acerca view_about;
    Model_Acerca model_About;
    public Controlle_Acerca(View_Acerca viewAbout, Model_Acerca model_About) {
        this.view_about = viewAbout;
        this.model_About = model_About;
        initView();
    }
    
    public void initView(){
        this.view_about.jt_texto.setText(this.model_About.getAcerca_de());
    } 
}
