// Return the distance from the origin of the furthest point you can get to after n moves.
class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int l=0, r=0,u=0;
        for(int i=0; i<moves.length(); i++){
            switch(moves.charAt(i)){
                case 'L':
                    l++; break;
                case 'R':
                    r++; break;
                default:
                    u++;
            }
        }
        return Math.abs(r-l) + u;
    }
}
