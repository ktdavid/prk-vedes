package hu.unideb.inf.maven;

public class Chord {

	private String name;
	private int positionInList;
	
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
	 * @return the positionInList
	 */
	public int getPositionInList() {
		return positionInList;
	}
	
	/**
	 * @param positionInList the positionInList to set
	 */
	public void setPositionInList(int positionInList) {
		this.positionInList = positionInList;
	}
	
	/**
	 * @param name
	 * @param positionInList
	 */
	public Chord(String name, int positionInList) {
		super();
		this.name = name;
		this.positionInList = positionInList;
	}
}
