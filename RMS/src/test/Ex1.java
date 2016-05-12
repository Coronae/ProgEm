package test;

import javax.microedition.rms.RecordStore;

public class Ex1 {

	public static RecordStore rs;

	public static void start() {
		rs = null;
		try {
			rs = RecordStore.openRecordStore("monFichier", true);
			System.out.println("Record store ouvert.");
		} catch (Exception e) {
			System.out.println("Erreur Ouverture du Record Store.");
		} finally {
			try {
				rs.closeRecordStore();
				System.out.println("Record Store Ferm�");
			} catch (Exception e) {
				System.out.println("Erreur Fermetuer du Record Store");
			}
		}
	}
}
