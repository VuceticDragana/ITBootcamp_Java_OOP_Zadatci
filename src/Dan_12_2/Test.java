package Dan_12_2;

public class Test
{

  public static void main(String[] args)
  {
    Korisnik k1 = new Korisnik("Mira", "Miric", 0);
    Korisnik k2 = new Korisnik("Jovan", "Jovanovic", 0);
    
    ZoomCall poziv = new ZoomCall("sadsfdgfhgj", "hgikg461427645", k1, k2);
    
    //poziv.pokreniPoziv();
    
    k1.pretplatiSe(150);
    k1.ponistiUplatu();
    poziv.pokreniPoziv();

  }

}
