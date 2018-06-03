package com.beacon.controller;

import com.beacon.entity.UuidMeaning;
import com.beacon.dao.UuidRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class ApiController {

    private UuidRepository uuidRepository;

    public ApiController(UuidRepository uuidRepository) {
        this.uuidRepository = uuidRepository;
    }

    @PostMapping
    public UuidMeaning add(@RequestBody UuidMeaning uBean) {
        return uuidRepository.save(uBean);
    }

    @GetMapping(value = "/{uuid}")
    public UuidMeaning get(@PathVariable("uuid") String uuid) {
        return uuidRepository.findOneByUuid(uuid);
    }

    @GetMapping
    public List<UuidMeaning> getAll() {
        return uuidRepository.findAll();
    }
}
