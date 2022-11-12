package venky.AngularSpring.service;

import java.util.List;

import venky.AngularSpring.DAO.Employee;
import venky.AngularSpring.DAO.UserEntity;

public interface EmployeeServiceInterface {
public List<UserEntity> UserList();
public List<Employee> EmpList();
}

