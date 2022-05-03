package Collection;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class priorityqueue {

	public static void main(String[] args) {
           
		PriorityQueue q=new PriorityQueue();  //we can also use generic method
		
		//while adding element in queue,it will always keep smallest element on the top
		
		q.add(548);
		q.add(884);
		q.add(789);
		q.add(321);
		q.add(6464);
		
		System.out.println(q);
		System.out.println(q.size());
		
		//element() returns top most element of the queue ,if the queue is empty then it will
		//throw an exception "nosuchelementException"
		
		System.out.println(q.element());
		
		//peek also reutrns top most element of the queue ,if queue isempty it will return "null"
		//instead of throwing exception
		
		System.out.println(q.peek());
		System.out.println("iterating queue elements using for-each loop");
		
		for(Object obj:q) {
			System.out.println(obj);
		}
		
		System.out.println("iterating elements udsing iterator");
		
		Iterator i=q.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println(q);
		
		//it will remove top most element of queue,if the queue is empty then it will throw an
		//exception by name "nosuchelementException"
		
		System.out.println(q.remove());
		System.out.println(q);
		
		//it will remove top most element of the queue ,if the queue is empty it will return null value
		
		System.out.println(q.poll());
		System.out.println(q);
		
		Iterator itr1=q.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
			
		}
		System.out.println("*********************************************");
			//using lambda expression
			q.forEach(Obj -> {
				System.out.println(Obj);
			});
		}
	}
	


