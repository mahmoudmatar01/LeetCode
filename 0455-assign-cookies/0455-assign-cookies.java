class Solution {
    public int findContentChildren(int[] g, int[] s) {
       Arrays.sort(g);
Arrays.sort(s);
int contentChildren = 0;
int i = 0;
int j = 0;

for (i = 0, j = 0; i < g.length && j < s.length; j++) {
    if (s[j] >= g[i]) {
        contentChildren++;
        i++;
    }
}

return contentChildren;
    }
}