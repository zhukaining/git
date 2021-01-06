package qingao.gitss;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Put {
	@RequestMapping("/aa")
	public String aa(){
		return "嘿嘿";
	}
}
