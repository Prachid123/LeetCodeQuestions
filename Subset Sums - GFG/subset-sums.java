//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
			ArrayList<Integer> arr = new ArrayList<>();
			for(int i = 0; i < N ; i++){
			    arr.add(sc.nextInt());
			}
            Solution ob = new Solution();
         
            ArrayList<Integer> ans = ob.subsetSums(arr,N);
            Collections.sort(ans);
            for(int sum : ans){
                System.out.print(sum+" ");
            }
            System.out.println();
        }  
    }
}

// } Driver Code Ends


//User function Template for Java//User function Template for Java
class Solution{
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        int sum=0;
        ss(0,sum,arr,N,result);
        Collections.sort(result);
        return result;
        
    }
    public void ss(int i,int sum,ArrayList<Integer> arr,int N,ArrayList<Integer> result){
        if(i==N){
            result.add(sum);
            return;
        }
        ss(i+1,sum+arr.get(i),arr,N,result);
        ss(i+1,sum,arr,N,result);
        
    }
}