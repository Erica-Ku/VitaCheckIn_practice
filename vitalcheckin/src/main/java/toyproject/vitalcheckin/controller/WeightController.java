package toyproject.vitalcheckin.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import toyproject.vitalcheckin.domain.Weight;
import toyproject.vitalcheckin.service.WeightService;

import javax.validation.Valid;

@Log4j2
@Controller
@RequestMapping("/weight")
@RequiredArgsConstructor
public class WeightController {
    private final WeightService weightService;

    @GetMapping("/add")
    public String addWeight(Model model, Weight weight) {
        model.addAttribute("weight", weight);
        return "weightInput";
    }

    @PostMapping("/add")
    public String addWeight(@ModelAttribute @Valid Weight weight, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "errorPage";
        }
        Weight savedWeight = weightService.saveWeight(weight);
        model.addAttribute("weight", savedWeight);
        return "weightRecord";
    }
}
