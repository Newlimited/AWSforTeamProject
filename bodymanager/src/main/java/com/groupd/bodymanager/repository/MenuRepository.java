package com.groupd.bodymanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.groupd.bodymanager.entity.MenuEntity;
import com.groupd.bodymanager.entity.UserEntity;
import java.util.List;



@Repository
public interface MenuRepository extends JpaRepository<MenuEntity,String> {
    public boolean existedByMenuCode(String menuCode);
    public MenuEntity findByMenuCode(String menuCode);

    public MenuEntity findByUserCode(int userCode);
    
}
