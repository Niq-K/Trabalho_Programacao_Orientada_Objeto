/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_etapa2_nickbruno;

/**
 *
 * @author Yudi
 */
public class ExcessaoEntradaCPF extends Exception{
    public static void testeCpf(String cpf){
        if(cpf.length() != "           ".length()){
            throw new IllegalArgumentException("CPF inserido em formato errado!!!");
        }
    }
}
