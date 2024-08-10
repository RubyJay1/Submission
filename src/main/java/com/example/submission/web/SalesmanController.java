package com.example.submission.web;

import com.example.submission.entities.Salesman;
import com.example.submission.repository.SalesmanRepository;
import jakarta.servlet.http.HttpSession;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;

@SessionAttributes({"a","e"})
@Controller
@AllArgsConstructor
@Component


    public class SalesmanController {

    @Autowired
    private SalesmanRepository salesmanRepository;
    static int num = 0;

    @GetMapping(path = "/")
    public String salesman(Model model, ModelMap mm, @RequestParam(name="keyword",defaultValue = "") String keyword, HttpSession session){
        List<Salesman> salesman; if (keyword.isEmpty()) {
            salesman = salesmanRepository.findAll();
        } else {
            mm.put("e", 0);
            mm.put("a", 0);
            salesman = salesmanRepository.findAllBy(keyword);
        }
        model.addAttribute("listSalesman", salesman);
        return "salesman";
    }
}
