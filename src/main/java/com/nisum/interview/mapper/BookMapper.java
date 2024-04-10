package com.nisum.interview.mapper;

import com.nisum.interview.dto.BookDto;
import com.nisum.interview.model.Book;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface BookMapper {

    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    Book bookDtoToBook(BookDto bookDto);
    BookDto bookToBookDto(Book book);
    List<BookDto> booksToBooksDto(List<Book> books);
}
