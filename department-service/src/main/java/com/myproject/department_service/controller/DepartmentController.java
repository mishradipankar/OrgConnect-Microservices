package com.myproject.department_service.controller;

import com.myproject.department_service.Dto.DepartmentDto;
import com.myproject.department_service.service.DepartmentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Tag(
        name = "Department-Service",
        description = "Expost Rest API"
)
@RestController
@RequestMapping("api/departments")
@AllArgsConstructor
public class DepartmentController {
    // Build save department REST API
    private DepartmentService departmentService;

    @Operation(
            summary = "Save DepartmntAPI",
            description = "used to save object"
    )
    @ApiResponse(
           responseCode = "201",
            description = "HTTP Created"

    )
    @PostMapping
    public ResponseEntity<DepartmentDto> saveDepartment(@RequestBody DepartmentDto departmentDto){
        DepartmentDto savedDepartment = departmentService.saveDepartment(departmentDto);
        return new ResponseEntity<>(savedDepartment, HttpStatus.CREATED);
    }
    // Build get department rest api
    @GetMapping("{department-code}")
    public ResponseEntity<DepartmentDto> getDepartment(@PathVariable("department-code") String departmentCode){
        DepartmentDto departmentDto = departmentService.getDepartmentByCode(departmentCode);
        return new ResponseEntity<>(departmentDto, HttpStatus.OK);
    }
}
