package beans;

import java.time.LocalDateTime;

public class DatumBean {

    private LocalDateTime aktuelltDatum = LocalDateTime.now();

    public LocalDateTime getAktuelltDatum() {
        return aktuelltDatum;
    }

    public void setAktuelltDatum(LocalDateTime aktuelltDatum) {
        this.aktuelltDatum = aktuelltDatum;
    }

}
