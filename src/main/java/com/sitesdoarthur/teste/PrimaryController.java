package com.sitesdoarthur.teste;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import com.arthur.library.SaveLoad;

public class PrimaryController {
    
    @FXML
    private TextArea editor;
    private MenuItem close;
    private MenuItem save;
    private MenuItem open;
    
    public static String valorr = null;
    public static boolean ler = false;
    
    @FXML
    private void switchToSecondary() throws IOException {
        System.exit(0);
    }   
    
    @FXML
    private void abre() throws IOException {
        SaveLoad a = new SaveLoad();
        String valor = a.open();
        editor.setText(valor);
    }    
    
    @FXML
    private void salvar() throws IOException {
        SaveLoad s = new SaveLoad();
        s.salvar();
        }
    
    @FXML
    private void opnCoder() {
        Menu m = new Menu();
        m.init();
        editor.setText(valorr);
    }
    
}