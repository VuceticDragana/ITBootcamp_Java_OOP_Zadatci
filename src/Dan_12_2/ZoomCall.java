package Dan_12_2;

public class ZoomCall
{
  private String linkZaPoziv;
  private String password;
  private Korisnik host;
  private Korisnik guest;
  
  public ZoomCall(String linkZaPoziv, String password, Korisnik host, Korisnik guest)
  {
    super();
    this.linkZaPoziv = linkZaPoziv;
    this.password = password;
    this.host = host;
    this.guest = guest;
  }

  public Korisnik getGuest()
  {
    return guest;
  }

  public void setGuest(Korisnik guest)
  {
    this.guest = guest;
  }

  public String getLinkZaPoziv()
  {
    return linkZaPoziv;
  }

  public String getPassword()
  {
    return password;
  }

  public Korisnik getHost()
  {
    return host;
  }
  
  public void pokreniPoziv()
  {
    System.out.println("Url: " + getLinkZaPoziv());
    System.out.println("Password: " + getPassword());
    System.out.println("Host: " + getHost().vracaKorisnika());
    System.out.println("Guest: " + getGuest().vracaKorisnika());
    System.out.println("Max trajanje poziva je: " + getHost().maxDuzina());
  }

}
