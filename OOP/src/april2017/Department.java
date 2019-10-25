package april2017;

public abstract class Department {
	private StringQueue queue = new StringQueue();
	public StringQueue getQueue() {
		return queue;
	}
	//implement
	public abstract String getName();
	
	public String addMessage(String msg) {
		queue.enqueue(msg);
		return msg;
	}
	
	public String nextMessage(){
		String str = null;
		try {
			str = queue.dequeue();
		} catch (EmptyQueueException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return str;
	}
}
