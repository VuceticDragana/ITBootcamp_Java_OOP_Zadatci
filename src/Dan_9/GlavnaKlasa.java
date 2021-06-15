package Dan_9;

//na kraju instancirajte par racunara i dodajte ih polaznicima i odstampajte poruke

public class GlavnaKlasa
{
  public static void main(String[] args)
  {
    int[] mojProsek = {6, 7, 8, 10, 9};
    PolaznikKursa polaznik1 = new PolaznikKursa(1, "Dragana", "Vucetic", 1985, 6.01);
    PolaznikKursa polaznik2 = new PolaznikKursa(2, "Pera", "Peric", 1990, 7.5);
//    polaznik1.idPolaznika = 1;
//    polaznik1.ime = "Dragana";
//    polaznik1.prezime = "Vucetic";
//    polaznik1.godinaRodjenja = 1985;
//    polaznik1.prosek = 6.01;
    polaznik1.setSrednjaSkola("Masinka skola");
    polaznik1.racunanjeProseka(mojProsek);
    
    String imePolaznika1 = polaznik1.ime;
    String srenjaSkolaPolaznik1 = polaznik1.getSrednjaSkola();
    
    System.out.println("Polaznik 1 se zove " + imePolaznika1 + " a isao je u srednju " + srenjaSkolaPolaznik1);
    
    polaznik1.stampanjePodataka();
    polaznik2.stampanjePodataka();
    
    Racunar r1 = new Racunar("Assus", "rog", 16, "i7");
    polaznik1.polaznikovRacunar = r1;
    
    polaznik1.stampanjeORacunaru();
    
    

  }

}
