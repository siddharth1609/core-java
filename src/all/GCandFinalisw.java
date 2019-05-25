package all;

public class GCandFinalisw {
	public static void main(String[] args) {
		GCandFinalisw a = new GCandFinalisw();
		GCandFinalisw b=  new GCandFinalisw();
		
		a=  null;
		b=  null;
		
		System.gc();
		
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Gc");
	}

}
