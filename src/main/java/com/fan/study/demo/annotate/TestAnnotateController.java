package com.fan.study.demo.annotate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class TestAnnotateController {

    Logger LOG = LoggerFactory.getLogger(TestAnnotateController.class);

    @Autowired
    private TestAnnotateService testAnnotateService;

    /**
     * 请求参数自定义注解校验
     *
     * @param req
     * @param bindingResult
     * @return
     */
    @PostMapping("/annotate/test")
    public String test(@Valid @RequestBody AnnotateReq req, BindingResult bindingResult) {
        LOG.info("请求姓名：{},年龄：{}", req.getName(), req.getAge());
        if (bindingResult.hasErrors()) {
            return bindingResult.getAllErrors().get(0).getDefaultMessage();
        }
        return "success";
    }
}
