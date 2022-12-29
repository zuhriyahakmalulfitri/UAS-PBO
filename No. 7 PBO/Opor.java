public class Opor extends Makanan{
    public Opor(String Nama){
        super(Nama);
    }
    
    @Override
    public void CaraMasak(){
        System.out.println(super.getNama()+" Dimasak dengan cara direbus");
    }
    @Override
    public void Rasa(){
        System.out.println(super.getNama()+" Memiliki rasa pedas ");
    }
    
}
