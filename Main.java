import java.util.*;
import java.io.*;

public class Main{
    static class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader(){
            br=new BufferedReader(new InputStreamReader(System.in));
        }
        String next(){
            while(st==null || !st.hasMoreTokens()){
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt(){
            return Integer.parseInt(next());
        }
        long nextLong(){
            return Long.parseLong(next());
        }
        double nextDouble(){
            return Double.parseDouble(next());
        }
        String nextLine(){
            String str="";
            try {
                str=br.readLine().trim();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    static class FastWriter {
		private final BufferedWriter bw;

		public FastWriter() {
			this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
		}

		public void print(Object object) throws IOException {
			bw.append("" + object);
		}

		public void println(Object object) throws IOException {
			print(object);
			bw.append("\n");
		}

		public void close() throws IOException {
			bw.close();
		}
	}
	public static int lb(int arr[], int N, int X)  {
      
        int mid;
        int low = 0;
        int high = N;
 
        while (low < high) {
            mid = low + (high - low) / 2;
            if (X <= arr[mid]) high = mid;
            else low = mid + 1;
        }
   
        if(low < N && arr[low] < X) low++;
    
        return low;
    }
    
    public static int ub(int arr[], int N, int X)  {
      
        int mid;
        int low = 0;
        int high = N;
 
        while (low < high) {
            mid = low + (high - low) / 2;
            if (X >= arr[mid]) low = mid+1;
            else high = mid;
        }
   
        if(low < N && arr[low] <= X) low++;
    
        return low;
    }
    public static void main(String[] args) {
        try {
            FastReader in=new FastReader();
            FastWriter out = new FastWriter();
            //int tc=in.nextInt();
            int tc = 1;
            while(tc-- > 0){
                // write code here
                int a = in.nextInt();
                String b = in.nextLine();
                
                out.println(a+" "+b);
            }
            out.close();
        } catch (Exception e) {
            return;
        }
    }
}
