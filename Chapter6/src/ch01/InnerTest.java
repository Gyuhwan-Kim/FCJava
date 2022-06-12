package ch01;

class OuterClass{
	private int num = 10;
	private static int sNum = 20;
	private InnerClass innerClass;
	//static int sInNum;
	
	public OuterClass() {
		innerClass = new InnerClass();
	}
	
	class InnerClass{
		int iNum = 100;
		
		void innerTest() {
			System.out.println("OuterClass num = " + num + "(외부 클래스의 인스턴스 변수)");
			System.out.println("OuterClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
			System.out.println("InnerClass inNum = " + iNum + "(내부 클래스의 인스턴스 변수)");
		}
	}
	
	public void usingClass() {
		innerClass.innerTest();
	}
	
	static class InnerStaticClass {
		int iNum = 100;
		static int sInNum = 200;
		
		void innerTest() {
			System.out.println("InnerClass iNum = " + iNum + "(내부 클래스의 인스턴스 변수)");
			System.out.println("OuterClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
			System.out.println("InnerClass sInNum = " + sInNum + "(내부 클래스의 스태틱 변수)");
		}
		
		static void sTest() {
			System.out.println("OuterClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
			System.out.println("InnerClass sInNum = " + sInNum + "(내부 클래스의 스태틱 변수)");
		}
	}
}

public class InnerTest {
	public static void main(String[] args) {
		OuterClass outerClass = new OuterClass();
		outerClass.usingClass();
		
		System.out.println();
		
		OuterClass.InnerClass innerClass = outerClass.new InnerClass();
		innerClass.innerTest();
		
//		OuterClass.InnerStaticClass sInnerClass = new OuterClass.InnerStaticClass();
//		sInnerClass.innerTest();
//		
//		System.out.println();
//		
//		OuterClass.InnerStaticClass.sTest();
	}
}
