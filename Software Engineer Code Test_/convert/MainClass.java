import javax.swing.JOptionPane; 
public class MainClass { 
public static void main(String[] args) { 
Konversi konversiAngka = new Konversi(); 
JOptionPane dialog = new JOptionPane(); 
String input = dialog.showInputDialog("Angka Masukan"); 
int satuan = Integer.parseInt(input); 
dialog.showMessageDialog(dialog,input+" = "+ konversiAngka.angka(satuan)); 
} 
}

