package Dan_9;

// dodajte klasu racunar (atributi: marka model ram procesor)

public class Racunar
{
  public String markaRacunara;
  public String modelRacunara;
  public int ramMemorijaGB;
  public String procesor;
  
  public Racunar()
  {
    
  }
  
  public Racunar(String markaRacunara, String modelRacunara, int ramMemorijaGB, String procesor)
  {
    super();
    this.markaRacunara = markaRacunara;
    this.modelRacunara = modelRacunara;
    this.ramMemorijaGB = ramMemorijaGB;
    this.procesor = procesor;
  }
  
  
}
