package access;

public class WithoutCompare {
static String s1 ="helloxnswbxns";
static String s2="hai";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
if(s1.length()!=s2.length())
{
	System.out.println("not equal");
}
boolean count=true;;
for(int i=0;i<s1.length();i++)
{
	if(s1.charAt(i)!=s2.charAt(i))
			{
		count=false;
		
			}
}
if(count)
{
	System.out.println("equal");
}
else
	 System.out.println("not equal");
	}

}
