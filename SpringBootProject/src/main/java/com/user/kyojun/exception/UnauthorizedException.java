package com.user.kyojun.exception;

// 런타임 중 에러가 발생시 나타난다.
public class UnauthorizedException extends RuntimeException {
	private static final long serialVersionUID = -2238030302650813813L;

	public UnauthorizedException() {
		super("계정 권한이 유효하지 않습니다.\n다시 로그인을 해주세요.");
	}
}