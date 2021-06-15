package Vezba2;

//Kreirati klasu VideoPlayer koja ima:
// duzinu videa
// trenutno vreme videa
// jacinu zvuka
// Kvalitet videa (144, 240, 360, 480, 720, 1080)
// gettere, settere i konstruktore
// metodu stampaj koja stampa podatke u formatu:
//trenutno vreme videa
//jacina zvuka
//kavlitet videa

public class VideoPlayer
{
  private double duzinaVidea;
  private double trenVremeVidea;
  private int jacinaZvuka;
  private int kvalitetVidea; // (144, 240, 360, 480, 720, 1080)
  
  public VideoPlayer(double duzinaVidea, double trenVremeVidea, int jacinaZvuka, int kvalitetVidea)
  {
    super();
    this.duzinaVidea = duzinaVidea;
    this.trenVremeVidea = trenVremeVidea;
    this.jacinaZvuka = jacinaZvuka;
    this.kvalitetVidea = kvalitetVidea;
  }

  public double getDuzinaVidea()
  {
    return duzinaVidea;
  }

  public void setDuzinaVidea(double duzinaVidea)
  {
    this.duzinaVidea = duzinaVidea;
  }

  public double getTrenVremeVidea()
  {
    return trenVremeVidea;
  }

  public void setTrenVremeVidea(double trenVremeVidea)
  {
    this.trenVremeVidea = trenVremeVidea;
  }

  public int getJacinaZvuka()
  {
    return jacinaZvuka;
  }

  public void setJacinaZvuka(int jacinaZvuka)
  {
    this.jacinaZvuka = jacinaZvuka;
  }

  public int getKvalitetVidea()
  {
    return kvalitetVidea;
  }

  public void setKvalitetVidea(int kvalitetVidea)
  {
    this.kvalitetVidea = kvalitetVidea;
  }
  
  public void stampa()
  {
    System.out.printf("Trenutno vreme videa %.1f\nJacina zvuka %d\nKvalitet videa %d\n",
        getTrenVremeVidea(), getJacinaZvuka(), getKvalitetVidea());
  }
  
}
