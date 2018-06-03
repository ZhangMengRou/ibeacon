package com.beacon.dao;

import com.beacon.entity.UuidMeaning;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UuidRepository extends JpaRepository<UuidMeaning,Long> {
    UuidMeaning findOneByUuid(String uuid);
}
