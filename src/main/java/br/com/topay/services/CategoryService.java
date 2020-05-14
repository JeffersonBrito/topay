package br.com.topay.services;

import br.com.topay.models.Category;
import br.com.topay.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll(){
        return categoryRepository.findAll();
    }

    public Category findById(Long id){
        Optional<Category> userObject = categoryRepository.findById(id);
        return userObject.get();
    }
}
