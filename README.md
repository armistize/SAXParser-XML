
#XML Parser using SAX
SAX (Simple API for XML) is an event-driven online algorithm for parsing XML documents, with an API interface developed by the XML-DEV mailing list. SAX provides a mechanism for reading data from an XML document that is an alternative to that provided by the Document Object Model (DOM). Where the DOM operates on the document as a whole, SAX parsers operate on each piece of the XML document sequentially.

>
> **Tip:** If you are new to event-driven for parsing XML documents please see [Detailed guides](https://github.com/armistize/SAXParser-XML#detailed-guides) topic first.
>

#Usages
```
 BookParser bookParser = new BookParser("example.xml");
 List<Book> books = bookParser.getBooks();
```

#Sample XML Document 
```
<?xml version="1.0" encoding="UTF-8"?>
<catalog>
    <book id="50015" language="TH">
        <isbn>0-85131-041-9</isbn>
        <publishDate>12-21-2015</regDate>
        <title>Android Tutorial</title>
        <publisher country="THA">Siam</publisher>
        <price>400</price>
        <authors>
            <author>Tawit Kalayanamit</author>
        </authors>
    </book>
    <book id="50016" language="EN">
        <isbn>0-684-84328-5</isbn>
        <publishDate>12-05-2015</regDate>
        <title>SAX Parser</title>
        <publisher country="USA">Pearson</publisher>
        <price>200</price>
        <authors>
            <author>Author1</author>
            <author>Author2</author>
            <author>Author3</author>
        </authors>
    </book>
</catalog>
```

#Detailed guides
[Simple API for XML](https://en.wikipedia.org/wiki/Simple_API_for_XML)  

#License
>The MIT License (MIT)

>Copyright (c) 2015 Tawit K.

>Permission is hereby granted, free of charge, to any person obtaining a copy
>of this software and associated documentation files (the "Software"), to deal
>in the Software without restriction, including without limitation the rights
>to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
>copies of the Software, and to permit persons to whom the Software is
>furnished to do so, subject to the following conditions:

>The above copyright notice and this permission notice shall be included in all
>copies or substantial portions of the Software.

>THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
