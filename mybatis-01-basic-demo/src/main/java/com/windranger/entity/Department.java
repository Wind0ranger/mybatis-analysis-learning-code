package com.windranger.entity;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

public class Department implements Serializable {
    
    private String id;
    
    private String name;
    
    private String tel;
    
    private Set<User> users;
    
    @Override
    public String toString() {
        return "Department{" + "id='" + id + '\'' + ", name='" + name + '\'' + ", tel='" + tel + '\'' + '}';
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Department that = (Department) o;
        return Objects.equals(id, that.id);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getTel() {
        return tel;
    }
    
    public void setTel(String tel) {
        this.tel = tel;
    }
    
    public Set<User> getUsers() {
        return users;
    }
    
    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
