package com.alfredomarino.mybooks.core.services;

import com.alfredomarino.mybooks.core.model.Category;

public interface CategoryService {

    Category createIfNotExist(Category category);
}