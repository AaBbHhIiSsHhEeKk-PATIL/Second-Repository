package IndianTeam;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ODI_Record")
public class Record {
	
	@Column(name = "Player_Name")
	private String name;
	@Id
	@Column(name = "Run")
	private int run;
	private int Century;
	@Column(name = "Half_Century")
	private int Halfcentury;
	
	private RR rr;

	public Record() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Record(String name, int run, int century, int halfcentury, RR rr) {
		super();
		this.name = name;
		this.run = run;
		Century = century;
		Halfcentury = halfcentury;
		this.rr = rr;
	}

	@Override
	public String toString() {
		return "Record [name=" + name + ", run=" + run + ", Century=" + Century + ", Halfcentury=" + Halfcentury
				+ ", rr=" + rr + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRun() {
		return run;
	}

	public void setRun(int run) {
		this.run = run;
	}

	public int getCentury() {
		return Century;
	}

	public void setCentury(int century) {
		Century = century;
	}

	public int getHalfcentury() {
		return Halfcentury;
	}

	public void setHalfcentury(int halfcentury) {
		Halfcentury = halfcentury;
	}

	public RR getRr() {
		return rr;
	}

	public void setRr(RR rr) {
		this.rr = rr;
	}
	
	
	
	
}
