import java.io.*;
import java.util.*;

public class Main {

    static FastScanner fs = new FastScanner(System.in);
    static PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    static final int MOD = 1_000_000_007;
    static final int INF = (int) 1e9;

    public static void main(String[] args) throws Exception {
        int t = fs.nextInt();
        //int t = 1;
        
        while (t-- > 0) {
            solve();
        }
        
        out.flush();
    }

    static void solve() {
        int n = fs.nextInt();
        int[] a = new int[n];
        List<Integer> b = new ArrayList<>();
        List<Integer> c = new ArrayList<>();
        int minVal = Integer.MAX_VALUE;
        
        for(int i = 0; i < n; i++) {
            a[i] = fs.nextInt();
            minVal = Math.min(minVal, a[i]);
        }
        
        for(int i = 0; i < n; i++) {
            if(a[i] == minVal) {
                b.add(a[i]);
            } else {
                c.add(a[i]);
            }
        }
        
        if(c.isEmpty()) {
            out.println(-1);
        } else {
            out.print(b.size());
            out.print(" ");
            out.print(c.size());
            out.println(" ");
            
            for(int num : b) {
                out.print(num);
                out.print(" ");
            }
            out.println(" ");
            
            for(int num : c) {
                out.print(num);
                out.print(" ");
            }
            
            out.println(" ");
        }
        
        
    }

    // --------- Fast Scanner ----------
    static class FastScanner {
        private final BufferedReader br;
        private StringTokenizer st;

        FastScanner(InputStream is) {
            br = new BufferedReader(new InputStreamReader(is));
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    String line = br.readLine();
                    if (line == null) return null;
                    st = new StringTokenizer(line);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            try {
                st = null;
                return br.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
