package com.windranger.mapper;


import com.windranger.entity.Department;

import java.util.List;

public interface DepartmentDao {
    
    List<Department> findAll();
    
    Department findById(String id);
}
