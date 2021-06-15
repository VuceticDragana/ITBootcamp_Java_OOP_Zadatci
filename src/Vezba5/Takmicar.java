package Vezba5;

//Tip Takmicar koji ima:
// promenljivu koja cuva redni broj takmicara
// String promenljivu imePrezime
// celobrojnu promenljivu najboljiRezultat
// promenljivu koja cuva naziv discipline
// konstruktor koji prihvata i setuje ime i prezime, najbolji rezultat i naziv discipline
// getter i setter za najbolji rezultat i naziv discipline
// metod toString koji predstavlja string reprezentaciju takmicara, odnosno vraca string u obliku ime prezime (naj.rezl)
// metodu PrijaviMe koja prihvata takmicenje i prijavljuje takmicara

public class Takmicar
{
  private int redniBroj;
  private String imePrezime;
  private int najboljiRezultat;
  private String nazivDiscipline;
  
  public Takmicar(String imePrezime, int najboljiRezultat, String nazivDiscipline)
  {
    super();
    this.imePrezime = imePrezime;
    this.najboljiRezultat = najboljiRezultat;
    this.nazivDiscipline = nazivDiscipline;
  }  
  
  public int getRedniBroj()
  {
    return redniBroj;
  }  

  public void setRedniBroj(int redniBroj)
  {
    this.redniBroj = redniBroj;
  }

  public String getImePrezime()
  {
    return imePrezime;
  }

  public int getNajboljiRezultat()
  {
    return najboljiRezultat;
  }

  public void setNajboljiRezultat(int najboljiRezultat)
  {
    this.najboljiRezultat = najboljiRezultat;
  }

  public String getNazivDiscipline()
  {
    return nazivDiscipline;
  }

  public void setNazivDiscipline(String nazivDiscipline)
  {
    this.nazivDiscipline = nazivDiscipline;
  }

  @Override
  public String toString()
  {
    return "Takmicar " + getImePrezime() + " (" + getNajboljiRezultat() + ")";
  }
  
  public void PrijaviMe(Takmicenje t)
  {
    t.Prijava(this);
  }
  
}
