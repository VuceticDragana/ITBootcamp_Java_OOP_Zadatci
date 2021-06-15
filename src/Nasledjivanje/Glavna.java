package Nasledjivanje;

public class Glavna
{

  public static void main(String[] args)
  {
    Student s1 = new Student("Pera", "Peric", "1234567891234", "45852");
    Student s2 = new Student("Mile", "Milic", "7589641236589", "47895");
    
    Profesor p1 = new Profesor("Ceda", "Cedic", "5497683164975", "Filozofija");
    Profesor p2 = new Profesor("Zika", "Zikic", "4879865913754", "Ekonomija");
    
    s1.stampa();
    s2.stampa();
    
    p1.stampa();
    p2.stampa();
    
    OsnovneStudije sos = new OsnovneStudije("Iva", "Ivic", "5497863415622", "65945");
    MasterStudije sms = new MasterStudije("Relja", "Reljic", "1547896523214", "58749");
    
    sos.stampa();
    sms.stampa();
  }

}
