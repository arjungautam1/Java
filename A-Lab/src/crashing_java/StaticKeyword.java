package crashing_java;

public class StaticKeyword {
	int i;
	int j;
	static int k;
	void show()
	{
		System.out.println("value of i="+i);
		System.out.println("value of k="+k);
	}
	public static void main(String[] args) {
		StaticKeyword ob=new StaticKeyword();
		ob.i=10;
		StaticKeyword.k=20;
		ob.show();
		
	}

}
