package Nasledjivanje;

public class Profesor extends Osoba
{
  private String predmet;

  public Profesor(String ime, String prezime, String jmbg, String predmet)
  {
    super(ime, prezime, jmbg);
    this.predmet = predmet;
  }

  public String getPredmet()
  {
    return predmet;
  }

  public void setPredmet(String predmet)
  {
    this.predmet = predmet;
  }
  
  public void stampa()
  {
    super.stampa();
    System.out.println(", " + getPredmet());
  }

}
