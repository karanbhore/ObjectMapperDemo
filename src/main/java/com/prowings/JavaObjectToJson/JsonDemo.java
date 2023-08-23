package com.prowings.JavaObjectToJson;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.prowings.entity.Employee;

public class JsonDemo {

	public static void main(String[] args) {
		try {
			ObjectMapper objectmapper = new ObjectMapper();

			Employee employee = new Employee(1, "Rajesh", "Dev");

			objectmapper.writeValue(new File("target/emp.json"), employee);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
