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
        int k = fs.nextInt();
        int x = fs.nextInt();
        int maxValue = Integer.MIN_VALUE;
        
        if(x != 1) {
            out.println("YES");
            out.println(n);
            
            for(int i = 1; i <= n; i++) {
                out.print(1);
                out.print(" ");
            }
            
            out.println(" ");
        } else if(k == 1) {
            out.println("NO");
        } else if(k == 2) {
            if(n % 2 == 0) {
                out.println("YES");
                out.println(n / 2);
                
                for(int i = 1; i <= (n / 2); i++) {
                    out.print(2);
                    out.print(" ");
                }
                
                out.println(" ");
            } else {
                out.println("NO");
            }
        } else {
            if(n % 2 == 0) {
                out.println("YES");
                out.println(n / 2);
                
                for(int i = 1; i <= (n / 2); i++) {
                    out.print(2);
                    out.print(" ");
                }
                
                out.println(" ");
            } else {
                out.println("YES");
                out.println(1 + (n - 3) / 2);
                
                out.print(3);
                out.print(" ");
                
                for(int i = 1; i <= (n - 3) / 2; i++) {
                    out.print(2);
                    out.print(" ");
                }
                
                out.println(" ");
            }
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
