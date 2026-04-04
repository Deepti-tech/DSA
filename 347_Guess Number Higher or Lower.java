// I pick a number from 1 to n. You have to guess which number I picked
/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int low = 0, high = n;
        while(low<high){
            int mid = low + (high-low)/2;
            switch(guess(mid)){
                case -1:
                    high = mid;
                    break;
                case 1:
                    low = mid+1;
                    break;
                case 0:
                    return mid;
            }
        }
        return low;
    }
}
