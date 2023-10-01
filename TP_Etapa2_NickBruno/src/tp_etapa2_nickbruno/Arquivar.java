/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_etapa2_nickbruno;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Yudi
 */
public class Arquivar{

    public void escrever(String nomeArq, int i, Pessoa p[]) {
        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(nomeArq));
            /*for (int h = 0; h < i; h++) {
                os.writeObject(p[h]);
            }*/
            os.writeObject(p);
            os.close();
        } catch (IOException erro) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro na escrita dos dados " + erro);
        }
    }
    public void ler(String nomeArq, int h, int aux[], Pessoa p[]) {
        try {
            FileInputStream arq = new FileInputStream(nomeArq);
            ObjectInputStream is = new ObjectInputStream(arq);
            for (int i = 0; i < h; i++) {
                if(aux[i] == 1){
                   p[i] = (Risco) is.readObject();
                } else {
                    p[i] = (ForaRisco) is.readObject();
                }
            }
            is.close();
        } catch (IOException erro) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro na leitura dos dados :" + erro );
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Arquivar.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }
}
