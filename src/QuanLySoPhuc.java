public class QuanLySoPhuc {
    SoPhuc soPhuc = new SoPhuc();
    public void NhapSoPhuc(double a, double b){
        soPhuc.setPhanThuc(a);
        soPhuc.setPhanAo(b);
        System.out.println("Nhập thành công");
        soPhuc.HienThiSoPhuc();
    }
    public void HienThiSoPhuc(){
        soPhuc.HienThiSoPhuc();
    }
    public SoPhuc Cong2SoPhuc(SoPhuc soPhuc2){
        double phanThuc = soPhuc.getPhanThuc() + soPhuc2.getPhanThuc();
        double phanAo = soPhuc.getPhanAo() + soPhuc2.getPhanAo();
        return new SoPhuc(phanThuc, phanAo);
    }
    public SoPhuc Nhan2SoPhuc(SoPhuc soPhuc2){
        double phanThuc = ((soPhuc.getPhanThuc() * soPhuc2.getPhanThuc()) - (soPhuc.getPhanAo() * soPhuc2.getPhanAo()));
        double phanAo = ((soPhuc.getPhanThuc() * soPhuc2.getPhanAo()) + (soPhuc.getPhanAo() * soPhuc2.getPhanThuc()));
        return new SoPhuc(phanThuc, phanAo);
    }
}
