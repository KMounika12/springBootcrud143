package bulding.hcl.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import bulding.hcl.com.entity.Employee;
import bulding.hcl.com.repository.EmployeeRepository;



@RestController
public class EmployeeController {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	@PostMapping("/save")
	public Employee saveEmployee(@RequestBody Employee employee) {
		
		return employeeRepository.save(employee);
		
	}
	/*	@PutMapping("/update")
	public Employee updaeEmployee(@RequestBody Employee employee) {
		
		return employeeRepository;
		
	}

}*/
}