package javacoding;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {

		  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	        StringTokenizer st = new StringTokenizer(reader.readLine());
	        int a = Integer.parseInt(st.nextToken());
	        int b = Integer.parseInt(st.nextToken());
	        int c = Integer.parseInt(st.nextToken());
	        if(b >= c) {
	            System.out.println(-1);
	        } else {
	            System.out.println(a/(c-b)+1);
	        }


	
			
		
}
}

