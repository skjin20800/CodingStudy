package javacoding;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class 재귀클래스{
	// 흠 .. 잘 실행되는데 왜 틀렸는지 모르겠다 ㅠㅠ
	int sum = 0;	
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	BufferedWriter sumResult = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public void 메인함수 (int result,int from, int to, int other) throws IOException {
		this.sum= sum+1;
		if(result == 1) {
			bw.write(from+" "+to+"\n");
			return ;
			}		
		메인함수(result-1,from,other,to);
		bw.write(from+" "+to+"\n");
		메인함수(result-1,other,to,from);
	}		
}


public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String brStr = br.readLine();
		Integer brInt = Integer.parseInt(brStr);
		재귀클래스 a = new 재귀클래스();
			a.메인함수(brInt, 1, 3, 2);
		
		a.sumResult.write(a.sum+"\n");
		a.sumResult.flush();
		a.bw.flush();
		a.sumResult.close();
		a.bw.close();
		
		
}
}

