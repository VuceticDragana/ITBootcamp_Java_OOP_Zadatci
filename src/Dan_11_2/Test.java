package Dan_11_2;

public class Test
{

  public static void main(String[] args)
  {
   Sastojak s1 = new Sastojak("Spageti", 100);
   Sastojak s2 = new Sastojak("Sir", 200);
   Sastojak s3 = new Sastojak("Slanina", 220);
   Sastojak s4 = new Sastojak("Susam", 55);
   
   Pasta p1 = new Pasta();
   
   p1.dodavanjeSastojka(s1);
   p1.dodavanjeSastojka(s2);
   p1.dodavanjeSastojka(s3);
   p1.dodavanjeSastojka(s4);
//   p1.dodavanjeSastojka(s3);
//   p1.dodavanjeSastojka(s4);
   
   p1.stampaPodatke();
   
   p1.brisanjeSastojka("Susam");
   //p1.brisanjeSastojka("slanina");
   p1.stampaPodatke();

  }

}
