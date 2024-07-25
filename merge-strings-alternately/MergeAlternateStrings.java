class MergeAlternateStrings {
    public String mergeAlternately(String word1, String word2) {
        String result = ""; //could use a StringBuilder here instead too

        char[] word1Array = word1.toCharArray();
        System.out.println(word1Array.length);
        char[] word2Array = word2.toCharArray();
        System.out.println(word1Array.length);

        int j = 0;
        for (int i = 0; i < (word1Array.length + word2Array.length); i++) { 
            if (i < word1Array.length) {
                result += String.valueOf(word1Array[i]);
            }

            if (j < word2Array.length) {
                result += String.valueOf(word2Array[j]);
                j++;
            }
        }

        System.out.println(result);
        return result;
    }
}