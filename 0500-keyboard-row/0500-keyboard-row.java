class Solution {
    public String[] findWords(String[] words) {
          String row1 = "qwertyuiop";
    String row2 = "asdfghjkl";
    String row3 = "zxcvbnm";

    List<String> result = new ArrayList<>();

    for (String word : words) {
        String row = (row1.indexOf(word.toLowerCase().charAt(0)) >= 0) ? row1 :
                (row2.indexOf(word.toLowerCase().charAt(0)) >= 0) ? row2 :
                        row3;

        boolean sameRow = true;
        for (char c : word.toLowerCase().toCharArray()) {
            if (row.indexOf(c) < 0) {
                sameRow = false;
                break;
            }
        }

        if (sameRow) {
            result.add(word);
        }
    }
    return result.toArray(new String[0]);
    }
}