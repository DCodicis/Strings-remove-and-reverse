import java.util.Scanner;

public class Program {

    public static String unspare(String myStr) {
        String[] words = myStr.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            StringBuilder wordBuilder = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (wordBuilder.toString().indexOf(c) == -1) {
                    wordBuilder.append(c);
                }
            }
            result.append(wordBuilder.toString() + " ");
        }
        return result.toString().trim();
    }

    public static String reverse(String myStr) {
        String[] words = myStr.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            StringBuilder wordBuilder = new StringBuilder(word);
            wordBuilder.reverse();
            result.append(wordBuilder.toString() + " ");
        }
        return result.toString().trim();
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("The Start");
        while(true){
            String word = s.nextLine();
            if(word.length()==0){
                break;
            }
            System.out.println(unspare(word));
            System.out.println(reverse(word));
        }
        System.out.println("The End");
    }
}
