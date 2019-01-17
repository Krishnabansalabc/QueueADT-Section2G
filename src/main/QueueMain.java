package main;

public class QueueMain
{
	public static void main(String[] args)
	{
		QueueADT queue1 = new QueueADT();
		queue1.enqueue(11);
		queue1.enqueue(10);
		queue1.enqueue(9);
		for(int i=0;i<queue1.queue.length;i++) {
			System.out.print(queue1.queue[i]+" ");
		}

//		TODO add method call for enqueue

//		TODO add method call for dequeue

	}
}
