class MergeAlternateStrings {
    public String mergeAlternately(String word1, String word2) {
        String empty = "";
        String mergeWords = "";

        char[] word1Array = word1.toCharArray();
        char[] word2Array = word2.toCharArray();

        int j = 0;
        for (int i = 0; i < word1Array.length; i++) {
            mergeWords += String.valueOf(word1Array[i]);
            mergeWords += String.valueOf(word2Array[j]);
            j++;

            // mergeWords += String.valueOf(word2Array[i]);
            // mergeWords + String.valueOf(word2Array[i]);
        }


        return mergeWords;
    }
}