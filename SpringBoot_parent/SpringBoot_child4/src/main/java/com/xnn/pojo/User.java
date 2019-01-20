package com.xnn.pojo;

/**
 * ��(�ӿ�)������
 * @author xnn
 * 2019��1��16������8:38:43
 */
public class User {
private int id;
private String username;
private String password;
/**
 * @param id
 * @param username
 * @param password
 */
public User(int id, String username, String password) {
	super();
	this.id = id;
	this.username = username;
	this.password = password;
}
/**
 * @return the id
 */
public int getId() {
	return id;
}
/**
 * @param id the id to set
 */
public void setId(int id) {
	this.id = id;
}
/**
 * @return the username
 */
public String getUsername() {
	return username;
}
/**
 * @param username the username to set
 */
public void setUsername(String username) {
	this.username = username;
}
/**
 * @return the password
 */
public String getPassword() {
	return password;
}
/**
 * @param password the password to set
 */
public void setPassword(String password) {
	this.password = password;
}
/**
 * 
 */
public User() {
	super();
}

/**
 * @param username
 * @param password
 */
public User(String username, String password) {
	super();
	this.username = username;
	this.password = password;
}
@Override
public String toString() {
	return "User [id=" + id + ", username=" + username + ", password="
			+ password + "]";
}



}
