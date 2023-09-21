/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.lab;

public class encapsulation {
    private String uniname;
    private String city;
    private String phonenum;
    
    public String getname(){
        return uniname;
    }
    
    public String getcity(){
        return city;
    }
    public String getnum(){
        return phonenum;
    }
    
    void  setname(String name){
        this.uniname=name;
    }
    void setcity(String city){
        this.city=city;
    }
    void setnum(String num){
        this.phonenum=num;
    }

    
}
