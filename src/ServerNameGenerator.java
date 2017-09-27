import java.util.Random;

public class ServerNameGenerator {

    public static void main(String[] args) {

        Random random = new Random();

        String[] adjectives = {"Annual", "Brief", "Daily", "Early", "Eternal", "Fast", "First", "Fleet", "Future", "Futuristic"};

        String[] nouns = {"bed", "cat", "movie", "train", "country", "book", "phone", "match", "speaker", "clock"};

        int length = adjectives.length;
        int nounLength = nouns.length;
//
//        for (int i = 0; i < length; i++) {
//            int rand = (int) (Math.random() * length);
//
//            System.out.print(adjectives[rand]);
//
//            System.out.print(" ");
//        }

        int rand = (int) (Math.random() * length);
        int rand2 = (int) (Math.random() * nounLength);

        System.out.println("Here is your server name:");

        System.out.print(adjectives[rand] + " - ");
        System.out.print(nouns[rand2]);




    }
}
