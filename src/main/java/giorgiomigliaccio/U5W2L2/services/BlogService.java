package giorgiomigliaccio.U5W2L2.services;

import giorgiomigliaccio.U5W2L2.entities.Blog;
import giorgiomigliaccio.U5W2L2.exceptions.NotFoundException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class BlogService {
    private List<Blog> blog = new ArrayList<>();

    public List<Blog> getBlog() {
        return this.blog;
    }

    public Blog save(Blog body) {
        Random rndm = new Random();
        body.setId(rndm.nextInt(1, 2000));
        this.blog.add(body);
        return body;
    }

    public Blog findById(int id) {
        Blog found = null;
        for (Blog user : this.blog) {
            if (user.getId() == id) {
                found = user;
            }
        }
        if (found == null)
            throw new NotFoundException(id);
        return found;
    }

    public void findByIdAndDelete(int id) {
        Iterator<Blog> iterator = this.blog.iterator();
        while (iterator.hasNext()) {
            Blog current = iterator.next();
            if (current.getId() == id) {
                iterator.remove();
            }
        }
    }

    public Blog findByIdAndUpdate(int id, Blog body) {
        Blog found = null;
        for (Blog blog : this.blog) {
            if (blog.getId() == id) {
                found = blog;
                found.setId(id);
                found.setCategoria(body.getCategoria());
                found.setTitolo(body.getTitolo());
            }
        }
        if (found == null)
            throw new NotFoundException(id);
        return found;
    }
}
