package view;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import controller.PostController;
import db.DataBase;
import model.Post;
	
@Named
@SessionScoped
	public class PostMb  implements Serializable {
		private static final long serialVersionUID = 1L;

		@Inject
		private DataBase db;
		
		@Inject
		private PostController postCntr;
		
		@Inject
		private AuthMb authMb;
		
		

		private String title;
		private String content;
		
		
		public String create(){
			Post post = new Post(title, content, authMb.getCurrentUserId());
			postCntr.createPost(post);
			return "home";
		}
		
		public List<Post> listPostUser(){
			return postCntr.getUserPost(authMb.getCurrentUserId(), db.getPost());
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}
		public String getContent() {
			return content;
		}

		public void setContent(String content) {
			this.content = content;
		}

}
