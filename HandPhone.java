/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.postest._1;
import java.util.ArrayList;
/**
 *
 * @author ASUS
 */
public class HandPhone{
    private ArrayList<String>HandPhone;
    
    public HandPhone(){
        HandPhone = new ArrayList<>();
    }
    public void tambahHP(String handphone){
        HandPhone.add(handphone);
    }
    public ArrayList<String> getHP(){
        return HandPhone;
    }
    
}
