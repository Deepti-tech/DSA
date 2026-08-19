// Return the largest almost missing integer from nums. If no such integer exists, return -1.
class Solution {
    public int largestInteger(int[] nums, int k) {
        int start = 0, end = k-1, len = nums.length;

        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num, 0);
        }
        
        while(end < len){
            Set<Integer> currentWindow = new HashSet<>();
            for(int i = start; i <= end; i++){
                int key = nums[i];
                if(!currentWindow.contains(key)){
                    currentWindow.add(key);
                    if(map.get(key) == 0){
                        map.put(key, 1);
                    }else if(map.get(key) == 1){
                        map.put(key, -1);
                    }
                }
            }
            start++; end++;
            System.out.println("start: "+start);
            System.out.println("end: "+end);
            System.out.println("Map elements before: " + map);
        }

        int max = Integer.MIN_VALUE;

        for (Map.Entry<Integer, Integer> element : map.entrySet()) {
            int value = element.getValue();
            int num = element.getKey();
            if(value == 1){
                max = Math.max(max, num);
            }
            System.out.println("Map elements after: " + map);
        }

        return max != Integer.MIN_VALUE ? max : -1;
    }
}
