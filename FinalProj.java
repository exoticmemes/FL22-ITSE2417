// Dummy class for FinalProject
// Outputs a simple message when implementing begin()

public class FinalProj implements FinalProject
{
    public FinalProj()
    {

    }

    public void begin()
    {
        String[] signs = {"Rat","Ox","Tiger","Rabbit","Dragon","Snake","Horse","Goat","Monkey","Rooster","Dog","Pig"};
        System.out.println("Welcome to the Chinese zodiac calculator!");
        System.out.println("Enter your birth year: ");
        int yearBorn = Itse2417Main.myScan.nextInt();
        System.out.printf("You were born in the Year of the %s", signs[yearBorn % 12]);
        /*System.out.println();
        System.out.println("Not implemented at this time");
        System.out.println();
        try
        {
            java.util.concurrent.TimeUnit.SECONDS.sleep(2);  
        }
        catch(InterruptedException e)
        {}*/
    }
}
