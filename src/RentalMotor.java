public class RentalMotor {
    private String noRental;
    private String tglSewa;
    private String tglKembali;
    private double hargaRental;
    private double dendaRental;
    private int durasi;
    private Customer customer;
    private Motor motor;
    private Pegawai pegawai;

    public String getNoRental() {
        return noRental;
    }

    public int getDurasi() {
        return durasi;
    }

    public void setDurasi(int durasi) {
        this.durasi = durasi;
    }

    public void setNoRental(String noRental) {
        this.noRental = noRental;
    }

    public String getTglSewa() {
        return tglSewa;
    }

    public void setTglSewa(String tglSewa) {
        this.tglSewa = tglSewa;
    }

    public String getTglKembali() {
        return tglKembali;
    }

    public void setTglKembali(String tglKembali) {
        this.tglKembali = tglKembali;
    }

    public double getHargaRental() {
        return hargaRental;
    }

    public void setHargaRental(double hargaRental) {
        this.hargaRental = hargaRental;
    }

    public double getDendaRental() {
        return dendaRental;
    }

    public void setDendaRental(double dendaRental) {
        this.dendaRental = dendaRental;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Pegawai getPegawai() {
        return pegawai;
    }

    public void setPegawai(Pegawai pegawai) {
        this.pegawai = pegawai;
    }
}
