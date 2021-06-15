package Vezba3;

//Public klasu Program koja u main metodi treba u navedenom redosledu:
//– Kreira objekat tipa studentska sluzba
//– Kreira studenta Pera Peric sa indeksom 77/07
//– Kreira studenta Jova Jovic sa indeksom 55/09
//– Jova prijavljuje ispit “OOP” u junskom roku
//– Pera prijavljuje ispit “SPA2” u junskom roku

public class Glavna
{

  public static void main(String[] args)
  {
    Prijava p1 = new Prijava("OOP", "77/07", "junskom");
    Prijava p2 = new Prijava("SPA2", "55/09", "junskom");

    StudentskaSluzba ss = new StudentskaSluzba();

    Student s1 = new Student("77/07", "Pera", "Peric");
    Student s2 = new Student("55/09", "Jova", "Jovic");

    ss.prihvatiPrijavu(p1);
    ss.prihvatiPrijavu(p2);
    
    s2.prijaviIspit(ss, p1);
    s1.prijaviIspit(ss, p2);
  }

}
