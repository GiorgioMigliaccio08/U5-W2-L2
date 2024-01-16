package giorgiomigliaccio.U5W2L2.controllers;


import giorgiomigliaccio.U5W2L2.entities.Blog;
import giorgiomigliaccio.U5W2L2.services.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    private BlogService blogService;

    // 1. GET http://localhost:3001/blog
    @GetMapping
    public List<Blog> getBlog() {
        return blogService.getBlog();
    }

    // 	2. POST http://localhost:3001/users (+body)
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED) // Status Code 201
    public Blog saveBlog(@RequestBody Blog body) {
        return blogService.save(body);
    }

    // 	3. GET http://localhost:3001/users/:id
    @GetMapping("/{id}")
    public Blog findById(@PathVariable int id) {
        return blogService.findById(id);
    }


    // 	4. PUT http://localhost:3001/users/:id (+body)
    @PutMapping("/{id}")
    public Blog findByAndUpdate(@PathVariable int id, @RequestBody Blog body) {
        return this.blogService.findByIdAndUpdate(id, body);
    }

    // 	5. DELETE http://localhost:3001/users/:id
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT) // Status Code 204 (No content)
    public void findByIdAndDelete(@PathVariable int id) {
        this.blogService.findByIdAndDelete(id);
    }
}
