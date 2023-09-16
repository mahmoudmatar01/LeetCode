class Solution {
    public int findContentChildren(int[] g, int[] s) {
       Arrays.sort(g);
        Arrays.sort(s);
int contentChildren = 0;

for (int j = 0,i=0; i < g.length && j < s.length; j++) {
    if (s[j] >= g[i]) {
        contentChildren++;
        i++;
    }
}

return contentChildren;
    }
}