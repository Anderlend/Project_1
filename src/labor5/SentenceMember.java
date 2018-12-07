package labor5;

public abstract class SentenceMember {
}



/**import java.util.Scanner;

 public class Main {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 StringBuilder srBuilder = new StringBuilder();
 System.out.println("Введите строку:");
 String x = scanner.nextLine();
 srBuilder.append(x);
 String[] b = x.split(" ");
 int[] c = new int[b.length];
 System.out.println();
 System.out.println("Строка вида:");
 System.out.println(srBuilder);
 System.out.println("Введите символ:");
 char searchCharacter = scanner.nextLine().charAt(0);
 for (int i = 0; i < b.length; i++) {
 int S = 0;
 for (int j = 0; j < b[i].length(); j++) {
 if (b[i].charAt(j) == searchCharacter) {
 S++;
 }
 }
 c[i] = S;
 }
 int i;
 for (i = 0; i < c.length; i++) {
 System.out.println(c[i]);
 }
 i=0;
 int tmp1;
 String tmp2;
 while( i < c.length - 1) {
 if (c[i + 1] < c[i]) {
 tmp1 = c[i];
 c[i] = c[i + 1];
 c[i + 1] = tmp1;
 tmp2 = b[i];
 b[i] = b[i + 1];
 b[i + 1] = tmp2;
 i=0;
 }
 else i++;
 }

 System.out.println();
 System.out.println("Отсортированная строка вида:");
 for (i = 0; i < b.length; i++) {
 System.out.println(b[i]);
 }

 }
 }
 */