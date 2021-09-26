import java.util.*;
class CollectionsPractice
{
    
    public static void main(String[] args)
    {
        //ArrayList
        // ArrayList al = new ArrayList();
        // al.add("Jyoti");
        // al.add("Ranjan");
        // al.add("Sharma");

        // Iterator itr = al.iterator();
        // while (itr.hasNext())
        // {
        //     System.out.print(itr.next()+" ");
        // }

        //LinkedList
        // LinkedList<String> ll = new LinkedList<String>();
        // ll.add("Jyoti");
        // ll.add("Ranjan");
        // ll.add("Sharma");

        // Iterator itr = ll.iterator();
        // while (itr.hasNext())
        // {
        //     System.out.print(itr.next()+" ");
        // }

        //Vector
        // Vector<String> vec = new Vector<String>();
        // vec.add("Jyoti");
        // vec.add("Ranjan");
        // vec.add("Sharma");

        // Iterator itr = vec.iterator();
        // while (itr.hasNext())
        // {
        //     System.out.print(itr.next()+" ");
        // }
        // vec.add(1, "Sharma");
        // System.out.print(vec.toString());

        //Priority Queue
        PriorityQueue<String> queue = new PriorityQueue<String>();
        queue.add("Jyoti");
        queue.add("Ranjan");
        queue.add("Sharma");

        Iterator ir = queue.iterator();
        while (ir.hasNext())
        {
            System.out.print(ir.next()+" ");
        }

        System.out.println();

        System.out.println("head: "+queue.element()); //checks for element at the beginning
        System.out.println("head: "+queue.peek()); //peeks in the queue and doesn't delete anything. return null if nothing's there
    
        queue.remove(); //delete the element
        queue.poll(); //return null if nothing's there. delete the elemnet

        //queue after deleting 2 elements
        Iterator itr2 = queue.iterator();
        while(itr2.hasNext())
        {
            System.out.print(itr2.next()+" ");
        }

    
    }
}
