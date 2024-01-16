package giorgiomigliaccio.U5W2L2.services;

import giorgiomigliaccio.U5W2L2.entities.Autore;
import giorgiomigliaccio.U5W2L2.exceptions.NotFoundException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class AutoreService {
    private List<Autore> blog = new ArrayList<>();

    public List<Autore> getBlog() {
        return this.blog;
    }

    public Autore save(Autore body) {
        Random rndm = new Random();
        body.setId(rndm.nextInt(1, 2000));
        this.autore.add(body);
        return body;
    }

    public AutorefindById(int id) {
        Autore found = null;
        for (Autore autore : this.autore) {
            if (autore.getId() == id) {
                found = autore;
            }
        }
        if (found == null)
            throw new NotFoundException(id);
        return found;
    }

    public void findByIdAndDelete(int id) {
        Iterator<Autore> iterator = this.autore.iterator();
        while (iterator.hasNext()) {
            Autore current = iterator.next();
            if (current.getId() == id) {
                iterator.remove();
            }
        }
    }

    public Autore findByIdAndUpdate(int id, Autore body) {
        Autore found = null;
        for (Autore autore : this.autore) {
            if (autore.getId() == id) {
                found = autore;
                found.setId(id);
                found.setNome(body.getNome());
                found.setCognome(body.getCognome());
            }
        }
        if (found == null)
            throw new NotFoundException(id);
        return found;
    }
}
