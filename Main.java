import java.util.*;

class Main {
  public static void main(String[] args) {
    SpellChecker checker = new SpellChecker();
    checker.print10();
    checker.printStartsWith("ab");
    System.out.print("Enter a word to spell check or q to quit: ");
    Scanner scan = new Scanner(System.in);
    String word = scan.nextLine();
    while (!word.equals("q")) {
      if (checker.spellcheck(word) == true)
        System.out.println(word + " is spelled correctly!");
      else
        System.out.println(word + " is misspelled!");

      System.out.print("Enter a word to spell check or q to quit: ");
      word = scan.nextLine();
      }    
    scan.close();
  }
}
