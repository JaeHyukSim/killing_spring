package com.ssafy.guestbook.model.service;

import java.util.List;
import java.util.Map;

import com.ssafy.guestbook.model.MemberDto;

public interface UserService {

	public MemberDto login(Map<String, String> map) throws Exception;
	
	public List<MemberDto> userList();
	public MemberDto userInfo(String userid);
	public void userRegister(MemberDto memberDto);
	public void userModify(MemberDto memberDto);
	public void userDelete(String userid);
	
}
