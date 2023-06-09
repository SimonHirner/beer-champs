package at.ac.uibk.beerchamps.controller;

import at.ac.uibk.beerchamps.persistence.Tournament;
import at.ac.uibk.beerchamps.service.TournamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class IndexController {

    @Autowired
    TournamentService tournamentService;

    @GetMapping("/")
    public String getIndexView(Model m) {
        List<Tournament> currentTournaments = tournamentService.findAllTournaments();
        m.addAttribute("currentTournaments", currentTournaments);
        return "index";
    }
}
