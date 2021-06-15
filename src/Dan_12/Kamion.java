package Dan_12;

public class Kamion extends MotornoVozilo
{
  private int brPriklica;
  private String tipKamiona;
  private String kategorijaVozila;
  
  public Kamion(int brTockova, int brVrata, String registracija, int brPriklica, String tipKamiona,
      String kategorijaVozila)
  {
    super(brTockova, brVrata, registracija);
    this.brPriklica = brPriklica;
    this.tipKamiona = tipKamiona;
    this.kategorijaVozila = kategorijaVozila;
  }

  public int getBrPriklica()
  {
    return brPriklica;
  }

  public void setBrPriklica(int brPriklica)
  {
    this.brPriklica = brPriklica;
  }

  public String getTipKamiona()
  {
    return tipKamiona;
  }

  public void setTipKamiona(String tipKamiona)
  {
    this.tipKamiona = tipKamiona;
  }

  public String getKategorijaVozila()
  {
    return kategorijaVozila;
  }

  public void setKategorijaVozila(String kategorijaVozila)
  {
    this.kategorijaVozila = kategorijaVozila;
  }
  
  public void stampaj()
  {
    System.out.println();
  }

}
