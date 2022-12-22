package homework;
public class ho

public static void main(String args[]){
    int ticketEncode = caughtSpeeding(60, false);
    System.out.println(ticketEncode);
}

public static int caughtSpeeding(int speed, boolean isBirthday) {
  int res0 = 0;
  int res1 = 1;
  int res2 = 2;
  if(speed <= 60){
	  
    System.out.println(res0);
    
  }else if(speed >= 61 && speed <=80){
    System.out.println(res1);
    
  }else if(speed >=81){
    System.out.println(res2);
    
  }else if(isBirthday){
    System.out.println(speed + 5);
  }
}
}