package labor5;

public class Sentence {
    private static final String PUNCTUATION_SYMBOLS = ",.!?;";
    private SentenceMember[] sentenceMembers;
    private int wordsCount;

    public Sentence(String s) {
        String[] split = s.split("(?=,|\\.|!|\\?)|\\s");
        sentenceMembers = new SentenceMember[split.length];

        for (int j = 0; j < split.length; j++) {
            if (PUNCTUATION_SYMBOLS.contains(split[j])) {
                sentenceMembers[j] = new Punctuation(split[j]);
            } else {
                sentenceMembers[j] = new Word(split[j]);
                wordsCount++;
            }
        }
    }

    public String toString() {
        String result = "";
        SentenceMember currentSentenceMember;
        for (int i = 0; i < sentenceMembers.length; i++) {
            currentSentenceMember = sentenceMembers[i];
            result += (currentSentenceMember instanceof Word && i != 0 ? " " : "") +
                    currentSentenceMember.toString();
        }
        return result;
    }

    public int getWordsCount() {
        return wordsCount;
    }
}


