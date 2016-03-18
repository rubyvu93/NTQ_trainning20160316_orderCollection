package trainning20160316.order;

import java.util.Date;

public class Dates implements Comparable<Dates>{
	private Date timeStartRun;
	private Date timestopRun;

	public Date getTimeStartRun() {
		return timeStartRun;
	}

	public void setTimeStartRun(Date timeStartRun) {
		this.timeStartRun = timeStartRun;
	}

	public Date getTimestopRun() {
		return timestopRun;
	}

	public void setTimestopRun(Date timestopRun) {
		this.timestopRun = timestopRun;
	}

	public Dates() {
		super();
	}

	public Dates(Date timeStartRun, Date timestopRun) {
		if (timeStartRun == null || timestopRun == null) throw new NullPointerException();
		this.timeStartRun = timeStartRun;
		this.timestopRun = timestopRun;
	}

	@Override
	public String toString() {
		return timeStartRun + " " + timestopRun;
	}

	@Override
	public int hashCode() {
		return 31 * timeStartRun.hashCode() + timestopRun.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Dates)) return false;
		Dates dates = (Dates) obj;
		return dates.timeStartRun.equals(timeStartRun) && dates.timestopRun.equals(timestopRun);
	}

	@Override
	public int compareTo(Dates o) {
		int lastCompare = timeStartRun.compareTo(o.timeStartRun);
		return lastCompare!= 0 ? lastCompare : timestopRun.compareTo(o.timestopRun);
	}
}
