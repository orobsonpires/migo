package com.migo.security;

public class SecurityUtils {
	public static final String SECRET = "securityKey";
	public static final String TOKEN_PREFIX = "Bearer ";
	public static final String HEADER_STRING = "Authorization";
	public static final long EXPIRATION_TIME = 864_000_000L; // one day
}
