package model;

import java.util.Date;

public class Publication {
	
	private String title;
	private Date edititionDate;
	private String editorial;
	private String[] authors;
	
	
	public Publication(String title, Date edititionDate, String editorial) {
		super();
		this.title = title;
		this.edititionDate = edititionDate;
		this.editorial = editorial;
	}
	
	
	
	/** 
	 * @return String
	 */
	public String getTitle() {
		return title;
	}
	
	/** 
	 * @param title
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	/** 
	 * @return Date
	 */
	public Date getEdititionDate() {
		return edititionDate;
	}
	
	/** 
	 * @param edititionDate
	 */
	public void setEdititionDate(Date edititionDate) {
		this.edititionDate = edititionDate;
	}
	
	/** 
	 * @return String
	 */
	public String getEditorial() {
		return editorial;
	}
	
	/** 
	 * @param editorial
	 */
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	
	/** 
	 * @return String[]
	 */
	public String[] getAuthors() {
		return authors;
	}
	
	/** 
	 * @param authors
	 */
	public void setAuthors(String[] authors) {
		this.authors = authors;
	}
	
	

}
