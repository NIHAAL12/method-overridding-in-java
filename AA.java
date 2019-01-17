class AA
{
 float z; 
 void max(int x,int y)
 {
	z=x>y?x:y;
 } 
 void max(float x,float y)
 {
	z=x>y?x:y;
 } 
 void max(int x,float y)
 {
	z=x>y?x:y;
 } 
 void max(float x,int y)
 {
	z=x>y?x:y;
 } 
 void showMax()
 {
	System.out.println("Largest number is:"+z);
 }
 public static void main(String args[])
 {
	AA obj=new AA();
	obj.max(7000,3000);
	obj.showMax();
 }
}