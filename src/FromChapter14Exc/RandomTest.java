package FromChapter14Exc;


public class RandomTest {
    public static void randomTest(){
        String[] article = {"The", "a", "One", "Some", "Any" };
        String[] noun = {"Boy", "Girl", "Dog", "Town", "Car"};
        String[] verb = {"Drove", "Jumped", "Ran", "Walked", "Skipped"};
        String[] preposition = {"To", "From", "Over", "Under", "on"};

        int random1 = (int) (Math.random () * article.length);
        int random2 = (int) (Math.random () * noun.length);
        int random3 = (int) (Math.random () * verb.length);
        int random4 = (int) (Math.random () * preposition.length);
        int random5 = (int) (Math.random () * article.length);
        int random6 = (int) (Math.random () * noun.length);

        String randomSentence = article[random1] + " " + noun[random2] + " " + verb[random3] + " " + preposition[random4] + " " +
                article[random5] + " " + noun[random6];

        System.out.println (randomSentence);

    }

    public static void main(String[] args) {
        randomTest ();
    }
}
