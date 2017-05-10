
package twitter.model;

public class RetweetedStatus {

	private String text;
	private User user;
	private long retweet_count;
	private long id;
	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}
	/**
	 * @param text the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}
	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}
	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}
	/**
	 * @return the retweet_count
	 */
	public long getRetweet_count() {
		return retweet_count;
	}
	/**
	 * @param retweet_count the retweet_count to set
	 */
	public void setRetweet_count(long retweet_count) {
		this.retweet_count = retweet_count;
	}
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	

}
