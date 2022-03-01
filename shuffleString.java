class Solution {
    public String restoreString(String s, int[] indices) {
        String[] chanched = new String[s.length()];
        int j = 0;

        for(int i = 0 ; i < s.length(); i++){
            chanched[indices[i]] = String.valueOf(s.charAt(i));
        }
        
        StringBuffer sb = new StringBuffer();
        for(String se : chanched){
            sb.append(se);
        }

        return sb.toString();
        
    }
}
