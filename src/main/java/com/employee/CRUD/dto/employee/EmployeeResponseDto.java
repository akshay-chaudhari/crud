package com.employee.CRUD.dto.employee;

import com.employee.CRUD.dto.common.AddressDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeResponseDto {

    private String id;

    private String email;

    private String firstName;

    private String lastName;

    private String employeeId;

    private boolean isActive;

    private AddressDto address;
}
