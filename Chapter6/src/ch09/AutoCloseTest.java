package ch09;

public class AutoCloseTest {
	public static void main(String[] args) {
		AutoCloseable obj = new AutoCloseableObj();
		//try(obj){ // Java 9 부터 가능. 필자는 불가능
		try(AutoCloseable obj2 = new AutoCloseableObj();){
			throw new Exception();
		} catch (Exception e) {
			System.out.println("exception");
		}
		System.out.println("end");
	}
}
