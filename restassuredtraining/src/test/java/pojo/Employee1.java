package pojo;

import java.util.Arrays;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Employee1 {

	public static void main(String[] args) throws JsonProcessingException {
		// TODO Auto-generated method stub
		Employee employee1 = new Employee();
		employee1.setFirst_name("Thiagarajan");
		employee1.setLast_name("Loganathan");
		employee1.setEmail("thiagu@gmail.com");
		employee1.setSkills(Arrays.asList("java", "Selenium"));
		
		System.out.println(employee1.getFirst_name());
		System.out.println(employee1.getLast_name());
		System.out.println(employee1.getEmail());
		System.out.println(employee1.getSkills());
		
		ObjectMapper mapper = new ObjectMapper();
		String employeeJson = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(employee1);
		System.out.println(employeeJson);
	}

}
