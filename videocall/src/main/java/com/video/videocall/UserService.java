package com.video.videocall;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import org.springframework.stereotype.Service;

@Service
public class UserService {

	private static final List<User> users_list=new ArrayList<>();
	
	public void register(User user)
	{
		user.setStatus("online");
		users_list.add(user);
		
	}
	
	public User login(User user)
	{
		 //finding the user in the user_list
		 int userIndex=IntStream.range(0, users_list.size())
				      .filter(i->users_list.get(i).getEmail().equals(user.getEmail()))
				      .findAny()
				      .orElseThrow(()->new RuntimeException("user not found"));
		 
		 User current_user=users_list.get(userIndex);//already present user with the same email id in users_list
		 
		 if(!current_user.getPassword().equals(user.getPassword()))
		 {
			 throw new RuntimeException("Password Incorrect");
		 }
		 
		 current_user.setStatus("online");
		 return current_user;
		 
	}
	
	public void logout(String email)//for logging out we take the mail of user.Find that user in users_list.And set its status to offline
	{
		int userIndex=IntStream.range(0, users_list.size())
				     .filter((i)->users_list.get(i).getEmail().equals(email))
				     .findAny()
				     .orElseThrow(()->new RuntimeException("User not found"));
		users_list.get(userIndex).setStatus("offline");
		
	}
	public List<User> findAll()
	{
		return users_list;
	}
	
	
}
