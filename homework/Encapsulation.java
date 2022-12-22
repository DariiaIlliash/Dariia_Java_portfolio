package homework;
class Person {
    private String firstName;
   private int Age;
   public String getFirstName() {
	   return firstName;
   }
   public void setFirstName(String name) {
	   this.firstName= firstName;
   }
   public int getAge() {
	   return Age;
   }
   public void setAge(int age) {
	   if(age<0) {
		   throw new IllegalArgumentException("age cannot be negative");
	   }
	   this.Age = Age;
   }
}


   
