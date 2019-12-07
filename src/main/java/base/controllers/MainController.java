package base.controllers;

import base.services.ExpressionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    private ExpressionService expressionService;

    @Autowired
    public void setExpressionService(ExpressionService expressionService) {
        this.expressionService = expressionService;
    }

    @GetMapping("/")
    public String homePage(Model model){
        /*model.addAttribute("firstExres", expressionService.getRandomUniqueExression());
        model.addAttribute("secondExres", expressionService.getRandomUniqueExression());
        model.addAttribute("thirdExres", expressionService.getRandomUniqueExression());*/
//        model.addAttribute("expresList", expressionService.getListOfRandomUniqueExpressions(3));
        model.addAttribute("expresList", expressionService.getListOfRandomUniqueExpressionsWithTranslations(3));
        return "index";
    }

    @GetMapping("/about")
    public String aboutPage(){
        return "about_page";
    }
}
