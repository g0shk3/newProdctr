package com.gatanasov.service;


import com.gatanasov.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {

    void updateUser(Employee employee);

    void createUser(Employee employee);

    void createOrUpdateUser(Employee employee);

    Employee getUserById(Long id);

    List<Employee> getAllUsers();

    void deleteUserById(Long id);
}
