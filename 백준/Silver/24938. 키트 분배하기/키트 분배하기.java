import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        long arr[] = new long[n];
        long sum = 0;
        
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            sum += arr[i];
        }
        
        long r = sum / n;
        long result = 0;
        for (int i = 0; i < n - 1; i++) {
            if(arr[i]>=r) {
                arr[i + 1] += (arr[i] - r);
                result += (arr[i] - r);
            } else {
                arr[i + 1] -= (r - arr[i]);
                result += (r - arr[i]);
            }
        }
        
        System.out.println(result);
    }
}