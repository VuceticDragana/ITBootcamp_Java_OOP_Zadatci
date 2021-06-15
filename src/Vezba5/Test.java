package Vezba5;

import java.util.ArrayList;

//Testnu klasu koja treba da:
// kreira niz disciplina: "Skok u dalj", 7 ; "Bacanje koplja", 55; "100m", 10.5; "Skok u vis", 6;
//"200m", 20.5;.
// kreira dva takmicenja: “Svetsko” i “Evropsko”
// na Svetsko takmicenje prijavljuje sledece takmicare:
// "Marko Markovic", 60, "Bacanje koplja"
// "Pera Peric", 50, "Bacanje koplja"
// "Mika Mikic", 8, "Skok u dalj"
// "Pera Markovic", 6, "Skok u dalj"
// "Pera Zikic", 60, "Bacanje diska"
// na Evropsko takmicenje prijavljuje sledece takmicare:
// "Majk Pauel", 8, "Skok u dalj"
// "Laza Lazic", 65, "Bacanje koplja"
// "Ana Lazic", 6, " Skok u vis"
// stampa podatke takmicara koji ucestvuju na takmicenjima po disciplinama
// stampati discipline za koje nije bilo prijavljenih takmicara ni na jednom takmicenju

public class Test
{
  public static void main(String[] args)
  {
    Disciplina skokDalj = new Disciplina("Skok u dalj", 7);
    Disciplina koplje = new Disciplina("Bacanje koplja", 55);
    Disciplina stoM = new Disciplina("100m", 10.5);
    Disciplina skokVis = new Disciplina("Skok u vis", 6);
    Disciplina dvestoM = new Disciplina("200m", 20.5);    
    
    Takmicenje.setDisciplina(new ArrayList <Disciplina>());
    
    Takmicenje.getDisciplina().add(skokDalj);
    Takmicenje.getDisciplina().add(koplje);
    Takmicenje.getDisciplina().add(stoM);
    Takmicenje.getDisciplina().add(skokVis);
    Takmicenje.getDisciplina().add(dvestoM);
    
    Takmicenje sv = new Takmicenje("Svetsko");
    Takmicenje ev = new Takmicenje("Evropsko");
    
    Takmicar t1 = new Takmicar("Marko Markovic", 60, "Bacanje koplja");
    Takmicar t2 = new Takmicar("Pera Peric", 50, "Bacanje koplja");
    Takmicar t3 = new Takmicar("Mika Mikic", 8, "Skok u dalj");
    Takmicar t4 = new Takmicar("Pera Markovic", 6, "Skok u dalj");
    Takmicar t5 = new Takmicar("Pera Zikic", 60, "Bacanje diska");
    
    sv.getTakmicar().add(t1);
    sv.getTakmicar().add(t2);
    sv.getTakmicar().add(t3);
    sv.getTakmicar().add(t4);
    sv.getTakmicar().add(t5);
    
    Takmicar t6 = new Takmicar("Majk Pauel", 8, "Skok u dalj");
    Takmicar t7 = new Takmicar("Laza Lazic", 65, "Bacanje koplja");
    Takmicar t8 = new Takmicar("Ana Lazic", 6, "Skok u vis");
    
    ev.getTakmicar().add(t6);
    ev.getTakmicar().add(t7);
    ev.getTakmicar().add(t8);
    
    sv.izlistajTakmicare("Skok u dalj");
    sv.izlistajTakmicare("Bacanje koplja");
    sv.izlistajTakmicare("100m");
    sv.izlistajTakmicare("Skok u vis");
    sv.izlistajTakmicare("200m");
    
    ev.izlistajTakmicare("Skok u dalj");
    ev.izlistajTakmicare("Bacanje koplja");
    ev.izlistajTakmicare("100m");
    ev.izlistajTakmicare("Skok u vis");
    ev.izlistajTakmicare("200m");

  }

}
