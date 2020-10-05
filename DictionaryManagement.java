import java.util.Scanner;

public class DictionaryManagement {

    /**
     * ham chen them tu moi.
     */
    public void insertFromCommandline(Dictionary dictionary) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < a; i++) {
            String word = sc.nextLine();
            String explain = sc.nextLine();
            Word w = new Word(word, explain);
            dictionary.addWord(w);
        }
    }

    public void insertFromFile() {

    }
}
