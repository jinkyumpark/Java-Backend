package days18;

public class Extends11_Interface03 {
	public static void main(String[] args) {
		SubC2 c1 = new SubC2();
		InterC_Super1 s1 = new SubC2();
		InterC_Super2 s2 = new SubC2();
		InterC_Sub s3 = new SubC2();
		
		s1.interC_Super1Test();
		s2.interC_Super2Test();
	}
}

interface InterC_Super1 {
	public abstract void interC_Super1Test();
}

interface InterC_Super2 {
	public abstract void interC_Super2Test();
}

interface InterC_Sub extends InterC_Super1, InterC_Super2 {
	public abstract void interC_SubTest();
}

class SubC2 implements InterC_Sub {
	@Override
	public void interC_Super1Test() {}
	@Override
	public void interC_Super2Test() {}
	@Override
	public void interC_SubTest() {}
}
