package gift.newyear;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
/**
 * Hello world!
 *
 */
public class App 
{
    	static HashMap<Integer,String> hlist=new HashMap<Integer,String>();
        public static void main( String[] args )
        {
        	Sweets sweet1 = new Halva();
        	sweet1.sweet();
        	String sweetName1 = sweet1.getSweetName();
        	Sweets sweet2 = new GulabJamun();
        	sweet2.sweet();
        	String sweetName2 = sweet2.getSweetName();
        	Sweets sweet3 = new Rasgulla();
        	sweet3.sweet();
        	String sweetName3 = sweet3.getSweetName();
        	Scanner sc =new Scanner(System.in);
        	System.out.println("Enter weight of halva");
        	int w1=sc.nextInt();
        	System.out.println("Enter weight of gulabjamun");
        	int w2=sc.nextInt();
        	System.out.println("Enter weight of Rasgulla");
        	int w3=sc.nextInt();
        	hlist.put(w1,sweetName1);
        	hlist.put(w2,sweetName2);
        	hlist.put(w3,sweetName3);
        	System.out.println("Enter 1 for sort by values and 2 for sort by name ");
        	int s=sc.nextInt();
        	if(s==2) {
        		Map<Integer, String> map = sortByValues(hlist);  
        		System.out.println("After Sorting:");
        	      Set set2 = map.entrySet();
        	      Iterator iterator2 = set2.iterator();
        	          	      while(iterator2.hasNext()) {
        	           Map.Entry me2 = (Map.Entry)iterator2.next();
        	           System.out.print(me2.getKey() + ": ");
        	           System.out.println(me2.getValue());
        	      }
        		
        	}
        	else {
        		Map<Integer,String> map = new TreeMap<Integer, String>(hlist); 
                System.out.println("After Sorting:");
                Set set2 = map.entrySet();
                Iterator iterator2 = set2.iterator();
                while(iterator2.hasNext()) {
                     Map.Entry me2 = (Map.Entry)iterator2.next();
                     System.out.print(me2.getKey() + ": ");
                     System.out.println(me2.getValue());
                }
        	}
        	
        	sc.close();
        	
        	
        	
        	
        	
        	
        	
        }
          private static HashMap sortByValues(HashMap map) { 
            List list = new LinkedList(map.entrySet());
            // Defined Custom Comparator here
            Collections.sort(list, new Comparator() {
                 public int compare(Object o1, Object o2) {
                    return ((Comparable) ((Map.Entry) (o1)).getValue())
                       .compareTo(((Map.Entry) (o2)).getValue());
                 }
            });

            
            HashMap sortedHashMap = new LinkedHashMap();
            for (Iterator it = list.iterator(); it.hasNext();) {
                   Map.Entry entry = (Map.Entry) it.next();
                   sortedHashMap.put(entry.getKey(), entry.getValue());
            } 
            return sortedHashMap;
       }
    }
