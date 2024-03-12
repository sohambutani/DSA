import java.util.*;
class RemoveDublicate{

static String ShortenString(String str1)
{
Stack<Character> st = new Stack<Character>(); 

int i = 0;

while (i < str1.length())
{
	
	if (st.isEmpty() || 
		str1.charAt(i) != st.peek())
	{
	st.add(str1.charAt(i));
	i++;
	}

	else
	{
	st.pop(); 
	i++;
	} 
}

if (st.isEmpty())
{
	return ("Empty String");
}

else
{
	String short_String = ""; 
	while (!st.isEmpty())
	{
	short_String = st.peek() + 
					short_String;
	st.pop();
	}
	return (short_String);
}
}
public static void main(String[] args)
{
String str1 ="azzxzy";
System.out.print(ShortenString(str1)); 

}
}
