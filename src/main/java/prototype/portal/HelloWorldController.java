package prototype.portal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public String indexPage() {
    return "index";
  }

}
