package com.example.demo.mapper;

import com.example.demo.dto.BookDto;
import com.example.demo.model.Book;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface BookMapper {

    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    Book bookDtoToBook(BookDto bookDto);
    BookDto bookToBookDto(Book book);
    List<BookDto> booksToBooksDto(List<Book> books);
}
