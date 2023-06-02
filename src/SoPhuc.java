public class SoPhuc {
    private double PhanThuc;
    private double PhanAo;
    public SoPhuc(){

    }
    public SoPhuc (double a, double b){
        PhanThuc = a;
        PhanAo = b;
    }

    public double getPhanThuc() {
        return PhanThuc;
    }

    public void setPhanThuc(double a) {
        PhanThuc = a;
    }

    public double getPhanAo() {
        return PhanAo;
    }

    public void setPhanAo(double b) {
        PhanAo = b;
    }
    public void HienThiSoPhuc(){
        System.out.println("Số phức: "+getPhanThuc()+ "+" +getPhanAo()+"i");
    }
}
