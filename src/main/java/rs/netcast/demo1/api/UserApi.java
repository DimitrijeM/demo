package rs.netcast.demo1.api;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import rs.netcast.demo1.dto.UserDto;
import rs.netcast.demo1.responses.DemoResponse;

import java.awt.*;


@RestController
@RequestMapping(value = "/user")
public class UserApi {

    @RequestMapping(value = "/hello")
    public String hello(){
        return "hello world";
    }

    @RequestMapping(value = "/hello-{username}", method = RequestMethod.GET)
    public String hello(@PathVariable String username){
        return "hello " + username;
    }

    @RequestMapping(value = "/hello-{username}", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody DemoResponse hello(@RequestBody UserDto user){
        if(user.getPassword().equals("123")){
            return new DemoResponse("hello " + user.getUsername());
        }
        else return new DemoResponse("wrong pass");
    }

}
