class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuffer wordOne = new StringBuffer();
        StringBuffer wordTwo = new StringBuffer();
        for(String s : word1){
            wordOne.append(s);
        }
        for(String s : word2){
            wordTwo.append(s);
        }
        return wordOne.toString().equals(wordTwo.toString());
    }
}
