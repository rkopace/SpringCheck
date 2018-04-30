package my.demo;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	@RequestMapping("/hi/{name}")
	
	public String witaj(Map model, @PathVariable String name) {
		model.put("name", name);
		return "witajRaf";
	}
	
	
}
