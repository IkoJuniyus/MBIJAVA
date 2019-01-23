
package mbijava;
import java.util.Scanner;
/**
 *
 * @author usjul
 */
public class MBIjava {
    static double hasilukur,hasil,nilaitinggi,nilaiberat,convertcm,convertpangakat;
    String gender;
    static String print;
    static int o = 0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        do {  
        System.out.println("BMI Java Aplikasi");
        System.out.println("pilih jenis kelamin 1/2");
        System.out.println("1.laki-laki");
        System.out.println("2.perempuan");
        System.out.println("masukan pilihan : ");
        int pilih = input.nextInt();
        switch(pilih){
            case 1:
                System.out.println("masukan tinggi badan :");
                nilaitinggi = input.nextDouble();
                System.out.println("masukan berat badan :");
                nilaiberat = input.nextDouble();
                hasil = nilaitinggi-100;
                convertcm = nilaitinggi /100;
                convertpangakat = convertcm*convertcm;
                hasilukur = nilaiberat/convertpangakat;
                if (hasilukur>=18.5 && hasilukur<=25){
                        print = "normal";
                }else if (hasilukur<18.5){
                        print = "kurus";
                }else if (hasilukur>25){
                        print = "gemuk";
                }
                System.out.println("BBI Standar:"+hasil);
                System.out.println("laki-laki BBI : "+print);
                break;
            case 2:
                System.out.println("masukan tinggi badan :");
                nilaitinggi = input.nextDouble();
                System.out.println("masukan berat badan :");
                nilaiberat = input.nextDouble();
                hasil = ((nilaitinggi-100)*0.9);
                convertcm = nilaitinggi /100;
                convertpangakat = convertcm*convertcm;
                hasilukur = nilaiberat/convertpangakat;
                if (hasilukur>=18.5 && hasilukur<=25){
                        print = "normal";
                }else if (hasilukur<18.5){
                        print = "kurus";
                }else if (hasilukur>25){
                        print = "gemuk";
                }
                System.out.println("BBI Standar:"+hasil);
                System.out.println("Perempuan BBI : "+print);
                break;
                
        }
        System.out.println("ingin mengukur lagi ?");
        System.out.println("1.ya");
        System.out.println("2.tidak");
        int pilih1 = input.nextInt();
            if (pilih1==1) {
                o = 1;
            }else{
                break;
            }    
        } while (o==1);
        }
   
    }
    

