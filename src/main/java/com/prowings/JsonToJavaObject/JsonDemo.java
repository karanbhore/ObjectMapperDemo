package com.prowings.JsonToJavaObject;

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
			
			String employeeJson="{\"id\":1,\"name\":\"Rajesh\",\"department\":\"Dev\"}";
			
			Employee emp=objectmapper.readValue(employeeJson, Employee.class);
			System.out.println(emp);


		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
