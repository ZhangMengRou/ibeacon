package com.beacon.service;

import com.beacon.entity.UuidMeaning;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by ZhangMengRou on 2018/6/2.
 */
public interface UuidRepository extends JpaRepository<UuidMeaning,Integer> {
    public UuidMeaning findOneByUuid(String uuid);
}
