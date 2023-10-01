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
public class ExcessaoEntradaIdade extends Exception{
    public static void testeId(int id) throws ExcessaoEntradaIdade {
        if(id > 90 || id < 18){
            throw new ExcessaoEntradaIdade();
        }
    }
}
