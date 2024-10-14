class Solution {
    void rearrange(ArrayList<Integer> arr) {
        // code here
        List<Integer> positiveList = new ArrayList();
        List<Integer> negativeList = new ArrayList();
        List<Integer> opList = new ArrayList();
        for(Integer currVal : arr){
            if(currVal>=0){
                positiveList.add(currVal);
            } else {
                negativeList.add(currVal);
            }
        }
        //printing positive list
        int i=0,j=0,k=0;
        while(i<(positiveList.size() && j<negativeList.size()){
            arr.set(k++, positiveList.get(i++));
            arr.set(k++, negativeList.get(j++));
        }
        for(Integer val:arr){
            System.out.print(val);
        }
    }

    public static void main(String[] args) {

    }
}