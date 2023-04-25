package arrays.medium;

//Problem Link: https://practice.geeksforgeeks.org/problems/majority-element-1587115620/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=majority-element

public class MajorityElement {

	public static int majorityElement(int a[], int size){
        int ans = 0;
        int cnt = 0;
        for(int i = 0; i < size; i++){
            if(cnt == 0){
                ans = a[i];
                cnt = 1;
                continue;
            }
            
            if(a[i] == ans){
                cnt++;
            }
            else{
                cnt--;
            }
            
        }
        
        int cnt1 = 0;
        for(int i = 0; i < size; i++){
            if(a[i] == ans){
                cnt1++;
            }
        }
        
        if(cnt1 > (size/2)){
            return ans;
        }
        return -1;
    }
	
	public static void main(String[] args) {
		int size = 10;
		int[] arr = {1,2,2,1,1,2,3,3,5,2};
		int ans = MajorityElement.majorityElement(arr, size);
		System.out.println(ans);
	}
	
}
