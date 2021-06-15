package Dan_12;

public class Autobus extends MotornoVozilo
{
  private String tipaAutobusa;
  private int brStojecihMesta;
  
  public Autobus(int brTockova, int brVrata, String registracija, String tipaAutobusa, int brStojecihMesta)
  {
    super(brTockova, brVrata, registracija);
    this.tipaAutobusa = tipaAutobusa;
    this.brStojecihMesta = brStojecihMesta;
  }

  public String getTipaAutobusa()
  {
    return tipaAutobusa;
  }

  public void setTipaAutobusa(String tipaAutobusa)
  {
    this.tipaAutobusa = tipaAutobusa;
  }

  public int getBrStojecihMesta()
  {
    return brStojecihMesta;
  }

  public void setBrStojecihMesta(int brStojecihMesta)
  {
    this.brStojecihMesta = brStojecihMesta;
  }
  
  
}
