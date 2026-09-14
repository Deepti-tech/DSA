class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int x1 = rec1[0], y1 = rec1[1], x2 = rec1[2], y2 = rec1[3]; 
        int x11 = rec2[0], y11 = rec2[1], x22 = rec2[2], y22 = rec2[3]; 
        if(x1<x22 && y1<y22 && x2>x11 & y2>y11) 
            return true;

        return false;
    }
}
