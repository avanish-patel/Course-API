/*
*  Created by
*  @Author Avanish Patel
*/

package con.avanish.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping(value="/hello")
	public String sayHi() {
		
		return "Hello";
	}

}
