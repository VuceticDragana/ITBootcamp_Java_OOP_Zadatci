package Vezba3;

//Klasu StudentskaSluzba koja ima
//-Metodu PrihvatiPrijavu koja kao argument prihvata prijavu ispita i ispisuje podatke o njoj

public class StudentskaSluzba
{
  public void prihvatiPrijavu(Prijava ispit)
  {
    System.out.printf("Predmet: %s, Broj indeksa: %s, Ispitni rok: %s\n", 
        ispit.getNazivPredmeta(), ispit.getBrIndeksa(), ispit.getIspitniRok());
  }
}
