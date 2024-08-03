import java.util.List;

public interface PayrollInterface {

    void imprimerPaie(List<PayInfo> infoPaie);
    double netDeBrut(double grossPay);
    String rapportDeductions(List<PayInfo> infoPaie);

}
