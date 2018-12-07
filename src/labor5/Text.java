package labor5;
import java.util.Arrays;
import java.util.Comparator;
    public class Text {
    private Sentence[] sentences;

    public Text(String s) {
        String[] split = s.split("(?<=[?!.]) ");
        sentences = new Sentence[split.length];

        for (int i = 0; i < split.length; i++) {
            sentences[i] = new Sentence(split[i]);
        }
    }

    public void sortedSentencesByWordsCount() {
        Arrays.sort(sentences, Comparator.comparing(Sentence::getWordsCount).reversed());
        for (Sentence sentence : sentences) {
            System.out.println(sentence);
        }
    }

    @Override
    public String toString() {
        String result = "";
        for (Sentence sentence : sentences) {
            result += sentence.toString() + "";
        }
        return result;
    }
}
