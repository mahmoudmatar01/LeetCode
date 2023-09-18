class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
         List<Character> magazineCharList = new ArrayList<>();

        for (char c : magazine.toCharArray()) {
            magazineCharList.add(c);
        }

       
        for (int i = 0; i < ransomNote.length(); i++) {
            char character = ransomNote.charAt(i);            
            if (magazineCharList.contains(character)) {
                magazineCharList.remove((Character) character);
            } else {
                return false;
            }
        }

        return true;
    }
}