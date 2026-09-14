// Return the earliest possible time at which the tourist can finish both rides.
class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int min = Integer.MAX_VALUE;
        int minLand = Integer.MAX_VALUE, minWater = Integer.MAX_VALUE;

        for(int i=0; i<landStartTime.length; i++){
            minLand = Math.min(minLand, landStartTime[i] + landDuration[i]);
        }
        for(int i=0; i<waterStartTime.length; i++){
            minWater = Math.min(minWater, waterStartTime[i] + waterDuration[i]);
            min = Math.min(min, Math.max(minLand, waterStartTime[i]) + waterDuration[i]);
        }
        for(int i=0; i<landStartTime.length; i++){
            min = Math.min(min, Math.max(minWater, landStartTime[i]) + landDuration[i]);
        }
        return min;
    }
}
