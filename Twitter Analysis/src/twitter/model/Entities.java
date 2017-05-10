
package twitter.model;

import java.util.List;
import java.util.Map;

public class Entities {

	
	private List<Map<String,String>> trends;
	private List<Map<String,String>> symbols;
	private List<Urls> urls;
	private List<Hashtags> hashtags;
	private List<UserMentions> user_mentions;

	public List<Map<String, String>> getTrends() {
		return trends;
	}
	/**
	 * @param trends the trends to set
	 */
	public void setTrends(List<Map<String, String>> trends) {
		this.trends = trends;
	}
	/**
	 * @return the symbols
	 */
	public List<Map<String, String>> getSymbols() {
		return symbols;
	}
	/**
	 * @param symbols the symbols to set
	 */
	public void setSymbols(List<Map<String, String>> symbols) {
		this.symbols = symbols;
	}
	/**
	 * @return the urls
	 */
	public List<Urls> getUrls() {
		return urls;
	}
	/**
	 * @param urls the urls to set
	 */
	public void setUrls(List<Urls> urls) {
		this.urls = urls;
	}
	/**
	 * @return the hashtags
	 */
	public List<Hashtags> getHashtags() {
		return hashtags;
	}
	/**
	 * @param hashtags the hashtags to set
	 */
	public void setHashtags(List<Hashtags> hashtags) {
		this.hashtags = hashtags;
	}
	/**
	 * @return the user_mentions
	 */
	public List<UserMentions> getUser_mentions() {
		return user_mentions;
	}
	/**
	 * @param user_mentions the user_mentions to set
	 */
	public void setUser_mentions(List<UserMentions> user_mentions) {
		this.user_mentions = user_mentions;
	}
	
	
	
}
