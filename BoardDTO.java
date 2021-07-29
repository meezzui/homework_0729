package com.koreait.board;

public class BoardDTO {
	private int idx; //bigInt 여서 long으로 해줌
	private String userid;
	private String title;
	private String content;
	private String regdate;
	private int hit;
	private int like;
	private String file;
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
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
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public int getLike() {
		return like;
	}
	public void setLike(int like) {
		this.like = like;
	}
	public String getFile() {
		return file;
	}
	public void setFile(String file) {
		this.file = file;
	}
	@Override
	public String toString() {
		return "BoardDTO [idx=" + idx + ", userid=" + userid + ", title=" + title + ", content=" + content
				+ ", regdate=" + regdate + ", hit=" + hit + ", like=" + like + ", file=" + file + "]";
	}
	
	
	
	
	
	
	
	

}
