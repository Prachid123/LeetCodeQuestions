//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);

            int start[] = new int[n];
            int end[] = new int[n];

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++)
                start[i] = Integer.parseInt(inputLine[i]);

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) 
                end[i] = Integer.parseInt(inputLine[i]);
                
            int ans = new Solution().maxMeetings(start, end, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


class Solution 
{
    static class pair{
        int start;
        int end;
        int idx;
        public pair(int start,int end,int idx){
            this.start=start;
            this.end=end;
            this.idx=idx;
        }
    }   
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static int maxMeetings(int start[], int end[], int n)
    {
        // add your code here
        ArrayList<pair> al = new ArrayList<>();
        for(int i=0;i<n;i++){
            al.add(new pair(start[i],end[i],i));
        }
        Collections.sort(al,(a,b)->(a.end-b.end));
        int count=1;
        int prevIdx=0;
        for(int i=0;i<n;i++){
            if(al.get(i).start>al.get(prevIdx).end){
                count++;
                prevIdx=i;
            }
        }
        return count;
        
        
    }
}
