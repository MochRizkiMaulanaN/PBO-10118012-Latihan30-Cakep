/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cakep;

import java.util.Scanner;

/**
 * Nama : Moch Rizki Maulana N
 * Kelas : IF-1/S1/III
 * NIM : 10118012
 * Deskripsi Program: Mengubah Warna Kata
 *
 * @author LENOVO
 */
public class Cakep {
    public static final String ANST_RESET="\u001B[0m";
    public static final String ANST_BLACK="\u001B[0m";
    public static final String ANST_RED="\u001B[0m";
    public static final String ANST_GREEN="\u001B[0m";
    public static final String ANST_YELLOW="\u001B[0m";
    public static final String ANST_BLUE="\u001B[0m";
    public static final String ANST_PURPLE="\u001B[0m";
    public static final String ANST_CYAN="\u001B[0m";
    public static final String ANST_WHITE="\u001B[0m";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input =new Scanner(System.in);
        
        System.out.println(ANST_RED+" Kamu "+ANST_GREEN+" Ngerjain Sendiri "+ANST_YELLOW+" Latihan 17 sampe "+ANST_BLUE+" Latihan 30 ini ? ");
        System.out.print(ANST_BLUE+"Jawab "+ANST_RED+" (yOi/enggak) : "+ANST_RESET);
        String jawab =input.nextLine();
        
        if(jawab.equals("yoi") || jawab.equals("Yoi")){
            System.out.println(ANST_RED+"capek bener."+ANST_PURPLE+"good job");
        }else{
            System.out.println(ANST_RED+"Tetep cakep sih.\t"+ANST_CYAN+"sing penting paham konsepnya yee."+ANST_RESET+"keep the code works dude");
        }
        }
    
}
