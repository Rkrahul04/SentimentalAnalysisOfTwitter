
package twitter.model;

import java.util.List;

public class UserMentions {

	private long id;
	private String name;
	private List<Integer> indices;
	private String screen_name;
	private String id_str;
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the indices
	 */
	public List<Integer> getIndices() {
		return indices;
	}
	/**
	 * @param indices the indices to set
	 */
	public void setIndices(List<Integer> indices) {
		this.indices = indices;
	}
	/**
	 * @return the screen_name
	 */
	public String getScreen_name() {
		return screen_name;
	}
	/**
	 * @param screen_name the screen_name to set
	 */
	public void setScreen_name(String screen_name) {
		this.screen_name = screen_name;
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
}
