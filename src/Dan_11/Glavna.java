package Dan_11;

//Iz glavne klase instancirati par reakcija i postova i ispisati info o postovima*/

public class Glavna
{

  public static void main(String[] args)
  {
    FacebookPost post1 = new FacebookPost("Pera", "Peric", "Moj prvi najbolji post na svetu.");
    FacebookPost post2 = new FacebookPost("Zika", "Zikic", "Kakav sam ja meni kralj.");
    
    Reakcija r1 = new Reakcija(TipReakcije.Smajli, "Mile", "Milic");
    Reakcija r2 = new Reakcija(TipReakcije.Like, "Sima", "Simic");
    Reakcija r3 = new Reakcija(TipReakcije.Srce, "Mara", "Maric");
    
    post1.reaguj(r1);
    post1.reaguj(r3);
    post1.reaguj(r3);
    
    post2.reaguj(r1);
    post2.reaguj(r1);
    post2.reaguj(r1);
    post2.reaguj(r2);
    
    post1.stampaj();
    post2.stampaj();
  }

}
