package trainning20160316.order;

public class NuberDemo  implements Comparable<NuberDemo> {
	private int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "NuberDemo [a=" + a + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof NuberDemo)) return false;
		NuberDemo n = (NuberDemo) obj;
		return n.a == a;
	}
	
	public NuberDemo() {
		super();
	}

	public NuberDemo(int a) {
		this.a = a;
	}

	@Override
	public int compareTo(NuberDemo o) {
		boolean ascending = true;
		if (ascending) {
	        return a - o.a;
	    } else {
	        return o.a - a;
	    }
	}
}
