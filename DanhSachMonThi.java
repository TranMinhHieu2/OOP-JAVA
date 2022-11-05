package codeptit;

import javax.security.auth.Subject;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class monThi implements Comparable<monThi> {
    private String mamon, tenmon, hinhthucthi;

    public monThi() {
    }

    public monThi(String mamon, String tenmon, String hinhthucthi) {
        this.mamon = mamon;
        this.tenmon = tenmon;
        this.hinhthucthi = hinhthucthi;
    }

    public String getMamon() {
        return mamon;
    }

    public String toString() {
        return mamon + " " + tenmon + " " + hinhthucthi;
    }

    @Override
    public int compareTo(monThi other) {
        return this.mamon.compareTo(other.getMamon());
    }
}

public class DanhSachMonThi {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("MONHOC.in");
        Scanner sc = new Scanner(file);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<monThi> list = new ArrayList<>();

        for(int i=0;i<t;i++){
            String mamon= sc.nextLine();
            String tenmon=sc.nextLine();
            String hinhthucthi=sc.nextLine();
            list.add(new monThi(mamon,tenmon,hinhthucthi));
        }
        Collections.sort(list);
        for (monThi i:list){
            System.out.println(i);
        }
    }
}
