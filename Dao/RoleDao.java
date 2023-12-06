package Dao;

import org.springframework.data.repository.CrudRepository;

import com.exchange.bank.security.Role;



public interface RoleDao extends CrudRepository<Role, Integer> {
    Role findByName(String name);
}
