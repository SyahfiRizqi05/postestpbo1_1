/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.postest._1;

/**
 *
 * @author ASUS
 */
public class Postest1_1 {

    public static void main(String[] args) {
        HandPhone Dafarhandphone = new HandPhone();
        Dafarhandphone.tambahHP("Samsung Galaxy S21");
        Dafarhandphone.tambahHP("iPhone 13");
        Dafarhandphone.tambahHP("Google Pixel 6");
        Dafarhandphone.tambahHP("OnePlus 9 Pro");
        Dafarhandphone.tambahHP("Xiaomi Mi 11");
        
        System.out.println("Dafarhandphone");
        for (int i=0; i< 5; i++){
            String HP = Dafarhandphone.getHP().get(i);
            String pemilik = "Syahfi";
            String kalimat = HP   +  "punya"  + pemilik;
            System.out.println((i+1)+"."+kalimat);
        }
    }
    
}

    

