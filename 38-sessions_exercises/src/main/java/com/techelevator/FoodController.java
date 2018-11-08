
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
public class FoodController {

	@RequestMapping(path="/foodInput", method=RequestMethod.POST)
	public String processFood(@RequestParam String food,
								ModelMap model) {
			FavThingsApp fav = (FavThingsApp)model.get("user1");
			fav.setFood(food);
			
			return "redirect:/FavThingsApp/seasonInput";
	}
	
	@RequestMapping("/seasonInput")
	public String displaySeason() {
		return "FavThingsApp/seasonInput";
	}
}