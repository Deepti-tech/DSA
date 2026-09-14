// Return the maximum distance between two houses with different colors.
class Solution {
    public int maxDistance(int[] colors) {
        int dist=0, n=colors.length-1;
        for(int i=n; i>=0; i--){
            if(colors[0] != colors[i]){
                dist = Math.max(dist, i);
                break;
            }
        }
        for(int i=0; i<=n; i++){
            if(colors[n] != colors[i]){
                dist = Math.max(dist, n-i);
                break;
            }
        }
        return dist;
    }
}
