//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String s = br.readLine().trim();
            String[] S1 = s.split(" ");
            int n = Integer.parseInt(S1[0]);
            int m = Integer.parseInt(S1[1]);
            Solution ob = new Solution();
            int ans = ob.NthRoot(n, m);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int helper(int x,int n,int m){
           long ans=1;
            for(int i=0;i<n;i++){
                ans*=x;
            
            if(ans>m){
                return 1;
            }
            }
            if(ans==m){
                return 0;
            }
            else{
                return 2;
            }
            
        }
    public int NthRoot(int n, int m)
    {
        // code here
        int s=1;
        int e=m;
        
        while(s<=e){
            int mid=e+(s-e)/2;
            int aho = helper(mid,n,m);
            if(aho==0){
                return mid;
            }
            if(aho==1){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
            
        }
        return -1;
    }
}