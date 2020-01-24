/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week1.softwarefundamentals;

/**
 *
 * @author sidhu376 - 24-JAN-2020 Friday
 */
public class Student {
    
    private String name;
    private String addr;
    private int numb;

    public int getNumb() {
        return numb;
    }

    public void setNumb(int numb) {
        this.numb = numb;
    }

    
    
    public String getAddr() {
        return addr;
    }

    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public void setAddr(String addr) {    
        this.addr = addr;
    }

    public String getName() {
        return name;
    }

    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setName(String name) {
        this.name = name;
    }

}
 
   
