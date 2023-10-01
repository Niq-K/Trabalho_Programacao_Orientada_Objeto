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
public abstract class Pessoa implements Serializable{
    protected String nome;
    protected int idade;
    protected String cpf;
    protected String sexo;
    protected String flag;
    
    public Pessoa (String n, int i, String s, String c){
        this.nome = n;
        this. idade = i;
        this.sexo = s;
        this.cpf = c;
    }
    
    protected String status (){
        return null;
    }
    /*protected void ajuste(int opc, Pessoa p, String c){
        int id;
        String n, s;
        Scanner ler1 = new Scanner(System.in);
        Scanner ler2 = new Scanner(System.in);
        switch(opc){
            case 1:
                System.out.println("\nEntre com o outro Nome: ");
                p.nome = ler2.nextLine();
                break;
            case 2:
                System.out.println("\nEntre com outra Idade: ");
                id = ler1.nextInt();
                if((id > 100 || id < 1)){
                    System.out.println("Número Inválido!!!\n");
                    do{
                        id = ler1.nextInt();
                    }while(id > 100 || id < 1);
                }
                else{
                    System.out.println("Idade Trocada com sucesso!!!\n\n");
                }
                p.idade = id;
                break;
            case 3:
                System.out.println("\nEntre com outra Opção(f / m): ");
                p.sexo = ler2.nextLine();
                break;
            case 4:
                p.setCpf(c);
                break;       
            default:
                break;
        }
    }*/
    protected String getCpf(){
        return this.cpf;
    }
    /*protected void setCpf(String c){
        this.cpf = c;
    }*/

    protected String getTipo() {
        return null;
    }
}
