package bookstore.bookstore.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import bookstore.bookstore.domain.Category;
import bookstore.bookstore.domain.CategoryRepository;

@Controller
public class CategoryController {
    @Autowired
    CategoryRepository categoryRepository;

    @GetMapping({ "/categorylist" })
    public String cetCategoryList(Model model) {
        List<Category> categories = (List<Category>) categoryRepository.findAll();
        model.addAttribute("categories", categories);
        return "categorylist";
    }

    @GetMapping("/addcategory")
    public String getNewCategoryForm(Model model) {
        model.addAttribute("category", new Category());
        return "addcategory";
    }

    @PostMapping("/savecategory")
    public String savecategory(@ModelAttribute Category category) {
        categoryRepository.save(category);
        return "redirect:/categorylist";
    }

}
