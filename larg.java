import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class larg {
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a=Integer.parseInt(br.readLine());
		int b=Integer.parseInt(br.readLine());
		int c=Integer.parseInt(br.readLine());
		if(a>b && a>c)
			System.out.println(a);
		else if(b>c && b>a)
		System.out.println(b);
		else
			System.out.println(c);
		
	}
}
