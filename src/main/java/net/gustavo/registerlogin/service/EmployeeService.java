package net.gustavo.registerlogin.service;

import net.gustavo.registerlogin.dto.EmployeeDTO;
import net.gustavo.registerlogin.dto.LoginDTO;
import net.gustavo.registerlogin.response.LoginResponse;

public interface EmployeeService {
    String addEmployee(EmployeeDTO employeeDTO);

    LoginResponse loginEmployee(LoginDTO loginDTO);

}