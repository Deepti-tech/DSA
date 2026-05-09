// Return an array answer of size n where answer[i] is the rank of the ith athlete.

class ScoreIndexPair{
    private int value;
    private int index;

    ScoreIndexPair(int value, int index) {
        this.value = value;
        this.index = index;
    }
    public int getValue() {
        return value;
    }
    public int getIndex() {
        return index;
    }
}
class Solution {
    private String medal(int i){
        switch (i){
            case 0:
                return "Gold Medal";
            case 1:
                return "Silver Medal";
            case 2:
                return "Bronze Medal";
        }
        return i+1+"";
    }

    public String[] findRelativeRanks(int[] score) {
        List<ScoreIndexPair> list = new ArrayList<>();
        for(int i=0; i < score.length; i++) {
            list.add(new ScoreIndexPair(score[i], i));
        }

        list.sort((a,b) -> b.getValue() - a.getValue());

        String[] rank = new String[score.length];
        for(int i=0; i < score.length; i++) {
            int position = list.get(i).getIndex();
            rank[position] = medal(i);
        }
        return rank;
    }
}
