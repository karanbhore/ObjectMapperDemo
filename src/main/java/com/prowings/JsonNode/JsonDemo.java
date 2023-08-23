package com.prowings.JsonNode;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.prowings.entity.Employee;

public class JsonDemo {

	public static void main(String[] args) {
		try {
			ObjectMapper objectmapper = new ObjectMapper();
			
			String employeeJson="{\"id\":1,\"name\":\"Rajesh\",\"department\":\"Dev\"}";
			
			JsonNode jsonNode=objectmapper.readTree(employeeJson);
			
			String name=jsonNode.get("name").asText();
			String id=jsonNode.get("id").asText();
			String department=jsonNode.get("department").asText();
			
			objectmapper.writeValue(new File("target/employeeNode.txt"),id +","+ name+"," + department);
			


		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
