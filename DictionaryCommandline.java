public class DictionaryCommandline {
    public Dictionary di = new Dictionary();


    /**
     * ham hien thi tat ca cac tu.
     */

    public void showAllWords(Dictionary dictionary) {
        System.out.println("No\t| English\t\t| Vietnamese");
        for (int i = 0; i < dictionary.amount; i++) {
            System.out.print((i + 1) + "\t| "+ dictionary.words[i].getWord_target());
            System.out.println("\t\t| " + dictionary.words[i].getWord_explain());
        }
    }

    /**
     * Tu dien co ban.
     */
    public void dictionaryBasic() {
        DictionaryManagement dm = new DictionaryManagement();
        dm.insertFromCommandline(di);
        showAllWords(di);
    }

}

