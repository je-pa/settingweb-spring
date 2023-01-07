package controller;

import com.devfun.service.MovieService;
import com.devfun.vo.MovieVo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;
import java.util.Locale;

@Controller
public class HomeController {
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    private final MovieService service;

    public HomeController(MovieService service) {
        this.service = service;
    }

    /**
     * Simply selects the home view to render by returning its name.
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Locale locale, Model model) throws Exception{

        logger.info("home");

        List<MovieVo> movieList = service.selectMovie();

        model.addAttribute("movieList", movieList);

        return "home";
    }
}
