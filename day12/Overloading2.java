
package day12;
public class Overloading2 {
    public static void main(String args[]){
    	
    }
      public static void printMax(int num, int num){  // calling first method
        System.out.println(max(1, 2));
      }
        public static void printMax(int num, int num, int num){// calling second method
        System.out.println(max(6, 8, 5));
        }
        public static void printMax(double num, double num){// calling third method
        System.out.println(max(1.5, 4.2));
    }
}
