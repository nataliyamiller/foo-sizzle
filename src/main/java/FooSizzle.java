import java.io.Console;

public class FooSizzle {
  public static void main(String[] args) {

    Console myConsole = System.console();
    System.out.println("Type");
    String myAnswer = myConsole.readLine();
    isFooSizzle(myAnswer, 's', 'z');
  }

    public static void isFooSizzle (String userString, char find, char replace) {


      char[] convertedString = userString.toCharArray();

      for (Integer i = 0; i < convertedString.length; i++) {
        if (convertedString[i] == find ) {
            convertedString[i] = replace;



        }
      }
      System.out.println(String.valueOf(convertedString));
    }



}
