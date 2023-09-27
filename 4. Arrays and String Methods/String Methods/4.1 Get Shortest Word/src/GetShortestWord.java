public class GetShortestWord
{
    public static String getShortestWord(String word,String word2){
        if (word.length()>word2.length()){
            return word2;
        }else{
            return word;
        }

    }
}