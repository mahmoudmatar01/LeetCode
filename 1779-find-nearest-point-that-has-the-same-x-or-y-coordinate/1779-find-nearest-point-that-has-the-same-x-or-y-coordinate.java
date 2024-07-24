class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int minDistance = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int i = 0; i < points.length; i++) {
            int[] point = points[i];
            int px = point[0];
            int py = point[1];

            if (px == x || py == y) {
                int distance = Math.abs(px - x) + Math.abs(py - y);
                if (distance < minDistance) {
                    minDistance = distance;
                    minIndex = i;
                }
            }
        }

        return minIndex;
    }
}