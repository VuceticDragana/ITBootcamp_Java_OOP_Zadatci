package Vezba4;

//Tip Takmicar koji ima:
// String promenljivu imePrezime
// celobrojnu staticku promenljivu NORMA koja opisuje donju granicu za plasman na takmicenje
// celobrojnu promenljivu najboljiRezultat
// getter i setter za NORMU
// getter i setter za najbolji rezultat
// metod ispinioNormu koji vraca da li takmicar sa trenutnim rezultatomispunjava normu za takmicenje
// metod toString koji predstavlja string reprezentaciju takmicara, odnosno vraca string u obliku ime prezime (naj.rezl)

public class Takmicar
{
  private String ime;
  private String prezime;
  private static int norma;
  private int najboljiRezultat;
  
  public Takmicar(String ime, String prezime, int najboljiRezultat)
  {
    super();
    this.ime = ime;
    this.prezime = prezime;
    this.najboljiRezultat = najboljiRezultat;
  }

  public static int getNorma()
  {
    return norma;
  }

  public static void setNorma(int norma)
  {
    Takmicar.norma = norma;
  }

  public int getNajboljiRezultat()
  {
    return najboljiRezultat;
  }

  public void setNajboljiRezultat(int najboljiRezultat)
  {
    this.najboljiRezultat = najboljiRezultat;
  }
  
  public boolean ispuniNormu()
  {
    boolean norma = true;
    
    if(getNajboljiRezultat() < getNorma())
    {
      norma = false;
    }
    return norma;
  }

  @Override
  public String toString()
  {
    return ime + " " + prezime + "(" + getNajboljiRezultat() + ")";
  }
  
  
}
