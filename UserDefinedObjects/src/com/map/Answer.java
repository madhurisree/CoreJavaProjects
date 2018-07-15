package com.map;

public class Answer {
	private int id;
	private String answer;
	private String postDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getPostDate() {
		return postDate;
	}
	public void setPostDate(String postDate) {
		this.postDate = postDate;
	}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return "answer id :"+answer+"postdatef :"+postDate;
}
}
