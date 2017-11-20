import java.util.concurrent.TimeUnit;

public class gameTimer{
	
	private long startTime;	
	private long endTime;

	public gameTimer(){
		startTime = System.nanoTime();
		endTime = 0L;		
	}
	
	private long getStartTime(){
		return this.startTime;
	}
	
	private long getEndTime(){
		return this.endTime;	
	}	

	private void setEndTime(){
		this.endTime = System.nanoTime() - this.getStartTime();
	}	

	public String completionTime(){
		this.setEndTime();
		StringBuilder result = new StringBuilder();
		long milliseconds = TimeUnit.MILLISECONDS.convert(this.getEndTime(), TimeUnit.NANOSECONDS);
		long minutes = milliseconds/60000;
		milliseconds = milliseconds%60000;
		long seconds = milliseconds/1000;
		milliseconds = milliseconds%1000;
		result.append(minutes+":"+seconds+":"+milliseconds);
		return result.toString();			
	}
}	
