@Controller
public class SimpleController {
   @RequestMapping("/")
   public ModelAndView home() {
       ModelAndView mav = new ModelAndView();
       mav.getModel().put("message", "Hello World!");
       mav.setViewName("home");
       return mav;
   }
}