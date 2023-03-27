package IndianTeam;

import javax.persistence.Embeddable;

@Embeddable
public class RR {
		
	private int SR;
	private int Avg;
	
	
	public RR(int sR, int avg) {
		super();
		SR = sR;
		Avg = avg;
	}


	public RR() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getSR() {
		return SR;
	}


	public void setSR(int sR) {
		SR = sR;
	}


	public int getAvg() {
		return Avg;
	}


	public void setAvg(int avg) {
		Avg = avg;
	}


	@Override
	public String toString() {
		return "RR [SR=" + SR + ", Avg=" + Avg + "]";
	}
	
	
}
