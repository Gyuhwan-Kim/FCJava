package ch10;

public class TypeConversionTest {
	public static void main(String[] args) {
		byte bNum = 125;
		int iNum = bNum;
		
		System.out.println(iNum);
		
//		int iNum2 = 255;
//		byte bNum2 = iNum2;
//		
//		System.out.println(iNum2);
		
		double dNum = 1.2;
		float fNum = 0.9f;
		
		int iNum1 = (int)dNum + (int)fNum;
		int iNum2 = (int)(dNum+fNum);
		
		System.out.println(iNum1);
		System.out.println(iNum2);
	}
}
