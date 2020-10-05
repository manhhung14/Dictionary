public class Word {
    public String word_target;
    public String  word_explain;

    /**
     * ham setter.
     * @param word_target tu moi
     */
    public void setWord_target(String word_target) {
        this.word_target = word_target;
    }

    /**
     * ham getter.
     * @return  tu moi
     */
    public String getWord_target() {
        return word_target;
    }

    /**
     * ham setter.
     * @param word_explain giai nghia tu moi
     */
    public void setWord_explain(String word_explain) {
        this.word_explain = word_explain;
    }

    /**
     * ham getter.
     * @return giai nghia tu moi
     */
    public String getWord_explain() {
        return word_explain;
    }

    public Word() {
        setWord_target("One");
        setWord_explain("Một");
    }

    public Word(String word_target, String word_explain) {
        this.setWord_explain(word_explain);
        this.setWord_target(word_target);
    }
}
