class Student
{
 int id;
 String name;
 static String Branch="ece";
 public void m1()
  {
   System.out.println(id+""+name+""+Branch);
      }
	  public static void main(String args[])
	  {
	   Student s1=new Student();
	   s1.id=101;
	   s1.name="pavan";
	   
	   s1.m1();
	    Student s2=new Student();
		s2.id=102;
		s2.name="chandhu";
		s2.Branch="cse";

		s2.m1();
		}
		}
		