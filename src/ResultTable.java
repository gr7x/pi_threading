import java.util.HashMap;
import java.util.TreeMap;

class ResultTable{

	protected HashMap<Integer, Integer> map = new HashMap<>();
	protected int count = 0;
	
	public synchronized void setResult(int position, int piVal){
			this.map.put(position, piVal);
			
			this.count++;
			if(this.count % 10  == 0){
				System.out.print(".");
				System.out.flush();
				if(this.count % 200 == 0){
					System.out.println(" ");
				}
			}
	}


	public void printHashMap(){
		TreeMap<Integer, Integer> sort = new TreeMap<>(map);
		System.out.print("\n3.");
		for(HashMap.Entry<Integer, Integer> entry : sort.entrySet()){  
            		System.out.print(entry.getValue()); 
		}
	}	


}
