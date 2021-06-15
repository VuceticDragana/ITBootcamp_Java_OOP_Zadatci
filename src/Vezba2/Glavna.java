package Vezba2;

public class Glavna
{

  public static void main(String[] args)
  {
    VideoPlayer vdPl = new VideoPlayer(1000, 500, 50, 720);    
    vdPl.stampa();
    
    TimeControl tc = new TimeControl(false);
    AudioControl ac = new AudioControl(false);
    QualityOptimizerControl qoc = new QualityOptimizerControl(20);
    
    tc.izvrsiAkciju(vdPl);
    ac.izvrsiAkciju(vdPl);
    qoc.izvrsiAkciju(vdPl);
    
    System.out.println("--------------------------------------");
    vdPl.stampa();
    

  }

}
