import java.util.Collections;
import java.util.LinkedList;

class TaskQueue{

	protected LinkedList<Integer> taskList = new LinkedList<Integer>();

	TaskQueue(){
        	for(int i = 1; i <= 1000 ; i++){
			this.taskList.add(i);
		}
		java.util.Collections.shuffle(this.taskList);
	}


	public synchronized int pop(){
			Object a = taskList.get(0);
			this.taskList.removeFirst();
			return (Integer)a;
	}


}
