package trainning20160316.order;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) throws Exception {
		Name arrName[] = {
				new Name("A", "T"),
				new Name("B", "H"),
				new Name("C", "J")
		};
		
		List<Name> names = Arrays.asList(arrName);
		Collections.sort(names);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Dates arrDates[] = {
				new Dates(sdf.parse("16/03/2016"), sdf.parse("17/03/2016")),
				new Dates(sdf.parse("16/03/2016"), sdf.parse("15/03/2016")),
				new Dates(sdf.parse("16/03/2016"), sdf.parse("19/03/2016"))
		};
		
		List<Dates> dates = Arrays.asList(arrDates);
		Collections.sort(dates);
		
		NuberDemo num[] = {
				new NuberDemo(3), 
				new NuberDemo(4),
				new NuberDemo(1),
				new NuberDemo(9)
				};
		List<NuberDemo> nums = Arrays.asList(num);
		Collections.sort(nums);
		
		TreeSet<NuberDemo> s = new TreeSet<NuberDemo>();
		s.add(new NuberDemo(3));
		s.add(new NuberDemo(1));
		s.add(new NuberDemo(6));
		s.add(new NuberDemo(2));

		for (NuberDemo nuberDemo : s) {
			System.out.println(nuberDemo);
		}
	}

}
