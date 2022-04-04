package day13generic;

public class MaxFinderString {
    public static String findMax2(String word1, String word2, String word3) {
        String max= word1;
        if (word2.compareTo(max)>0){
            max=word2;
        }
        if(word3.compareTo(max)>0){
            max=word3;
        }
        return max;
    }
}
