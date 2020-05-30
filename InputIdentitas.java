import javax.swing.JOptionPane;

public class InputIdentitas
{
	public static void main (String args[])
	{

		boolean ulang = true;
		//perulangan
		do{
			String gabungan = "";
			String nama = JOptionPane.showInputDialog(null,"Nama","INPUT DIALOG",JOptionPane.INFORMATION_MESSAGE);
			String alamat = JOptionPane.showInputDialog(null,"Alamat","INPUT DIALOG",JOptionPane.INFORMATION_MESSAGE);
			String tgl = JOptionPane.showInputDialog(null,"TGL_LAHIR","INPUT DIALOG",JOptionPane.INFORMATION_MESSAGE);
			String bln = JOptionPane.showInputDialog(null,"BULAN_LAHIR","INPUT DIALOG",JOptionPane.INFORMATION_MESSAGE);
			String thn = JOptionPane.showInputDialog(null,"TAHUN_LAHIR","INPUT DIALOG",JOptionPane.INFORMATION_MESSAGE);
			//gabungan isi
			gabungan += "Nama : "+nama+"\nAlamat : "+alamat+"\nTANGGAL LAHIR : "+tgl+"-"+bln+"-"+thn;
			//outputnya
			JOptionPane.showMessageDialog(null,"IDENTITAS :\n"+gabungan,"INPUT DIALOG",JOptionPane.INFORMATION_MESSAGE);

			int ok = JOptionPane.showConfirmDialog(null,"Apakah Anda mau mengulang?","Ulang?",JOptionPane.YES_NO_OPTION);
			if (ok == JOptionPane.NO_OPTION){
				System.exit(0);
			}

		}while(ulang);

	}
}