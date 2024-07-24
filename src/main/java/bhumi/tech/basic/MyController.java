package bhumi.tech.basic;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @PostMapping("process-form")
    public String getData(@RequestParam int num1, @RequestParam int num2, @RequestParam String operation) {
        int res;
        switch (operation) {
            case "add":
                res = num1 + num2;
                break;
            case "subtract":
                res = num1 - num2;
                break;
            case "multiply":
                res = num1 * num2;
                break;
            case "divide":
                if (num2 == 0) {
                    return "Error: Division by zero is not allowed.";
                }
                res = num1 / num2;
                break;
            default:
                return "Error: Invalid operation.";
        }
        return "Result = " + res;
    }
}
