package methods;

public class Operations {

	
	private int a,b,c;
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public Operations(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public Operations() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int add(int x, int y,int z)
	{
		return x+y+z;
	}
	
	public int mul(int i, int j, int k)
	{
		return i*j*k;
	}
	
	public int add()
	{
		return a+b+c;
	}
}
