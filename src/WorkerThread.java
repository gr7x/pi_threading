class WorkerThread implements Runnable{
	
	private TaskQueue tqueue;
	private ResultTable rTable;

	WorkerThread(TaskQueue t, ResultTable r){
		this.tqueue = t;
		this.rTable = r;		
	}

	public void run(){
		Bpp calcPi = new Bpp();
                int val = 0; 
		while(!this.tqueue.taskList.isEmpty()){
			val = this.tqueue.pop();
			this.rTable.setResult(val, calcPi.getPi(val));
		}
	}

}
