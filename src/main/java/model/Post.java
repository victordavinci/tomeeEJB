package model;

public class Post {

	private int id;
	private int usrID;
	private String title;
	private String content;
	
	public Post(String title, String content, int user) {
		super();
		this.title = title;
		this.content = content;
		this.usrID = user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getusrId() {
		return usrID;
	}

	public void setusrId(int id) {
		this.usrID = id;
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
	
	@Override
	public String toString() {
		return "#" + id + ", " + usrID + " \"" + title + "\" " + content;
	}
}
