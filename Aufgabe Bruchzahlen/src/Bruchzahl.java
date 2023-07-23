public class Bruchzahl {

    private long z;
    private long n;

    public Bruchzahl(long z, long n) {
        this.z = z;
        this.n = n;
    }

    public Bruchzahl addiere(Bruchzahl q) {

        long newZ = (q.getZ() * this.n) + (this.z * q.getN());
        long newN = q.getN() * this.n;

        return new Bruchzahl(newZ, newN);
    }

    public Bruchzahl multiplizieren(Bruchzahl q) {
        long newZ = q.getZ() * this.z;
        long newN = q.getN() * this.n;
        return new Bruchzahl(newZ, newN);
    }

    public Bruchzahl subtrahieren(Bruchzahl q){
        long newZ = (this.z * q.getN()) - (q.getZ() * this.n);
        long newN = q.getN() * this.n;
        return new Bruchzahl(newZ, newN);
    }

    public Bruchzahl dividiere(Bruchzahl q){
        long newZ = q.getN() * this.z;
        long newN = q.getZ() * this.n;
        return new Bruchzahl(newZ, newN);
    }

    public void zeigeAn() {
        System.out.printf("(%d, %d)\n", this.z, this.n);
    }

    public long getZ() {
        return z;
    }

    public long getN() {
        return n;
    }
}
