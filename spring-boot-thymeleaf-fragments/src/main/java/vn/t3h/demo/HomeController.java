package vn.t3h.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	static final String VIEW_INDEX = "pages/index";

	@GetMapping(value = "")
	public String getHome(Model model) {
		model.addAttribute("str", "23232323");
		return VIEW_INDEX;
	}
	
	@GetMapping(value = "/about")
	public String about(Model model) {
		model.addAttribute("str", "23232323");
		return "pages/about";
	}
}