/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class BagiNol3 {
    public static void main(String[] args){
        System.out.println("sebelum pembagian");
        try{
            System.err.println(5/0);
        }
        catch (Throwable t){
            System.err.print("pesan kesalahan:");
            System.err.println(t.getMessage());
        }
        System.err.println("sesudah pembagian");
    }
}
