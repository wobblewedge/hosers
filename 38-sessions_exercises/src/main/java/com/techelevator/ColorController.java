
package com.techelevator;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
@Controller
@RequestMapping("/FavThingsApp/")
@SessionAttributes("user1")
public class ColorController {

	
	@RequestMapping(path= {"", "/", "/colorInput"}, method=RequestMethod.GET)
	public String displayColor() {
		return "/FavThingsApp/colorInput";
	}
	
	@RequestMapping(path="/colorInput", method=RequestMethod.POST)
	public String processColor(@RequestParam String color,
								ModelMap model) {
			FavThingsApp fav = new FavThingsApp();
			fav.setColor(color);
			model.addAttribute("user1", fav);
			return "redirect:/FavThingsApp/foodInput";
	}
	
	@RequestMapping("/foodInput")
	public String displayFood() {
		return "FavThingsApp/foodInput";
	}

}