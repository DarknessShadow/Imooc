package top.consumers.eurekaclientconsumer.feign;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Lijiao
 * @description:
 * @date 2019/9/23 15:49
 */
@Component
public class HelloRemoteHystrix implements HelloRemote {

    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "hello " + name + ",this message send failed";
    }
}
