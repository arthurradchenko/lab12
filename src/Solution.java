public class Solution {
    public static String []parse(String text){
        text = text.replaceAll("[^a-zA-z]", " ");
        String []words = text.split("\\s+");
//        for (int i = 0; i < words.length; i++) System.out.println(words[i]);
        return words;
    }
    public static void out (String []words){
        for (int i = 0; i < words.length; i++){
            for (int j = 0; j < words.length; j++){
                if (words[i].toLowerCase().charAt(words[i].length()-1) == words[j].toLowerCase().charAt(0) && i!=j)
                    System.out.println(words[i]+ " -> "+words[j]);
            }
        }
    }
}
