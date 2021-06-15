package Dan_12;

public class MotornoVozilo
{
  private int brTockova;
  private int brVrata;
  private String registracija;
  
  public MotornoVozilo(int brTockova, int brVrata, String registracija)
  {
    super();
    this.brTockova = brTockova;
    this.brVrata = brVrata;
    this.registracija = registracija;
  }

  public int getBrTockova()
  {
    return brTockova;
  }

  public void setBrTockova(int brTockova)
  {
    this.brTockova = brTockova;
  }

  public int getBrVrata()
  {
    return brVrata;
  }

  public void setBrVrata(int brVrata)
  {
    this.brVrata = brVrata;
  }

  public String getRegistracija()
  {
    return registracija;
  }

  public void setRegistracija(String registracija)
  {
    this.registracija = registracija;
  }

  @Override
  public String toString()
  {
    return "MotornoVozilo [brTockova=" + brTockova + ", brVrata=" + brVrata + ", registracija=" + registracija + "]";
  }
  
  
}
