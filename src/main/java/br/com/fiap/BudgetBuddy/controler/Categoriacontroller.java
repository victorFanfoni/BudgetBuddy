package br.com.fiap.BudgetBuddy.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Categoriacontroller {
    
    @RequestMapping(method = RequestMethod.GET, path = "/categoria", produces = "application/json")
    @ResponseBody
    public String index(){
        return """
            [
                {
                    "id":1,
                    "Nome": "Alimentacao",
                    "Icone": "fast-food"
                }
            ]
                """;
    }
}
