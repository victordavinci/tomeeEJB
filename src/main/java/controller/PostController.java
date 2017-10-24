package controller;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

import db.DataBase;
import model.Post;
import view.AuthMb;
import view.PostMb;


@Stateless
public class PostController {

	@Inject
	private DataBase db;
	
	
	@Inject
	private AuthMb authMb;

	@Inject
	private PostMb postMb;
	
	public List<Post> userPostsList = new ArrayList<>();
	
	public void createPost(Post post){
		post.setId(db.nextPostId());
		post.setusrId(authMb.getCurrentUserId());
		db.posts.add(post);
	}
	public List<Post> getUserPost(int userId, List<Post> postList ){
		
		userPostsList.clear();
		for(Post post : postList){
			
			if(post.getusrId() == userId){
				this.userPostsList.add(post);
			}
		} 
		return userPostsList;
	}
	

	
}
