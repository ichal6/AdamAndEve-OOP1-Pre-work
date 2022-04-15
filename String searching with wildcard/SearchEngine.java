public class SearchEngine {
    public static void main(String[] args){
        System.out.println(find("ex_", "googgoogleggggoooglxeplexhexflexmexkex"));
    }

    static int find(String needle, String haystack){
        char[] needleAsArray = needle.toCharArray();
        String[] haystackSplit = haystack.split(" ");
        int index = 0;
        int startIndex = -1;
        boolean isCorrect = true;

        for(String word: haystackSplit){
            if(needle.length() > word.length()){
                continue;
            }
            while(index < needle.length()){
                if(needleAsArray[index] == '_'){
                    
                }else if(word.charAt(index) != needleAsArray[index]){
                    isCorrect = false;
                }
                index++;
            }
            if(isCorrect == true){
                startIndex = haystack.indexOf(word);
                return startIndex;
            }
            index = 0;
            isCorrect = true;
        }    
        return -1;
    }
}

