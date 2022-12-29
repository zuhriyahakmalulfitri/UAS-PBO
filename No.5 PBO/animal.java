/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Zuhria
 */
public abstract class animal {
    protected int legs;
    protected animal (int legs){
        this.legs=legs;
    }
    public void walk(){
        System.out.println("Hwan ini berjalan dengan "+legs+" kaki");
    }
    public abstract void eat();
}