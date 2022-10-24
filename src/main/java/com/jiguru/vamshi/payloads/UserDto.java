package com.jiguru.vamshi.payloads;

import com.jiguru.vamshi.entities.UserTypes;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {
	

	private Long  id;
	private String name;
	private int age;
	private String dateOfBirth;
	private String userName;
	private String Password;
	private  UserTypes userTypes;
}
