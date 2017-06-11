package camila.garcia.test.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class QuotationController {

    String bankUrl = "https://www.bancoprovincia.com.ar/Principal/Dolar";

    @RequestMapping(value = "/quotation/USD", method = RequestMethod.GET)
    public ModelAndView getUsdQuotation() {
        return new ModelAndView("redirect:" + bankUrl);
    }

    @RequestMapping(value = {"/quotation/ARS", "/quotation/BRL"})
    @ResponseBody
    public ResponseEntity getQuotation() {
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                .body("ERROR 401: Not authorized");
    }

}
