public class Cole implements FinalProject {

  public Cole {
  
  }

  public void begin(){
      String[] signs = {"Rat","Ox","Tiger","Rabbit","Dragon","Snake","Horse","Goat","Monkey","Rooster","Dog","Pig"};
      System.out.println("Welcome to the Chinese zodiac calculator!");
      System.out.println("Enter your birth year: ");
      int yearBorn = Itse2417Main.myScan.nextInt();
      System.out.printf("You were born in the Year of the %s", signs[yearBorn % 12]);
  }
}
