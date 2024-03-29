import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverceQueueUsingRecursion {

	static Queue<Integer> queue;

	static void Print()
	{
		while (!queue.isEmpty()) 
		{
			System.out.print(queue.peek() + " ");
			queue.remove();
		}
	}

static Queue<Integer> reverseQueue(Queue<Integer> q)
{
	if (q.isEmpty())
		return q;

	int data = q.peek();
	q.remove();

	q = reverseQueue(q);

	q.add(data);
		
	return q;
}
public static void main(String args[])
{
	queue = new LinkedList<Integer>();
	queue.add(56);
	queue.add(27);
	queue.add(30);
	queue.add(45);
	queue.add(85);
	queue.add(92);
	queue.add(58);
	queue.add(80);
	queue.add(90);
	queue.add(100);
	queue = reverseQueue(queue);
	Print();
}
}
