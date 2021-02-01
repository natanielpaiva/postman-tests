package exemplo.postman;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("carro")
public class CarroController {

    @Autowired
    CarroRepository carroRepository;

    @PostMapping
    public Carro salvarCarro(@RequestBody Carro carro){
        return carroRepository.save(carro);
    }

    @GetMapping
    public List<Carro> listarCarros(){
        return carroRepository.findAll();
    }

}
