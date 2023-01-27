package vn.cloud.headerservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@SpringBootApplication
@Slf4j
@RestController
@RequestMapping(value = "/headers")
public class HeaderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HeaderServiceApplication.class, args);
	}

	@GetMapping
	public Map<String, String> headers(@RequestHeader Map<String, String> headers) {
		log.info(headers.toString());
		return headers;
	}

}
