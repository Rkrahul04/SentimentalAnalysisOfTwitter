
package twitter.model;

import java.util.List;

public class Hashtags {

	private String text;
	private List<Integer> indices;
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
	
	
}
