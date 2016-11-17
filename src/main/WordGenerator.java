package main;
import org.junit.Test;

public class WordGenerator {
	private static WordGenerator instance;
	private String category = null;
	private String nextCategory = null;
	
	
	private WordGenerator() {
		instance = WordGenerator.getInstance();
	}
	public static WordGenerator getInstance() {
		if (instance == null) {
			instance = new WordGenerator();
		}
		return instance;
	}
	
	/**
	 * Method to get a single word of the given length from the 
	 * @param len
	 * @return
	 */
	public String getWord(int len) {
		return null;
	}
	
	public String getWord(int minLen, int maxLen) {
		return null;
	}
	
	public boolean isValidCategory(String cat) {
		return false;
	}
	
	/**
	 * Return the current value of CATEGORY
	 * @return current value of CATEGORY
	 */
	public String getCategory() {
		return category;
	}
	
	/**
	 * If CAT is a valid category, sets CATEGORY to 
	 * cat. Returns new value of category.
	 * @param cat What to set CATEGORY to
	 * @return Value of CATEGORY after method completes
	 */
	public String setCategory(String cat) {
		if (isValidCategory(cat)) {
			category = cat;
		}
		return category;
	}
	
	/**
	 * Method to set the category to nextCategory and return it
	 * @return New value of category
	 */
	public String doNextCategory() {
		if (nextCategory != null) {
			category = nextCategory;
		}
		assert category != null;
		return category;
	}
	
}
