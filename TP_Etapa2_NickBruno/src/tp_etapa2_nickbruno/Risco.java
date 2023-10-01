/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_etapa2_nickbruno;

import java.io.Serializable;

/**
 *
 * @author Yudi
 */
public class Risco extends Pessoa implements Serializable{

    private String tipo;
    private boolean histoCont;

    public Risco(String n, int i, String s, String c, String tip, int verif) {
        super(n, i, s, c);
        tipo = tip;
        histoCont = verif == 1;
        flag = "risc";
    }

    @Override
    protected String status() {
        super.status();
        if (histoCont == true) {
            return("Nome: "+nome+"\r\nIdade: "+idade+"\r\nSexo: "+sexo+"\r\nCPF: "+cpf+"\r\nRISCO\r\nTipo: " + tipo + "\r\nHistórico de Contágio: Houve\r\n");
        } else {
            return("Nome: "+nome+"\r\nIdade: "+idade+"\r\nSexo: "+sexo+"\r\nCPF: "+cpf+"\r\nRISCO\r\nTipo: " + tipo + "\r\nHistórico de Contágio: Não Houve\r\n");
        }
    }

    /*protected void ajuste(int opc, Pessoa p, String h) {
        super.ajuste(opc,p, h);
        int opc2;
        Scanner ler1 = new Scanner(System.in);
        if (opc == 5) {
            System.out.println("\nAjuste do Tipo: ");
            tipo = ler1.nextLine();
        } else if (opc == 6) {
            System.out.println("\nMudar Histórico? (1-Sim\2-Não)\n");
            opc2 = ler1.nextInt();
            opc2 = ler1.nextInt();
            if (opc2 == 1) {
                histoCont = histoCont != true;
            }
        }
    }*/
    @Override
    public String getTipo(){
        return tipo;
    }
    }
