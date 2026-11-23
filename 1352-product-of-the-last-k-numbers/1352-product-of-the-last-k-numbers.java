class ProductOfNumbers {

    List<Integer> array;

    public ProductOfNumbers() {
        array = new ArrayList<>();
    }
    
    public void add(int num) {
        array.add(num);
    }
    
    public int getProduct(int k) {
        int len = array.size();
        int prod = 1;
        for(int i=len-1; i>=0 && k>0; i--){
            prod *= array.get(i);
            k--;
        }
        return prod;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */