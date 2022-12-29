/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Zuhria
 */
public class fish extends animal implements pet {
    public fish(){
    }
    private String fishName;
    //override
    public void eat(){
        System.out.println("ikan makan ");
    }
    public String getName(){
        return fishName;
    }
    public void setName(String name){
        fishName = name;
    }
    public void play(){
        System.out.println("Main yuk");
    }
    //override
    public void walk(){
        System.out.println("ikan tidak bisa jalan");
    }
}