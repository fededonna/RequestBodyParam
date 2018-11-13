package cn.kknotes.open.demo.controller;

import cn.kknotes.open.annotation.RequestBodyParam;
import cn.kknotes.open.demo.controller.vo.Value3;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lin
 * @date 2018/11/9
 */
@RestController
@RequestMapping
public class TestController {

    @RequestMapping(value = "test1", produces = "application/json;charset=UTF-8")
    public Object test1(@RequestBodyParam(name = "value1", required = false) Integer v1
            , @RequestBodyParam(required = false) String value2
            , @RequestBodyParam(required = false) Value3 value3
            , @RequestBodyParam(required = false) String[] value5) {
        Map<String, Object> date = new HashMap<>(4);
        date.put("value1", v1);
        date.put("value2", value2);
        date.put("value3", value3);
        date.put("value5", value5);
        return date;
    }

    @RequestMapping(value = "test2", produces = "application/json;charset=UTF-8")
    public Object test2(@RequestBody Value3 value3) {
        return value3;
    }

}
