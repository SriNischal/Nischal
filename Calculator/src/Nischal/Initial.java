package Nischal;

import java.util.ArrayList;

class Initial {
	protected ArrayList<String[]> values() {
		ArrayList<String[]> Employee_Db = new ArrayList<String[]>(100);
		String Employee1[] = { "1044", "Nischal", "21", "trainee", "java", "20000" };
		String Employee2[] = { "1163", "Suraj", "21", "trainee", "java", "25000" };
		Employee_Db.add(Employee1);
		Employee_Db.add(Employee1);
		return Employee_Db;
	}
}
