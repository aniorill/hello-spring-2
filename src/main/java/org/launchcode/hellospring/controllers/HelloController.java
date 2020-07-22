package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping(value ={"hello"})
public class HelloController {

    // Handles request at /hello/hello
//    @GetMapping("")
//    //@ResponseBody
//    public String hello() {
//        return "Hello";
//    }

    // Handles request at /hello/goodbye
    @GetMapping("goodbye")
    //@ResponseBody
    public String goodbye() {
        return "goodbye, Spring!";
    }

    //Handles request of the form /hello?name=LaunchCode
    //@GetMapping("hello")
    //@RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
    //@ResponseBody
    //public String helloWithQueryParam(@RequestParam String name) {
    //    return "Hello!";
    //}

    //Handles requests of the form /hello/LaunchCode
//    @GetMapping("{name}")
//    //@ResponseBody
//    public String helloWithParam(@PathVariable String name) {
//        return "Hello, " + name + "!";
//    }

    @GetMapping("form")
    //@ResponseBody
    public String helloForm() {
        return "<html>" +
                "<body>" +
                "<form action= 'hello' method= 'post'>" + //submit a request to /hello
                "<input type= 'text' name= 'name'>" +
                "<select name= 'language' id= 'language'>" +
                "<option value='English'> English</option>" +
                "<option value='Spanish'> Spanish</option>" +
                "<option value='French'> French</option>" +
                "<option value='Italian'> Italian</option>" +
                "<option value='Korean'> Korean</option>" +
                "</select>" +
                "<input type= 'submit' value= 'Greet me!'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = {"hello"})
    public static String createMessage(@RequestParam String name, @RequestParam String language) {
        if (language.equals("English")) {
            return "Hello " + name + "!";
        }
        if (language.equals("Spanish")) {
            return "Hola " + name + "!";
        }
        if (language.equals("French")) {
            return "Bonjour " + name + "!";
        }
        if (language.equals("Italian")) {
            return "Bongiorno " + name + "!";
        }
        if (language.equals("Korean")) {
            return "안녕하세요 " + name + "!";
        } else{
            return "Language not selected.";
        }

    }


}
