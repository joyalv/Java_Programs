
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MaxOccChar {

	public static void main(String[] args) {
		
		
		String str="Planit_Testing";
		String x=str.toLowerCase();
		char y[]=x.toCharArray();
		int size=y.length;
		
		Map<Character,Integer>map=new LinkedHashMap<>();
		int i=0;
		while(i!=size)
		{
			if(map.containsKey(y[i])==false)
			{
				map.put(y[i],1);
			}
			else
			{
				int prev=map.get(y[i]);
				int newval=prev+1;
				map.put(y[i],newval);
			}
			
			i++;
			
		}
		Set<Map.Entry<Character,Integer>> lhmap=map.entrySet();
		
		char Key=' ';
		int val=0;
		for(Map.Entry<Character,Integer>data:lhmap)
		{
			if(data.getValue()>val)
			{
				val=data.getValue();
				Key=data.getKey();
			}
		}
		System.out.print(Key);
		System.out.println(": "+val);

	}

}
