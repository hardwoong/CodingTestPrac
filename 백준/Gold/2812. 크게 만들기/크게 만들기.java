import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		String input = br.readLine();
		char[] arr = input.toCharArray();
		Deque<Character> dq = new ArrayDeque<>();

		for (int i = 0; i < arr.length; i++) {
			while (!dq.isEmpty() && k > 0 && dq.getLast() < arr[i]) {
				dq.removeLast();
				k--;
			}
			dq.addLast(arr[i]);
		}

		StringBuilder ans = new StringBuilder();
		while (dq.size() > k) {
			ans.append(dq.removeFirst());
		}

		bw.write(ans.toString() + "\n");
		bw.flush();
	}
}
