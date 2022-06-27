package user.kyojun.spring.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
	String id;
	String pass;
	String name;
	String phonenum;
	String email;
}
