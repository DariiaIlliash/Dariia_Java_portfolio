package day07;

public class TypeCasting {
	public static void main(String[] args) {
		byte bNum = 10;
		int num = bNum;
		System.out.println(num);
		float fNum = num;
		System.out.println(fNum);
		int numTwo = 50;
		byte bNumTwo =(byte) numTwo;
		System.out.println(bNumTwo);
		double dinnerBill = 99.99;
		int finalBill = (int)dinnerBill;
		System.out.println(finalBill); // 99
		System.out.println("----------------");
		
		int intValue = 1000;
		byte byteValue = (byte)intValue;
		System.out.println(byteValue); // -24
	}

}
