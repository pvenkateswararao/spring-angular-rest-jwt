package venky.AngularSpring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import venky.AngularSpring.DAO.Employee;
import venky.AngularSpring.DAO.EmployyeRepository;
import venky.AngularSpring.DAO.UserEntity;
import venky.AngularSpring.DAO.UserRepository;

@Service
public class EmployeeService implements EmployeeServiceInterface{

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	EmployyeRepository empRepository;
	
	@Override
	public List<UserEntity> UserList() {
		// TODO Auto-generated method stub
		return userRepository.findByUserName("john");
	}
	public List<UserEntity> allUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}
	@Override
	public List<Employee> EmpList() {
		// TODO Auto-generated method stub
		return empRepository.findAll();
	}


}
