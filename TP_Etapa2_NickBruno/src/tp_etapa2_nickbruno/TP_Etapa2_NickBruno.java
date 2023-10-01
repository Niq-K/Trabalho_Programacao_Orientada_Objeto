/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_etapa2_nickbruno;

import java.util.Scanner;

/**
 *
 * @author Yudi
 */
public class TP_Etapa2_NickBruno {

    /**
     * Nick Bruno Yudi Ishida 20/04/21
     *
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        new Menu().setVisible(true);
        /*Pessoa p[] = new Pessoa[30];
        int i = 0, opc, opc2, opc3, id, verif, aux = 0, h = 0;
        int aux2[];
        boolean d;
        aux2 = new int[30];
        String n, cpf, s, tipo, caux;
        Scanner ler = new Scanner(System.in);
        Scanner read = new Scanner(System.in);
        do {
            System.out.println("MENU PRINCIPAL\n1-Cadastrar\n2-Mostrar\n3-Ajuste\n0-Finalizar");
            opc = ler.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("\nRisco de saúde: (1-Sim  2-Não)\n");
                    opc2 = ler.nextInt();
                    if (opc2 == 1) {
                        aux2[i] = 1;
                        System.out.println("\nEntre com o Nome Completo: ");
                        n = read.nextLine();
                        System.out.println("\nIdade: ");
                        id = ler.nextInt();
                        System.out.println("\nSexo: (f ou m)");
                        s = read.nextLine();
                        System.out.println("\nCPF: ");
                        cpf = read.nextLine();
                        System.out.println("Tipo de risco: ");
                        tipo = read.nextLine();
                        System.out.println("Houve contágio com COVID-19: (1-Sim  2-Não)\n");
                        verif = ler.nextInt();
                        if (i > 0) {
                            for (int j = 0; j < i; j++) {
                                if (cpf.equals(p[j].getCpf())) {
                                    System.out.println("\nCPF INVÁLIDO!!!\n");
                                    do{
                                        cpf = read.nextLine();
                                        d = cpf.equals(p[j].getCpf());
                                    }while(d == true);
                                }
                            }
                        }
                        p[i] = new Risco(n, id, s, cpf, tipo, verif);
                        i++;
                    } else if (opc2 == 2) {
                        aux2[i] = 2;
                        System.out.println("\nEntre com o Nome Completo: ");
                        n = read.nextLine();
                        System.out.println("\nIdade: ");
                        id = ler.nextInt();
                        System.out.println("\nSexo: (f ou m)");
                        s = read.nextLine();
                        System.out.println("\nCPF: ");
                        cpf = read.nextLine();
                        System.out.println("Houve contágio com COVID-19: (1-Sim  2-Não)\n");
                        verif = ler.nextInt();
                        if (i > 0) {
                            for (int j = 0; j < i; j++) {
                                if (cpf.equals(p[j].getCpf())) {
                                    System.out.println("\nCPF INVÁLIDO!!!\n");
                                    do{
                                        System.out.println("Entre com outro CPF: ");
                                        cpf = read.nextLine();
                                        d = cpf.equals(p[j].getCpf());
                                    }while(d == true);
                                }
                            }
                        }
                        p[i] = new ForaRisco(n, id, s, cpf, verif);
                        i++;
                    } else if (opc2 != 1 || opc2 != 2) {
                        System.out.println("\nOpção Inválida!!!");
                    }
                    break;
                case 2:
                    System.out.println("\n1-Mostrar pelo CPF  ou  2-Mostrar todos\n");
                    opc2 = ler.nextInt();
                    if (opc2 == 1) {
                        System.out.println("\nEntre com o CPF: ");
                        caux = read.nextLine();
                        for (int j = 0; j < i; j++) {
                            if (caux.equals(p[j].getCpf())) {
                                p[j].status();
                            } else {
                                System.out.println("\nCPF não Cadastrado!!!");
                            }
                        }
                    } else if (opc2 == 2) {
                        for (int j = 0; j < i; j++) {
                            p[j].status();
                        }
                    } else if (opc2 != 1 && opc2 != 2) {
                        System.out.println("\nOpção Inválida!!!");
                    }
                    break;
                case 3:
                    System.out.println("\nEntre com o CPF: ");
                    caux = read.nextLine();
                    for (int j = 0; j < i; j++) {
                        if (caux.equals(p[j].getCpf())) {
                            aux = j;
                        } else {
                            System.out.println("\nCPF não Cadastrado!!!");
                            aux = 90;
                        }
                    }
                    if (aux != 90) {
                        System.out.println("Tipo de Ajuste:\n1-Nome\n2-Idade\n3-Sexo\n4-CPF");
                            if (aux2[aux] == 1) {
                                System.out.println("\n5-Tipo do Risco\n6-Histórico\n");
                                opc3 = ler.nextInt();
                                switch (opc3) {
                                    case 1:
                                        p[aux].ajuste(1, p[aux], caux);
                                        break;
                                    case 2:
                                        p[aux].ajuste(2, p[aux], caux);
                                        break;
                                    case 3:
                                        p[aux].ajuste(3, p[aux], caux);
                                        break;
                                    case 4:
                                        System.out.println("\nEntre com outro CPF: ");
                                        caux = read.nextLine();
                                        for(int j=0;j<i;j++){
                                            if (caux.equals(p[j].getCpf())) {
                                                System.out.println("CPF INVÁLIDO!!!");
                                            } else {
                                                p[aux].ajuste(4, p[aux], caux);
                                            }
                                        }
                                        break;
                                    case 5:
                                        p[aux].ajuste(5, p[aux], caux);
                                        break;
                                    case 6:
                                        p[aux].ajuste(6, p[aux], caux);
                                        break;
                                    default:
                                        break;
                                }

                            } else if (aux2[aux] == 2) {
                                System.out.println("\n5-Histórico\n");
                                opc3 = ler.nextInt();
                                switch (opc3) {
                                    case 1:
                                        p[aux].ajuste(1, p[aux], caux);
                                        break;
                                    case 2:
                                        p[aux].ajuste(2, p[aux], caux);
                                        break;
                                    case 3:
                                        p[aux].ajuste(3, p[aux], caux);
                                        break;
                                    case 4:
                                        System.out.println("\nEntre com outro CPF: ");
                                        caux = read.nextLine();
                                     for(int j=0;j<i;j++){
                                            if (caux.equals(p[j].getCpf())) {
                                                System.out.println("CPF INVÁLIDO!!!");
                                            } else {
                                                p[aux].ajuste(4, p[aux], caux);
                                            }
                                        }
                                        break;
                                    case 5:
                                        p[aux].ajuste(5, p[aux], caux);
                                        break;
                                    default:
                                        break;
                                }
                            }
                        } 
                    break;
          default:
                    break;
            }
        }while(opc != 0);
        System.out.println("\nOBRIGADO!!!\n");*/
    }
}
