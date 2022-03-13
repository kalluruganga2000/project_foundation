
public class Vararg_Demo {
	//this is VarArg concept
	//Araay is static
	//VarArgument is Dynamic
	
	void add(int...i ) {
		//this is for each
		for(int m:i) {
			System.out.println(m);
		}
	}
	public static void main(String[] args) {
		Vararg_Demo v=new Vararg_Demo();
		v.add(2,3,4);
		v.add(2,3,4,5,6);
	}

}
