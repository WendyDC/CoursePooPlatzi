package model;

import java.util.ArrayList;

/**
 * Hereda de {@link Movie}
 * @see Film
 */
public class Chapter extends Movie {
	
	
	private int id;
	private int sessionNumber;
	private Serie serie;

	public Chapter(String title, String genre, String creator, int duration, short year, int sessionNumber, Serie serie) {
		super(title, genre, creator, duration, year);
		// TODO Auto-generated constructor stub
		this.setSessionNumber(sessionNumber);
		this.setSerie(serie);
	}
	
	
	/** 
	 * @return int
	 */
	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return this.id;
	}

	
	/** 
	 * @return int
	 */
	public int getSessionNumber() {
		return sessionNumber;
	}

	
	/** 
	 * @param sessionNumber
	 */
	public void setSessionNumber(int sessionNumber) {
		this.sessionNumber = sessionNumber;
	}
	
	
	
	/** 
	 * @return Serie
	 */
	public Serie getSerie() {
		return serie;
	}

	
	/** 
	 * @param serie
	 */
	public void setSerie(Serie serie) {
		this.serie = serie;
	}

	
	/** 
	 * @return String
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "\n :: SERIE ::" + 
				"\n Title: " + getSerie().getTitle() +
				"\n :: CHAPTER ::" + 
				"\n Title: " + getTitle() +
				"\n Year: " + getYear() + 
				"\n Creator: " + getCreator() +
				"\n Duration: " + getDuration();
	}
	
	
	
	/** 
	 * @param serie
	 * @return ArrayList<Chapter>
	 */
	public static ArrayList<Chapter> makeChaptersList(Serie serie) {
		ArrayList<Chapter> chapters = new ArrayList();
		
		for (int i = 1; i <= 5; i++) {
			chapters.add(new Chapter("Capituo "+i, "genero "+i, "creator" +i, 45, (short)(2017+i), i, serie));
		}
		
		return chapters;
	}
	
	@Override
	public void view() {
		super.view();

		ArrayList<Chapter> chapter = getSerie().getChapters();
		int chapterViewerCounter = 0;
		for (Chapter c: chapter){
			if(c.getIsViewed()){
				chapterViewerCounter++;
			}
		}
		if(chapterViewerCounter == chapter.size()){
			getSerie().view();
		}

	}
	
}







