/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_etapa2_nickbruno;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Yudi
 */
//nome,idade,sexo,cpf,tipo,verif,i;
public class ArquivoTxt {
    
    public static int ler(String caminho,Pessoa p[]){
        int i=0;
        int aux=0;
        try{
            FileReader arq = new FileReader(caminho);
            BufferedReader lerArq = new BufferedReader(arq);
            String linha = "";
            try{
                linha = lerArq.readLine();
                while(linha!=null){
                    String x[] = linha.split("\n");
                    aux++;
                    String c1 = x[i].split(";")[0];
                    String c2 = x[i].split(";")[1];
                    String c3 = x[i].split(";")[2];
                    String c4 = x[i].split(";")[3];
                    String c5 = x[i].split(";")[4];
                    if(c5.contains("risc")){
                        String c6 = x[i].split(";")[5];
                        String c7 = x[i].split(";")[6];
                        String t = x[i].split(";")[7];
                        p[Integer.parseInt(t)] = new Risco(c1,Integer.parseInt(c2),c3, c4, c6, Integer.parseInt(c7));
                        i++;
                    } else {
                        String c6 = linha.split(";")[5];
                        String t = linha.split(";")[6];
                        p[Integer.parseInt(t)] = new ForaRisco(c1,Integer.parseInt(c2),c3, c4, Integer.parseInt(c6));
                        i++;
                    }
                }
                arq.close();
            } catch (IOException ex){
                JOptionPane.showMessageDialog(null, "Erro: Não foi possível ler o arquivo");
            }
        } catch (FileNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Arquivo não encontrado!!!");
        }
        if(aux != 0){
            return aux;
        } else {
            return 0;
        }
    }
    
    public static void gravar(String Caminho, String Texto){
        try{
            FileWriter arq = new FileWriter(Caminho);
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.println(Texto);
            gravarArq.close();
        } catch(IOException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    /*public static void substituir(String Caminho, int h){
        try{
            int i=0;
            FileReader arq = new FileReader(Caminho);
            BufferedReader lerArq = new BufferedReader(arq);
            String linha = "";
            linha = lerArq.readLine();
            ArrayList<String> s = new ArrayList();
            while(linha != null){
                String x[] = linha.split("\n");
                if(x[i].contains(Integer.toString(h))){
                    i++;
                } else {
                    s.add(x[i]);
                    i++;
                }
            }
            arq.close();
            lerArq.close();
            
            FileWriter arq2 = new FileWriter(Caminho, true);
            arq2.close();
            
            FileWriter fw = new FileWriter(Caminho);
            BufferedWriter gravarArq = new BufferedWriter(fw);
            
            for(int j=0;j<s.size();j++){
                gravarArq.write(s.get(i));
            }
            gravarArq.close();
            fw.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,"Erro de Substituição:"+ex);
        }
    }*/
    
}
