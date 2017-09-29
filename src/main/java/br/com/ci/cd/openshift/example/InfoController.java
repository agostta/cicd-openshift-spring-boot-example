package br.com.ci.cd.openshift.example;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {
    
	@RequestMapping("/")
    public String getInfo() {
    	return "Time: " + new Date();
    }
	
}
