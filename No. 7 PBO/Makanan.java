
public abstract class Makanan implements Masak {
    private String nama;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public Makanan (String Nama){
        nama = Nama;
    }
    
    @Override
    public void CaraMasak(){
        System.out.println("Belum Dimasak");
    }
    @Override
    public void Rasa(){
        System.out.println("Belum Dicoba");
    }
}
