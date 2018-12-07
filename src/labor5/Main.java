package labor5;

public class Main {
    public static void main(String[] args) {
        String s =
                "Внимание. Предварительный просмотр слайдов используется исключительно в ознакомительных целях и может не давать представления о всех возможностях презентации. Если вас заинтересовала данная работа, пожалуйста, загрузите полную версию.";
        Text text = new Text(s);
        System.out.println(text);
        System.out.println("+++++++++++++++++++++++++++++++");

        text.sortedSentencesByWordsCount();



    }
}



