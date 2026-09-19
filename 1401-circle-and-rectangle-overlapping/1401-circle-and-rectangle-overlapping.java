class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        int nearestX = Math.max(x1, Math.min(x2, xCenter));
        int nearestY = Math.max(y1, Math.min(y2, yCenter));

        if(x1 > xCenter){
            nearestX = x1;
        }else if(x2 < xCenter){
            nearestX = x2;
        }else{
            nearestX = xCenter;
        }

        long dx = xCenter - nearestX;
        long dy = yCenter - nearestY;

        if(dx * dx + dy * dy <= radius * radius){
            return true;
        }
        return false;
    }
}

// explaination of nearestX
// if(x1 > xCenter){
//     nearestX = x1;
// }else if(x2 < xCenter){
//     nearestX = x2;
// }else{
//     nearestX = xCenter;
// }