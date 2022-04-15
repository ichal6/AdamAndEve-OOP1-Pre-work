import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class SearchEngine {
    public static void main(String[] args){
        System.out.println(find("-..,.44$&%$--,.,", "-..,.44$&%$--,.,"));
    }

    static int find(String needle, String haystack){
        needle = "\\Q" + needle.replaceAll("_", "\\\\E.\\\\Q") + "\\E";
        
        Pattern word = Pattern.compile(needle);
        Matcher match = word.matcher(haystack);

        while (match.find()) {
            return match.start();
        }
        
        return -1;
    }

}

