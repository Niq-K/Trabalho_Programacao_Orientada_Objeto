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
public class ExcessaoEntradaNome extends Exception{
    public static void testeNome(String n){
        if(n.length() < "   ".length()){
            throw new IllegalArgumentException("Formato errado para Nome!!!");
        }
    }
}
