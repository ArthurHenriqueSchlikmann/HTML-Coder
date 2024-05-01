package com.arthur.library;

import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import static com.sitesdoarthur.teste.PrimaryController.valorr;

/**
 * 
 * @author arthur
 */

public class SaveLoad {
    
    public boolean ler = false;
    
    public void salvar() throws IOException {
        ler = false;        if(ler == false) {
            String sav = JOptionPane.showInputDialog(null ,"Informe o nome e local de salvamento", "Salvar", JOptionPane.WARNING_MESSAGE);
            String valor = valorr;
            System.out.println(valor);
            if(!"null".equals(sav)) {
                try (FileWriter arquivo = new FileWriter(sav)) {
                    PrintWriter gravArq = new PrintWriter(arquivo);
                    gravArq.printf(valor);
                    arquivo.close();
                }
            }
        }
    }
    
    public String open() throws IOException {
        ler = true;
        String valor = "";
        String opn = JOptionPane.showInputDialog(null, "Informe o caminho e o arquivo para abrir", "Abrir", JOptionPane.WARNING_MESSAGE);
        if(ler == true) {
            FileInputStream stream = new FileInputStream(opn);
            InputStreamReader reader = new InputStreamReader(stream);
            BufferedReader br = new BufferedReader(reader);
            String linha = br.readLine();
            while(linha != null) {
                valor = valor + "\n" + linha;
                linha = br.readLine();
            }
        }
    return valor;
    }
    
}
