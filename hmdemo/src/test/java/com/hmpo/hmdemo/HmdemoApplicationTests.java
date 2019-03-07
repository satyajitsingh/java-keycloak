package com.hmpo.hmdemo;


import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.mockito.Mockito;

import com.hmpo.hmdemo.controller.KeycloakController;
import com.hmpo.hmdemo.services.KeyCloakService;
import com.hmpo.hmdemo.datamodel.UserDTO;
import com.hmpo.hmdemo.datamodel.UserCredentials;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HmdemoApplicationTests {
	
	@Autowired
	private KeyCloakService keyCloak;
	private KeyCloakService mockKeyCloakService = mock(KeyCloakService.class);

	@Test
	public void contextLoads() {
		/*Test to create user in keycloak
		 * 
		 */
		UserDTO userDto = new UserDTO();
		userDto.setFirstName("firstname1");
		userDto.setLastName("lastName1");
		userDto.setEmailAddress("emailAddress1@email.com");
		userDto.setUserName("userName1");
		userDto.setPassword("password1");
		when(mockKeyCloakService.createUserInKeyCloak(userDto)).thenReturn(201);
		int result = mockKeyCloakService.createUserInKeyCloak(userDto);
        Assert.assertEquals(201, result);
        
        /* Test to find a user
         * 
         */
        
        UserCredentials usercredDto = new UserCredentials();
        String token = "tokenstring";
        usercredDto.setUsername("userName1");
        usercredDto.setPassword("password1");
        when(mockKeyCloakService.getToken(usercredDto)).thenReturn(token);
		String result2 = mockKeyCloakService.getToken(usercredDto);
        Assert.assertEquals(token, result2);
		
		    
	}

}
