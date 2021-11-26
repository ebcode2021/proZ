package com.kh.spring.friend.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.ChannelRegistration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

import com.kh.spring.friend.handler.FriendHandler;

@Configuration
@EnableWebSocketMessageBroker
public class FriendStompConfig implements WebSocketMessageBrokerConfigurer {

	
	//메시지 브로커 관련 설정
	@Override
	public void configureMessageBroker(MessageBrokerRegistry config) {
		config.enableSimpleBroker("/room" , "online");
		config.setApplicationDestinationPrefixes("/app");
		//메세지 매핑에 쓰는 애
		
		

	}

	//온라인으로 들어옴
	@Override
	public void registerStompEndpoints(StompEndpointRegistry registry) {
		registry.addEndpoint("/ws-stomp").withSockJS();
	}
	
	@Override
    public void configureClientInboundChannel(ChannelRegistration registration) {
        registration.interceptors(new FriendHandler());
    }
	
	
	



}