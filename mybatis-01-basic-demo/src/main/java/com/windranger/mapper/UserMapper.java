package com.windranger.mapper;


import com.windranger.entity.User;

import java.util.List;

public interface UserMapper {

    List<User> findAll();

    List<User> findAllLazy();
}
