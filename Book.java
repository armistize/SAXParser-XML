import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author tawit_k
 *
 */
public class Book {

	private List<String> authors;
	private String id;
	private String isbn;
	private String language;
	private int price;
	private String publisher;
	private Date publishDate;
	private String title;

	public Book() {
		authors = new ArrayList<String>();
	}

	public List<String> getAuthors() {
		return authors;
	}

	public String getId() {
		return id;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getLanguage() {
		return language;
	}

	public int getPrice() {
		return price;
	}

	public String getPublisher() {
		return publisher;
	}

	public Date getPublishDate() {
		return publishDate;
	}

	public String getTitle() {
		return title;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public void setPublishDate(Date regDate) {
		this.publishDate = regDate;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}