package labor5;
public class Punctuation extends SentenceMember{
    private String symbols;

    public Punctuation(String symbols) {
        this.symbols = symbols;
    }
    public String toString() {
        return symbols;
    }
}