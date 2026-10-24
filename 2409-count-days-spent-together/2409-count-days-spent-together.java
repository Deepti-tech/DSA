class Solution {
    private int getMonth(String date) {
        String[] parts = date.split("-");
        String month = parts[0];
        return Integer.parseInt(month);
    }
    private int getDayOfYear(String date) {
        String[] parts = date.split("-");
        int month = Integer.parseInt(parts[0]);
        int day = Integer.parseInt(parts[1]);

        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i = 0; i < month - 1; i++) {
            day += days[i];
        }
        return day;
    }
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        // if(getMonth(leaveAlice) < getMonth(arriveBob) || getMonth(leaveBob) < getMonth(arriveAlice)){
        //     return 0;
        // }
        int meet = Math.max(getDayOfYear(arriveAlice), getDayOfYear(arriveBob));
        int seperate = Math.min(getDayOfYear(leaveAlice), getDayOfYear(leaveBob));
        if(seperate - meet + 1 < 0){
            return 0;
        }
        return seperate - meet + 1;
    }
}