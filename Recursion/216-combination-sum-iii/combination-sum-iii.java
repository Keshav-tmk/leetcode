class Solution {
    public void comb(int i,int[] arr,List<List<Integer>>temp,List<Integer>ans,int k,int n,int sum){
        if(i==arr.length ){
            if(ans.size()==k &&sum==n)
                temp.add(new ArrayList<>(ans));
            return;
        }

        ans.add(arr[i]);
        sum+=arr[i];
        comb(i+1,arr,temp,ans,k,n,sum);
        ans.remove(ans.size()-1);
        sum-=arr[i];
        comb(i+1,arr,temp,ans,k,n,sum);
    }
    public List<List<Integer>> combinationSum3(int k, int n) {

        int [] arr={1,2,3,4,5,6,7,8,9};
        List<List<Integer>> temp=new ArrayList<>();
        comb(0,arr,temp,new ArrayList<>(),k,n,0);
        return temp;

        
    }
}