
package twitter.model;

import java.util.List;

public class Geo {

	private String type;
	private List<Float> coordinates;
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the coordinates
	 */
	public List<Float> getCoordinates() {
		return coordinates;
	}
	/**
	 * @param coordinates the coordinates to set
	 */
	public void setCoordinates(List<Float> coordinates) {
		this.coordinates = coordinates;
	}
	
}
