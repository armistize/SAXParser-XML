import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * @author tawit_k
 *
 */
public class BookParser extends DefaultHandler {
	Book book;
	List<Book> books;
	String bookXmlFileName;
	SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yy");
	String value;

	public BookParser(String bookXmlFileName) {
		this.bookXmlFileName = bookXmlFileName;
		books = new ArrayList<Book>();
		parseXMLDocument();
	}

	@Override
	public void characters(char[] charArray, int start, int length)
			throws SAXException {
		value = new String(charArray, start, length);
	}

	@Override
	public void endElement(String uri, String localName, String element)
			throws SAXException {
		if (element.equals(Constants.BOOK)) {
			books.add(book);
		}
		if (element.equalsIgnoreCase(Constants.ISBN)) {
			book.setIsbn(value);
		}
		if (element.equalsIgnoreCase(Constants.TITLE)) {
			book.setTitle(value);
		}
		if (element.equalsIgnoreCase(Constants.AUTHOR)) {
			book.getAuthors().add(value);
		}
		if (element.equalsIgnoreCase(Constants.PRICE)) {
			book.setPrice(Integer.parseInt(value));
		}
		if (element.equalsIgnoreCase(Constants.PUBLISH_DATE)) {
			try {
				book.setPublishDate(dateFormat.parse(value));
			} catch (ParseException e) {
				System.out.println("Date parsing error");
			}
		}
	}

	private void parseXMLDocument() {
		SAXParserFactory factory = SAXParserFactory.newInstance();
		try {
			SAXParser parser = factory.newSAXParser();
			parser.parse(bookXmlFileName, this);
		} catch (ParserConfigurationException e) {
			System.out.println("ParserConfig error");
		} catch (SAXException e) {
			System.out.println("SAXException : xml not well formed");
		} catch (IOException e) {
			System.out.println("IO error");
		}
	}

	@Override
	public void startElement(String uri, String localName, String elementName,
			Attributes attributes) throws SAXException {
		if (elementName.equalsIgnoreCase(Constants.BOOK)) {
			book = new Book();
			book.setId(attributes.getValue(Constants.ID));
			book.setLanguage(attributes.getValue(Constants.LANGUAGE));
		}

		if (elementName.equalsIgnoreCase(Constants.PUBLISHER)) {
			book.setPublisher(attributes.getValue(Constants.COUNTRY));
		}
	}
}