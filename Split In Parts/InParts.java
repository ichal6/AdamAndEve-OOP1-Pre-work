public class InParts {
    public static void main(String[] args){
        System.out.println(splitInParts("supercalifragilisticexpialidocious", 3));
    }

    public static String splitInParts(String s, int partLength) {
        StringBuilder sb = new StringBuilder(s);
        int lengthString = s.length();
        for(int cutPosition = partLength; cutPosition < lengthString; cutPosition += partLength){
            sb.insert(cutPosition, " ");
            cutPosition++;
            lengthString = sb.length();
        }
        
        return sb.toString();
    }
}
