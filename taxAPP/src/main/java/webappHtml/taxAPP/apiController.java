package webappHtml.taxAPP;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;


@RestController
public class apiController {

    mainController mainCon = new mainController();

    @GetMapping("/api")
    public ResponseEntity<TaxResponse> getSum(@RequestParam double taxableIncome, @RequestParam int filing) {
        double returnTax = mainCon.calculatedTax(taxableIncome, filing);

        TaxResponse response = new TaxResponse(returnTax);
        return ResponseEntity.ok(response);
    }
    private static class TaxResponse {
        private final double calculatedTax;

        public TaxResponse(double calculatedTax) {
            this.calculatedTax = calculatedTax;
        }

        public double getCalculatedTax() {
            return calculatedTax;
        }
    }
}
