package giorgiomigliaccio.U5W2L2.controllers;

import giorgiomigliaccio.U5W2L2.entities.Autore;
import giorgiomigliaccio.U5W2L2.services.AutoreService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/autore")
public class AutoreController {

    @Autowired
    private AutoreService autoreService;

    // 1. GET http://localhost:3001/blog
    @GetMapping
    public List<Autore> getBlog() {
        return autoreService.getBlog();
    }

    // 	2. POST http://localhost:3001/users (+body)
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED) // Status Code 201
    public Autore saveBlog(@RequestBody Autore body) {
        return autoreService.save(body);
    }

    // 	3. GET http://localhost:3001/users/:id
    @GetMapping("/{id}")
    public Autore findById(@PathVariable int id) {
        return autoreService.findById(id);
    }


    // 	4. PUT http://localhost:3001/users/:id (+body)
    @PutMapping("/{id}")
    public Autore findByAndUpdate(@PathVariable int id, @RequestBody Autore body) {
        return this.autoreService.findByIdAndUpdate(id, autore);
    }

    // 	5. DELETE http://localhost:3001/users/:id
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT) // Status Code 204 (No content)
    public void findByIdAndDelete(@PathVariable int id) {
        this.autoreService.findByIdAndDelete(id);
    }
}
