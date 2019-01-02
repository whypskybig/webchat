package com.ta.mistery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

import javax.websocket.server.ServerEndpoint;

@SpringBootApplication
@EnableAutoConfiguration
public class MisteryApplication {


	public static void main(String[] args) {
		SpringApplication.run(MisteryApplication.class, args);
	}


}

