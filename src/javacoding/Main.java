package javacoding;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class ���Ŭ����{
	// �� .. �� ����Ǵµ� �� Ʋ�ȴ��� �𸣰ڴ� �Ф�
	int sum = 0;	
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	BufferedWriter sumResult = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public void �����Լ� (int result,int from, int to, int other) throws IOException {
		this.sum= sum+1;
		if(result == 1) {
			bw.write(from+" "+to+"\n");
			return ;
			}		
		�����Լ�(result-1,from,other,to);
		bw.write(from+" "+to+"\n");
		�����Լ�(result-1,other,to,from);
	}		
}


public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String brStr = br.readLine();
		Integer brInt = Integer.parseInt(brStr);
		���Ŭ���� a = new ���Ŭ����();
			a.�����Լ�(brInt, 1, 3, 2);
		
		a.sumResult.write(a.sum+"\n");
		a.sumResult.flush();
		a.bw.flush();
		a.sumResult.close();
		a.bw.close();
		
		
}
}

