package edu.mum.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import edu.mum.domain.Category;
import edu.mum.service.CategoryService;
@Component
public class CategoryFormatter implements Formatter<Category> {

	@Autowired
	private CategoryService categoryService;
	@Override
	public String print(Category category, Locale arg1) {
		// TODO Auto-generated method stub
		return String.valueOf(category.getId());
	}

	@Override
	public Category parse(String id, Locale arg1) throws ParseException {
		// TODO Auto-generated method stub
		return categoryService.getCategory(Integer.valueOf(id));
	}

}
