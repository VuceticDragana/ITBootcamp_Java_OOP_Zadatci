package Vezba2;

//Kreirati klasu TimeControl koja nasledjuje klasu Control i
// konstruktore
// ima atribut koji kaze na koju stranu pomera trenutno vreme videa (tipa boolean)
// implementira metodu izvrsi akciju tako sto pomeri trenutno vreme videa za 15s 
//unapred ili unazad u zavisnosti od atributa. Veoma je bitno da se ne izadje van 
//granica videa.

public class TimeControl extends Control
{
  private boolean pomeranjeNapred;

  public TimeControl(boolean pomeranjeNapred)
  {
    super();
    this.pomeranjeNapred = pomeranjeNapred;
  }

  public boolean isPomeranjeNapred()
  {
    return pomeranjeNapred;
  }

  public void setPomeranjeNapred(boolean pomeranjeNapred)
  {
    this.pomeranjeNapred = pomeranjeNapred;
  }

  @Override
  public void izvrsiAkciju(VideoPlayer vp)
  {
    if (isPomeranjeNapred())
    {
      if (vp.getTrenVremeVidea() + 15 > vp.getDuzinaVidea())
      {
        vp.setTrenVremeVidea(vp.getDuzinaVidea());
      }
      else
      {
        vp.setTrenVremeVidea(vp.getTrenVremeVidea() + 15);
      }
    }
    else
    {
      if (vp.getTrenVremeVidea() - 15 < 0)
      {
        vp.setTrenVremeVidea(0);
      }
      else
      {
        vp.setTrenVremeVidea(vp.getTrenVremeVidea() - 15);
      }
    }

  }

}
