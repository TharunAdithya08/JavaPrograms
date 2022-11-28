import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class linkedList 
{
    public static void main(String args[])
    {
        // Scanner sc = new Scanner(System.in);
        // LinkedList<Integer> li = new LinkedList<>();
        // System.out.println("Enter the elements to be inserted:");
        // int size = sc.nextInt();
        // for(int i=0;i<size;i++)
        // {
        //     li.add(sc.nextInt());                                        LINKED LIST
        // }
        // Iterator itr = li.iterator();
        // Collections.sort(li);
        // while(itr.hasNext())
        // {
        //     System.out.print(itr.next()+" ");
        // }

        // System.out.println(li.size());

        Set<Integer> hs = new HashSet<Integer>();
        hs.add(10);
        hs.add(1);
        hs.add(7);
        hs.add(23);
        hs.add(20);
        hs.remove(1);
        // System.out.println(hs.size());                           HASH SET
        
        // Iterator itr = hs.iterator();
        // while(itr.hasNext())
        // {
        //     System.out.println(itr.next());
        // }

        // Set<Integer> lhs = new LinkedHashSet<>(hs);
        // Iterator itr = lhs.iterator();
        // while(itr.hasNext())                                     LINKED HASH SET
        // {
        //     System.out.print(itr.next() + " ");
        // }
        // System.out.println();

        // Set<Integer> ts = new TreeSet(lhs);
        // itr = ts.iterator();                                                 
        // while(itr.hasNext())                                      TREE SET
        // {
        //     System.out.print(itr.next() + " ");
        // }

        // HashMap<Integer,String> hm = new HashMap<>();
        // hm.put(1,"Coimbatore");
        // hm.put(2,"Chennai");
        
        // for(Integer i : hm.keySet())
        // {
        //     System.out.print(hm.get(i) + " ");
        
        // }

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(45);
        arr.add(35);
        arr.add(10);
        arr.add(56);
        System.out.println(arr.contain);

    }    
}
