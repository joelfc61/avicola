/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avicola;

import clases.Hash;

/**
 *
 * @author Admin
 */
public class Avicola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cad = Hash.getHash("JuanFCPwd","sha1");
        System.out.println(cad);
    }
    
}
