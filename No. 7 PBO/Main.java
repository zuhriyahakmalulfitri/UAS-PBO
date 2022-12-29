
public class Main {
private static Object ketiga;
    public static void main(String[] args) {
        Makanan pertama = new Dimsum("Dimsum");
        pertama.CaraMasak();
        pertama.Rasa();
    
        Makanan kedua = new Opor("Opor");
        kedua.CaraMasak();
        kedua.Rasa();
    
        Makanan Ketiga = new Donat("Donat");
        Ketiga.CaraMasak();
        Ketiga.Rasa();
    }
    
}
