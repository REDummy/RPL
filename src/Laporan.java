import java.time.LocalDate;


public class Laporan {
    private LocalDate tanggal;
    private RentalMotor[] rental;
    private Double totalPemasukan;
    private int counter=0;

    public LocalDate getTanggal() {
        return tanggal;
    }

    public void setTanggal(LocalDate tanggal) {
        this.tanggal = tanggal;
    }

    public RentalMotor[] getRental() {
        return rental;
    }

    public void setRental(RentalMotor[] rental) {
        this.rental = rental;
    }

    public void AddRental(RentalMotor rental) {
        this.rental[counter] = rental;
        counter++;
    }
    public Double getTotalPemasukan() {
        return totalPemasukan;
    }

    public void setTotalPemasukan(Double totalPemasukan) {
        this.totalPemasukan = totalPemasukan;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}