package com.nisum.interview.dto;

/*@Getter
@Setter
@NoArgsConstructor*/

public class BookDto implements Comparable {

    private long id;
    private String title;
    private String author;
    private String code;
    private double price;

    public BookDto() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Object o) {
        BookDto bookToCompare = (BookDto) o;
        return this.getTitle().compareTo(bookToCompare.getTitle());
    }
}
