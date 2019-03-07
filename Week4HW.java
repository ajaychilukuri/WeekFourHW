import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Week4HW {

	public static void main(String[] args) {
		
		List<String> employeeNames = new ArrayList<String>();
		employeeNames.add("Tom");
		employeeNames.add("Josh");
		employeeNames.add("Steven");
		employeeNames.add("Bob");
		employeeNames.add("Dave");
		
		Set<Integer> ids = new HashSet<Integer>();
		ids.add(1);
		ids.add(2);
		ids.add(3);
		ids.add(4);
		ids.add(5);
		
		Map<Integer, String> employeeMap = new HashMap<Integer, String>();
		
		int i = 0;
		
		for (Integer id : ids) {
			employeeMap.put(id, employeeNames.get(i));
			i++;
		}
		
		for (Integer idsKey : employeeMap.keySet()) {
			System.out.println("Key: " + idsKey + " " + "Value: " + employeeMap.get(idsKey));
		}
		
		StringBuilder idsBuilder = new StringBuilder();
		
		for (Integer id : ids) {
			idsBuilder.append(id + "-");
		}
		
		System.out.println(idsBuilder.toString());
		
		StringBuilder namesBuilder = new StringBuilder();
		
		for (String names : employeeNames) {
			namesBuilder.append(names + " ");
		}
		
		System.out.println(namesBuilder.toString());
	}

}
