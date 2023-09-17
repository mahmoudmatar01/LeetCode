class Solution {
    public String[] findRelativeRanks(int[] score) {
     
        String[]result=new String[score.length];
    Map<Integer, String> rankMap = new HashMap<>();
        rankMap.put(1, "Gold Medal");
        rankMap.put(2, "Silver Medal");
        rankMap.put(3, "Bronze Medal");
        int[] sortedScores = Arrays.copyOf(score, score.length);
        Arrays.sort(sortedScores);

        Arrays.stream(sortedScores).forEach(System.out::println);
    for (int i = 0; i < score.length; i++) {
        int element=score[i];
        int rank = score.length - Arrays.binarySearch(sortedScores, element);
                    result[i] = rank <= 3 ? rankMap.get(rank) : String.valueOf(rank);

    }


    return result;
    }
}