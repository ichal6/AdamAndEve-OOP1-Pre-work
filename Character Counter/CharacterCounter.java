public class CharacterCounter {
  public static void main(String[] args){
    System.out.println(validateWord("nowy?:"));
  }

  public static boolean validateWord(String word) {
    boolean isNotEnd = true;
    word = word.toLowerCase();
    char[] wordAsChar = word.toCharArray();
    int lengthOfWord = word.length();
    int indexChar = 0;
    while(isNotEnd){
      char firstChar = wordAsChar[indexChar];
      char secondChar = wordAsChar[0];
      int countFirstChar = 0;
      int countSecondChar = 0;
      for(char oneChar: word.toCharArray() ){
        if(oneChar == firstChar){
          countFirstChar++;
        }
        else{
          secondChar = oneChar;
        }
      }

      for(char oneChar: word.toCharArray() ){
        if(oneChar == secondChar){
          countSecondChar++;
        }
      }

      if(countFirstChar != countSecondChar){
        return false;
      }
      else{
        
        indexChar++;
        if(lengthOfWord <= indexChar){
          isNotEnd = false;
        }
      }
    }
    return true;
  }
}
