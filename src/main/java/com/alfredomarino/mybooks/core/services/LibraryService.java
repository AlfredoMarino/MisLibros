package com.alfredomarino.mybooks.core.services;

import com.alfredomarino.mybooks.core.model.Book;
import com.alfredomarino.mybooks.core.model.Library;

import java.util.List;

public interface LibraryService {

    Library createLibrary(Long personId, String googleId, Library library);

    List<Library> getLibrariesByPersonId(Long personId);

    List<Book> getBooksByPersonId(Long personId);

    void deleteLibrary(Long personId, Long bookId);
}
