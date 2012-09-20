package com.mashape.client.authentication;

import org.apache.http.message.BasicHeader;

public abstract class HeaderAuthentication extends Authentication {
	
	public void addHeader(AuthenticationParameter ... headers) {
		for (AuthenticationParameter header : headers) {
			super.headers.add(new BasicHeader(header.getName(), header.getValue()));
		}
	}
	
}
