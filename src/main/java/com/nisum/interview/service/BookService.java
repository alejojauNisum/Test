package com.nisum.interview.service;

import com.nisum.interview.mapper.BookMapper;

// Todo 4. Complete the notations
public class BookService {
    BookMapper bookMapper = BookMapper.INSTANCE;

    // Todo 5. Generate the instances required to complete the API
    //  Hint: There is a Book Dto and a Book model.
    //  Hint 2: There is a Repository for Book with the necessary methods


    //Todo 6. Create the methods: createBook, getBooks and getBookByAuthorAndTitle
    //  The filters (page: long, sizePage: long and orderedTitle: boolean)
    //  for the list of books will be applied and implemented to the result of getting all books, NOT to the requests.
    //  Hint 1: When trying to create a Book verify that it doesn't already
    //  exist, if it exist it can't be registered again (verify title and author are not the same as other book)

}
