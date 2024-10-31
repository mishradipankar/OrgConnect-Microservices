package com.myproject.employee_service.service;

import com.myproject.employee_service.Dto.APIResponseDto;
import com.myproject.employee_service.Dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto saveEmployee(EmployeeDto employeeDto);
    APIResponseDto getEmployeeById(Long employeeId);
}
