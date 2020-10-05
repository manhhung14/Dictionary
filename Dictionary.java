public class Dictionary {
    public Word[] words = new Word[1000];
    public int amount = 0;

    /**
     * them tu moi.
     */
    public void addWord(Word w) {
        this.words[amount] = w;
        this.amount++;

    }


}
