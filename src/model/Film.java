package model;

/**
 * <h1>Film</h1>
 * Film es una clase padre abstracta.
 * <p>
 * Es la clase base de la familia Films, como es abstracta no se puede instanciar y por ende contiene el método abstracto 
 * {@code view()} que es obligatorio implementar para todo aquél que pertenezca a la familia.
 * 
 * @author Cesar Ramírez
 * @version 1.1
 * @since 2018
 **/
public abstract class Film {
	
	private String title;
	private String genre;
	private String creator;
	private int duration;
	private short year;
	private boolean viewed;
	
	
	
	public Film(String title, String genre, String creator, int duration) {
		super();
		this.title = title;
		this.genre = genre;
		this.creator = creator;
		this.duration = duration;
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
	 * @return String
	 */
	public String getGenre() {
		return genre;
	}
	
	/** 
	 * @param genre
	 */
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	/** 
	 * @return String
	 */
	public String getCreator() {
		return creator;
	}
	
	/** 
	 * @param creator
	 */
	public void setCreator(String creator) {
		this.creator = creator;
	}
	
	/** 
	 * @return int
	 */
	public int getDuration() {
		return duration;
	}
	
	/** 
	 * @param duration
	 */
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	/** 
	 * @return short
	 */
	public short getYear() {
		return year;
	}
	
	/** 
	 * @param year
	 */
	public void setYear(short year) {
		this.year = year;
	}
	
	/** 
	 * @return String
	 */
	public String isViewed() {
		String visto = "";
		if(viewed == true) {
			visto = "Sí";
		}else {
			visto = "No";
		}
		
		return visto;
	}
	
	
	/** 
	 * @return boolean
	 */
	public boolean getIsViewed() {
		return viewed;
	}
	
	/** 
	 * @param viewed
	 */
	public void setViewed(boolean viewed) {
		this.viewed = viewed;
	}
	
	 /**
	 * {@code view()} es un método abstracto obligatorio de implementar.
	 **/
	public abstract void view();

}









