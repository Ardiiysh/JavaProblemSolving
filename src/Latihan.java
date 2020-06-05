/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class Latihan {
    public static void main(String[] args){
        int n = 0;
        try{
            n = System.in.read();
        }catch(java.io.IOException ex){
            System.err.println(ex.getMessage());
        }
        System.out.println("Hasil :" +(char)n);
    }
}
