package Vezba2;

//Kreirati klasu QualityOptimizerControl koja nasledjuje klasu Control i
// ima brzinu interneta u megabajtima, npr 10mb/s, 20mb/s, 7.9mb/s
// gettere, settere i konstruktore
// implementira metodu izvrsi akciju tako sto postavlja kvalitet videa 
//u zavisnosti od brzine interneta. Kvalitet se racuna na osnovu formule:
//brzina interneta * 10.1, gde se uzima prvi veci kvalitet
//npr: ako je brizna interneta 20 * 10.1 = 204 => postavlja 240
//npr: ako je brzina interneta 5 * 10.1 = 50.5 => postavlja 144
//npr: ako je brzina interneta 50 * 10.1 = 505 => postavlja 720

public class QualityOptimizerControl extends Control
{
  private int brzinaInterneta;

  public QualityOptimizerControl(int brzinaInterneta)
  {
    super();
    this.brzinaInterneta = brzinaInterneta;
  }

  public int getBrzinaInterneta()
  {
    return brzinaInterneta;
  }

  public void setBrzinaInterneta(int brzinaInterneta)
  {
    this.brzinaInterneta = brzinaInterneta;
  }

  @Override
  public void izvrsiAkciju(VideoPlayer vp)
  {//(144, 240, 360, 480, 720, 1080)
    double a = getBrzinaInterneta() * 10.1;
    
    if(a <= 144)
    {
      vp.setKvalitetVidea(144);
    }
    else if(a <= 240)
    {
      vp.setKvalitetVidea(240);
    }
    else if(a <= 360)
    {
      vp.setKvalitetVidea(360);
    }
    else if(a <= 480)
    {
      vp.setKvalitetVidea(480);
    }
    else if(a <= 720)
    {
      vp.setKvalitetVidea(720);
    }
    else
    {
      vp.setKvalitetVidea(1080);
    }
  }
  
  
}
