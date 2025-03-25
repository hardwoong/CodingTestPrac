import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
 
public class Main {
	static int N, C, H, W, K, M, T;
	static int[] arr;
	static int answer = 0;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		T = Integer.parseInt(st.nextToken());
		while(T-- > 0) {
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			arr = new int[N];
			st = new StringTokenizer(br.readLine());
			for(int i=0;i<N;i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			sb.append(stock()).append("\n");
		}
		System.out.println(sb.toString());
		
	}
	
	static long stock() {
		long max = arr[N-1];
		long profit = 0;
		for(int i=N-1; i>=0; i--) {
			if(arr[i] <= max) {
				profit += max - arr[i];
			}else if(arr[i] > max) {
				max = arr[i];
			}
		}
		return profit;
	}
	
}