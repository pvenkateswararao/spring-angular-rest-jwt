package venky.AngularSpring.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import venky.AngularSpring.DAO.Employee;
import venky.AngularSpring.DAO.UserEntity;
import venky.AngularSpring.service.EmployeeService;

@RestController
@CrossOrigin(origins = "*")
public class AppRestController {

	@Autowired
	EmployeeService services;
	@RequestMapping("/list")
	public List<UserEntity> findAll(){
		return services.allUsers();
	}
	@RequestMapping("/listEmp")
	public List<Employee> findAllEmp(){
		return services.EmpList();
	}
}
