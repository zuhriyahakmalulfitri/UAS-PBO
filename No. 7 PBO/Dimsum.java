public class Dimsum extends Makanan{
    public Dimsum(String Nama){
        super(Nama);
    }
    
    @Override
    public void CaraMasak(){
        System.out.println(super.getNama()+" Dimasak dengan cara dikukus");
    }
    @Override
    public void Rasa(){
        System.out.println(super.getNama()+" Memiliki rasa asin ");
    }
}
