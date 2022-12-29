/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Zuhria
 */
public class cat extends animal implements pet {
    private String catName;
    public cat(){
        this(" ");
    }
    public cat (String name){
        catName = name;
    }
    //override
    public void eat(){
        System.out.println("cat eat fish");
    }
    public String getName(){
        return catName;
    }
    public void setName(String name){
        catName = name;
    }
    public void play(){
        System.out.println("Main yuk");
    }
}
