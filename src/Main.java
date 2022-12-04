import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static String strings[];
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        strings = new String[6];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = console.nextLine();
        }
        for (int i = 0; i < strings.length; i++) {
            String check = strings[i];
            for (int j = i+1; j < strings.length; j++) {
                if(check==null){
                    break;
                }
                if(check.equals(strings[j])) {
                    strings[j] = null;
                    strings[i] = null;
                }
            }
        }
        System.out.println(Arrays.toString(strings));
    }
}