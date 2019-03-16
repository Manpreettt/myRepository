class ToTest {

	// private static final int CONST = 67;
	private int abc;
	// public ToTest(int con){
	// 	this.CONST = con;
	// }
	
	public static void setabc(int num) {
		
		ToTest t = new ToTest();
		t.abc = t.abc+num;
	}

	public int getabc() {
		return abc;
	}
}

public class Testing2 {

	public static void main(String[] args) {
		
		ToTest tt = new ToTest();
		tt.setabc(55);
		System.out.println(tt.getabc());
	}

}