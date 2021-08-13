package com.fis.springsecurity.employee;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/employee")
public class EmployeeController {

	@Autowired 
	private EmployeeRepository employeeRepository;

	@PostMapping
	public String addNewEmployee(@RequestBody Employee employee) {
		employeeRepository.save(employee);
		return "Saved";
	}

	// displaying an employee
	@GetMapping
	public @ResponseBody Iterable<Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}

	@PutMapping
	public String updateEmployee(@RequestBody Employee employee) {
		Optional<Employee> e = employeeRepository.findById(employee.getId());
		if (e.isPresent()) {
			employeeRepository.save(employee);
			return "Updated";
		} else {
			return "Employee Not Found!!";
		}
	}

	@DeleteMapping
	public String deleteEmployee(@RequestParam int id) {
		Optional<Employee> e = employeeRepository.findById(id);
		if (e.isPresent()) {
			employeeRepository.delete(e.get());
			return "Deleted";
		} else {
			return "Employee Not Found!!";
		}
	}
}
