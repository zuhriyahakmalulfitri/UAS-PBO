/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Zuhria
 */
public class mamaliaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        mamalia mama = new mamalia();
        monyet kera = new monyet();
        paus ikan = new paus();
        
        System.out.println("Paus berjenis tulang : "+ikan.tulang);
        mama.tulang();
        
        System.out.println("Monyet bernafas dengan : "+kera.nafas);
        mama.bernafas();
        
        kera.habitat();
        ikan.habitat();
    }
    
}
