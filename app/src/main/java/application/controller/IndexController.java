package application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import application.model.Tarefa;
import application.model.TarefaRepository;

@Controller
public class IndexController {
    @Autowired
    TarefaRepository repo;

    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute("tarefas", repo.findAll());
        return "WEB-INF/home.jsp";
    }

    @RequestMapping(value = "/insert")
    public String insert(@RequestParam("texto") String descricao) {
        Tarefa tarefa = new Tarefa();
        tarefa.setDescricao(descricao);
        repo.save(tarefa);

        return "redirect:/";
    }
}

