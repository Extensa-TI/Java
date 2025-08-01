package interfaces.diamante_solucao_sem_interface;

import java.time.Duration;

public class RentalService {

    private Double pricePerHour;
    private Double pricePerDay;

    private BrazilTaxService taxService;

    public RentalService(Double pricePerHour, Double pricePerDay, BrazilTaxService taxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental)
    {
        double minutos = Duration.between(carRental.getStart(),carRental.getFinish()).toMinutes();
        double hours = minutos/60.0;
        double basicPayment;
        if (hours <= 12)
        {
            basicPayment = pricePerHour * Math.ceil(hours);
        }
        else
        {
            basicPayment = pricePerDay * Math.ceil(hours/24);
        }
        double tax = taxService.tax(basicPayment);
        carRental.setInvoice(new Invoice(basicPayment,tax));
    }
}
