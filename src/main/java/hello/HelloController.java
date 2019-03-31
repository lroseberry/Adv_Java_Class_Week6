package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigDecimal;
import java.util.Calendar;

@RestController
public class HelloController {

//    @RequestMapping("/")
//    public String index() {
//        return "Greetings from Spring Boot!";
//    }

    @RequestMapping("/")
    public StockQuote getQuote() {
       return new StockQuote(new BigDecimal(200), Calendar.getInstance().getTime(), "APPL");
    }
}