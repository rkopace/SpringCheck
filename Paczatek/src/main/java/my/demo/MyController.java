package my.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
  @RequestMapping("/witam")
  
  public @ResponseBody String siema() {
	  return "Jak sie Masz?!?";
  }
}
