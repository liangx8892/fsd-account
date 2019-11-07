package com.fsd.sba;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.fsd.sba.entity.User;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class AccountApplicationTests {

    
    @Test
    public void test() throws Exception {
    	/*
    	userRepository.findAll();
    	userRepository.deleteAll();
    	User user = new User("password", "admin@fsd.com", "fsd", "admin");

    	userRepository.save(user);
    	Assert.assertEquals(1, userRepository.findAll().size());
    	Assert.assertEquals("admin@fsd.com", userRepository.findByName("admin").getEmail());
    	*/
    }

	
}
