public class Denda {
    private Peminjaman peminjaman;
    private int hariTerlambat;
    private int TARIF_DENDA = 10000;


    public Denda(Peminjaman peminjaman,int hariTerlambat ) {
        this.peminjaman = peminjaman;
        this.hariTerlambat = hariTerlambat;

    }

    public Peminjaman getPeminjama(){
        return this.peminjaman;
    }

    public int getTagihan(){
        return this.TARIF_DENDA * hariTerlambat;
    }

    public int getHariTerlambat(){
        return hariTerlambat;
    }
}