package com.example.vn_social_network.repository;

import com.example.vn_social_network.model.app_users.UserRela;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRelaRepository extends JpaRepository<UserRela,Long> {
    @Query(nativeQuery = true,value = "update likes SET status= 0 where id=:id;")
    void disableByStatus(Long id);
}
