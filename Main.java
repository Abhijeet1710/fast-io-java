import java.util.*;
import java.io.*;

public class Main{
    static FastReader in;
    static FastWriter out;
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
	  
    public static void main(String[] args) {
        try {
            in=new FastReader();
            out = new FastWriter();
            //int tc=in.nextInt();
            int tc = 1;
            while(tc-- > 0) solve();
            out.close();
        } catch (Exception e) {
            return;
        }
    }
    
    private static solve() {
      
    }
	
	
class sortByItem implements Comparator<Node> {
        public int compare(Node a, Node b)
        {
            if(a.item > b.item) return 1;
            return -1;
        }
    }
    
  class Node {
        
        int ind;
        int item;
        boolean liked;
        
        public Node(int i, int e, char lik ) {
            ind = i;
            item = e;
            liked = (lik == '1') ? true : false;
        }
    }
}
