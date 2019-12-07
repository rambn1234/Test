package Logical;

public class CharecterCount {
public static void main(String[] args) {
	
	char ch[]= {'r','a','m','c','h','a','n','d','r','a'};
	
for(int i=0;i<ch.length;i++)
{
	int count=0;
	
	for(int j=0;j<ch.length;j++)
	{
		if(ch[i]==ch[j])
		{
			count++;
		}
	}
	System.out.println("Given Charecter Array "+ch[i]+"="+count);
}
		
}
}
