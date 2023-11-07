package com.oguztasgin.videocall;

import com.oguztasgin.videocall.user.User;
import com.oguztasgin.videocall.user.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VideocallApplication {public static void main(String[] args) {
	SpringApplication.run(VideocallApplication.class, args);
}

	@Bean
	public CommandLineRunner commandLineRunner(
			UserService service
	) {
		return args -> {
			service.register(User.builder()
					.username("Oguz")
					.email("oguz@mail.com")
					.password("aaa")
					.build());

			service.register(User.builder()
					.username("Kaan")
					.email("kaan@mail.com")
					.password("aaa")
					.build());

			service.register(User.builder()
					.username("Irem")
					.email("irem@mail.com")
					.password("aaa")
					.build());
		};
	}
}
