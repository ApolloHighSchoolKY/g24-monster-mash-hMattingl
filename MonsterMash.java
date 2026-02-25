public class MonsterMash{
  public static void main(String[] args){
    //Monster monster = new Monster(); // not allowed
    //because 
    Monster dracula = new Monster("Dracula");

    System.out.println(dracula);

    System.out.println(dracula.kill());

    Monster sally = new Witch("Sally");

    System.out.println(sally);

    System.out.println(sally.kill());

    System.out.println(((Witch)sally).fly());

    Monster casper = new Ghost("Casper" , "intangibility");

    System.out.println(casper.kill());

    System.out.println(((Ghost)casper).possess("table"));

    Ghost betelgeuse = new Ghost("Beetlejuice", "possession");

    System.out.println(betelgeuse.kill());

    System.out.println(betelgeuse.possess("table"));
  }
}
