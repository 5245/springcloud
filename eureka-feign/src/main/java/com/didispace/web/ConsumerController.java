package com.didispace.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.didispace.service.ComputeClient;

@RestController
public class ConsumerController {

    @Autowired
    ComputeClient computeClient;

    @RequestMapping(value = "/add/{a}/{b}", method = RequestMethod.GET)
    public Integer add(@PathVariable Integer a, @PathVariable Integer b) {
        return computeClient.add(a, b);
    }

}