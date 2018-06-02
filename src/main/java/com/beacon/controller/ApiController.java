package com.beacon.controller;

import com.beacon.entity.UuidMeaning;
import com.beacon.service.UuidRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by ZhangMengRou on 2018/6/2.
 */
@Controller
public class ApiController {
    @Autowired
    private UuidRepository uuidRepository;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public String add(@RequestBody UuidMeaning uBean) {

        uuidRepository.save(uBean);
        return "200";
    }
    @RequestMapping(value = "/get/{uuid}", method = RequestMethod.GET)
    @ResponseBody
    public String get(@PathVariable("uuid") String uuid) {

        System.out.println(uuidRepository.findOneByUuid(uuid));
        if (uuidRepository.findOneByUuid(uuid)==null)
            return "null";
        else {
            return uuidRepository.findOneByUuid(uuid).getMessage();
        }
    }
}
