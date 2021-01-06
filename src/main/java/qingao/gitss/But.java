package qingao.gitss;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class But {
@RequestMapping("/bb")
public String bb(){
	return "可想而知";
}
}
