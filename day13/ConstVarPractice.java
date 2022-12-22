package day13;

public class ConstVarPractice {
	public static final double PERCENTAGE =17;
  public static double getPercentValue(int value) {
	  return  value * (PERCENTAGE/ 100);
  }
  public static double addPercentValue(int value) {
	  double percentValue = value * (PERCENTAGE/ 100);
	  return value + getPercentValue(value);
  }
  public static double minusPercentValue(int value) {
	  double percentValue = value * (PERCENTAGE/ 100);
	  return value - getPercentValue(value);
  }
  public static void main(String[] args) {
	  System.out.println(getPercentValue(100));
	  System.out.println(addPercentValue(100));
	  System.out.println(minusPercentValue(100));
	  }
}



