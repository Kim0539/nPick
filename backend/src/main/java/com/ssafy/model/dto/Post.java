package com.ssafy.model.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "post")
public class Post {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "post_id")
	private long postId;
	@Column(name = "user_no")
	private long userNo;
	@Column(name = "post_dir_id")
	private long postDirId;
	@Column(name = "post_title")
	private String postTitle;
	@Column(name = "post_content")
	private String postContetnt;
	@Column(name = "post_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date postDate;
	@Column(name = "post_favorite")
	private boolean postFavorite;

	public long getPostId() {
		return postId;
	}

	public void setPostId(long postId) {
		this.postId = postId;
	}

	public long getUserNo() {
		return userNo;
	}

	public void setUserNo(long userNo) {
		this.userNo = userNo;
	}

	public long getPostDirId() {
		return postDirId;
	}

	public void setPostDirId(long postDirId) {
		this.postDirId = postDirId;
	}

	public String getPostTitle() {
		return postTitle;
	}

	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}

	public String getPostContetnt() {
		return postContetnt;
	}

	public void setPostContetnt(String postContetnt) {
		this.postContetnt = postContetnt;
	}

	public Date getPostDate() {
		return postDate;
	}

	public void setPostDate(Date postDate) {
		this.postDate = postDate;
	}

	public boolean isPostFavorite() {
		return postFavorite;
	}

	public void setPostFavorite(boolean postFavorite) {
		this.postFavorite = postFavorite;
	}

	@Override
	public String toString() {
		return "Post [postId=" + postId + ", userNo=" + userNo + ", postDirId=" + postDirId + ", postTitle=" + postTitle
				+ ", postContetnt=" + postContetnt + ", postDate=" + postDate + ", postFavorite=" + postFavorite + "]";
	}

}
