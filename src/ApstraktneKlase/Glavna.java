package ApstraktneKlase;

import java.util.ArrayList;

// U glavnoj klasi kreirati listu od 7 figura (2 trougla, 
// 3 pravougaonika, 2 kvadrata) zatim sabrati sve povrsine i 
// obime i za svaku figuru ispisati ponaosob, suma obima i povrsina

public class Glavna
{

  public static void main(String[] args)
  {
//    JednakostranicniTrougao t1 = new JednakostranicniTrougao(5);
//    t1.stampa();
//    
//    Pravougaonok p1 = new Pravougaonok(5, 8);
//    p1.stampa();
//    
//    Kvadrat k1 = new Kvadrat(5);
//    k1.stampa();
    
    ArrayList <GeometrijskaFigura> figure = new ArrayList <GeometrijskaFigura>();
    
    figure.add(new JednakostranicniTrougao(8));
    figure.add(new JednakostranicniTrougao(7));
    
    figure.add(new Kvadrat(10));
    figure.add(new Kvadrat(20));
    
    figure.add(new Pravougaonok(2, 8));
    figure.add(new Pravougaonok(2, 5));
    figure.add(new Pravougaonok(7, 10));
    
    for(int i  = 0; i < figure.size(); i++)
    {
      // suma obima i povrsina
      figure.get(i).stampa();
    }

  }

}
