public class Donat extends Makanan{
    public Donat(String Nama){
        super(Nama);
    }
    
    @Override
    public void CaraMasak(){
        System.out.println(super.getNama()+" Dimasak dengan cara digoreng");
    }
    @Override
    public void Rasa(){
        System.out.println(super.getNama()+" Memiliki rasa manis");
    }
}
