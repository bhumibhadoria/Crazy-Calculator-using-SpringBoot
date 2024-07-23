package bhumi.tech.basic;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {


    @RequestMapping("m")
    public static String MyMethod() {
        return "<h1> Hello World! This is my first Spring MVC Example </h1>";

    }
    
    
    @PostMapping("process-form") //post mapping hides all the data in the url 
    //whereas before postmapping I used get mapping which showed all the data on the url itself
    public static String getData(@RequestParam int num1, @RequestParam int num2) {
        int res = num1 + num2;
        return "Result =" + res;  //res type casted to string if we use return String.valueOf(res)
    }
    
    
}
