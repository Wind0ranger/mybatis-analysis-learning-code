package com.windranger.mapper;


import com.windranger.entity.Department;

import java.util.List;

public interface DepartmentMapper {
    
    List<Department> findAll();
    
    int insert(Department department);
    
    int update(Department department);
    
    int deleteById(String id);
    
    Department findById(String id);
}
