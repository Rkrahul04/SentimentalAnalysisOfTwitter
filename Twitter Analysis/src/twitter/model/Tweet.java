package twitter.model;

public class Tweet {

	private String filter_level;
	private boolean retweeted;
	private String in_reply_to_screen_name;
	private boolean possibly_sensitive;
	private boolean truncated;
	private String lang;
	private String in_reply_to_status_id_str;
	private long id;
	private String in_reply_to_user_id_str;
	private String timestamp_ms;
	private String in_reply_to_status_id;
	private String created_at;
	private int favorite_count;
	private String text;
	private String contributors;	
	private Geo geo;
	private String source;
	private boolean favorited;
	private String in_reply_to_user_id;
	private long retweet_count;
	private String id_str;
	private RetweetedStatus retweeted_status;
	private Entities entities;
	private User user;
	
	/**
	 * @return the filter_level
	 */
	public String getFilter_level() {
		return filter_level;
	}
	/**
	 * @param filter_level the filter_level to set
	 */
	public void setFilter_level(String filter_level) {
		this.filter_level = filter_level;
	}
	/**
	 * @return the retweeted
	 */
	public boolean isRetweeted() {
		return retweeted;
	}
	/**
	 * @param retweeted the retweeted to set
	 */
	public void setRetweeted(boolean retweeted) {
		this.retweeted = retweeted;
	}
	/**
	 * @return the in_reply_to_screen_name
	 */
	public String getIn_reply_to_screen_name() {
		return in_reply_to_screen_name;
	}
	/**
	 * @param in_reply_to_screen_name the in_reply_to_screen_name to set
	 */
	public void setIn_reply_to_screen_name(String in_reply_to_screen_name) {
		this.in_reply_to_screen_name = in_reply_to_screen_name;
	}
	/**
	 * @return the possibly_sensitive
	 */
	public boolean isPossibly_sensitive() {
		return possibly_sensitive;
	}
	/**
	 * @param possibly_sensitive the possibly_sensitive to set
	 */
	public void setPossibly_sensitive(boolean possibly_sensitive) {
		this.possibly_sensitive = possibly_sensitive;
	}
	/**
	 * @return the truncated
	 */
	public boolean isTruncated() {
		return truncated;
	}
	/**
	 * @param truncated the truncated to set
	 */
	public void setTruncated(boolean truncated) {
		this.truncated = truncated;
	}
	/**
	 * @return the lang
	 */
	public String getLang() {
		return lang;
	}
	/**
	 * @param lang the lang to set
	 */
	public void setLang(String lang) {
		this.lang = lang;
	}
	/**
	 * @return the in_reply_to_status_id_str
	 */
	public String getIn_reply_to_status_id_str() {
		return in_reply_to_status_id_str;
	}
	/**
	 * @param in_reply_to_status_id_str the in_reply_to_status_id_str to set
	 */
	public void setIn_reply_to_status_id_str(String in_reply_to_status_id_str) {
		this.in_reply_to_status_id_str = in_reply_to_status_id_str;
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
	/**
	 * @return the in_reply_to_user_id_str
	 */
	public String getIn_reply_to_user_id_str() {
		return in_reply_to_user_id_str;
	}
	/**
	 * @param in_reply_to_user_id_str the in_reply_to_user_id_str to set
	 */
	public void setIn_reply_to_user_id_str(String in_reply_to_user_id_str) {
		this.in_reply_to_user_id_str = in_reply_to_user_id_str;
	}
	/**
	 * @return the timestamp_ms
	 */
	public String getTimestamp_ms() {
		return timestamp_ms;
	}
	/**
	 * @param timestamp_ms the timestamp_ms to set
	 */
	public void setTimestamp_ms(String timestamp_ms) {
		this.timestamp_ms = timestamp_ms;
	}
	/**
	 * @return the in_reply_to_status_id
	 */
	public String getIn_reply_to_status_id() {
		return in_reply_to_status_id;
	}
	/**
	 * @param in_reply_to_status_id the in_reply_to_status_id to set
	 */
	public void setIn_reply_to_status_id(String in_reply_to_status_id) {
		this.in_reply_to_status_id = in_reply_to_status_id;
	}
	/**
	 * @return the created_at
	 */
	public String getCreated_at() {
		return created_at;
	}
	/**
	 * @param created_at the created_at to set
	 */
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	/**
	 * @return the favorite_count
	 */
	public int getFavorite_count() {
		return favorite_count;
	}
	/**
	 * @param favorite_count the favorite_count to set
	 */
	public void setFavorite_count(int favorite_count) {
		this.favorite_count = favorite_count;
	}

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
	 * @return the contributors
	 */
	public String getContributors() {
		return contributors;
	}
	/**
	 * @param contributors the contributors to set
	 */
	public void setContributors(String contributors) {
		this.contributors = contributors;
	}
	/**
	 * @return the geo
	 */
	public Geo getGeo() {
		return geo;
	}
	/**
	 * @param geo the geo to set
	 */
	public void setGeo(Geo geo) {
		this.geo = geo;
	}
	/**
	 * @return the source
	 */
	public String getSource() {
		return source;
	}
	/**
	 * @param source the source to set
	 */
	public void setSource(String source) {
		this.source = source;
	}
	/**
	 * @return the favorited
	 */
	public boolean isFavorited() {
		return favorited;
	}
	/**
	 * @param favorited the favorited to set
	 */
	public void setFavorited(boolean favorited) {
		this.favorited = favorited;
	}
	/**
	 * @return the in_reply_to_user_id
	 */
	public String getIn_reply_to_user_id() {
		return in_reply_to_user_id;
	}
	/**
	 * @param in_reply_to_user_id the in_reply_to_user_id to set
	 */
	public void setIn_reply_to_user_id(String in_reply_to_user_id) {
		this.in_reply_to_user_id = in_reply_to_user_id;
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
	 * @return the id_str
	 */
	public String getId_str() {
		return id_str;
	}
	/**
	 * @param id_str the id_str to set
	 */
	public void setId_str(String id_str) {
		this.id_str = id_str;
	}
	/**
	 * @return the entities
	 */
	public Entities getEntities() {
		return entities;
	}
	/**
	 * @param entities the entities to set
	 */
	public void setEntities(Entities entities) {
		this.entities = entities;
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
	 * @return the retweeted_status
	 */
	public RetweetedStatus getRetweeted_status() {
		return retweeted_status;
	}
	/**
	 * @param retweeted_status the retweeted_status to set
	 */
	public void setRetweeted_status(RetweetedStatus retweeted_status) {
		this.retweeted_status = retweeted_status;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder strBuild = new StringBuilder();
		//strBuild.append(getId() + " : "+getRetweet_count());
		
		if(getRetweeted_status()!=null)
		  strBuild.append(getRetweeted_status().getRetweet_count() + " : "+getRetweeted_status().getUser().getScreen_name());
		
		return strBuild.toString();
	}
	
	
}
