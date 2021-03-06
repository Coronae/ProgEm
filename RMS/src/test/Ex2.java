package test;

import javax.microedition.rms.RecordStore;

public class Ex2 {
	private static RecordStore rs = null;
	static final String REC_STORE = "ReadWriteRMS";

	// Ouvre un nouveau Record Store
	public static void openRecord() {
		try {
			rs = RecordStore.openRecordStore(REC_STORE, true);
		} catch (Exception e) {
			System.out.println("Erreur Ouverture du RS");
		}
	}

	// Ferme les Record Store
	public static void closeRecord() {
		try {
			rs.closeRecordStore();
		} catch (Exception e) {
			System.out.println("Erreur Fermeture du RS");
		}
	}

	// D�truit le records
	public static void deleteRecord() {
		if (RecordStore.listRecordStores() != null) {
			try {
				RecordStore.deleteRecordStore(REC_STORE);
			} catch (Exception e) {
				System.out.println("Erreur Delete du RS");
			}
		}
	}

	// Ajoute un enregistrement dans le rs
	public static void writeRecord(String str) {
		byte[] rec = str.getBytes();
		try {
			rs.addRecord(rec, 0, rec.length);
		} catch (Exception e) {
			System.out.println("Erreur d'�criture du RS");
		}
	}

	public static String getRecord(int i){
		try {
			byte[] recData = new byte[5];
			int len;
			if (rs.getRecord(i) != null) {
				if (rs.getRecordSize(i) > recData.length)
					recData = new byte[rs.getRecordSize(i)];

				len = rs.getRecord(i, recData, 0);
				return new String(recData, 0, len);
			}

		} catch (Exception e) {

		}
		return "Fail";
	}
		
		
	//Lecture d'un seul RS i
	public static void readOneRecord(int i) {
		try {
			byte[] recData = new byte[5];
			int len;
			if (rs.getRecord(i) != null) {
				if (rs.getRecordSize(i) > recData.length)
					recData = new byte[rs.getRecordSize(i)];

				len = rs.getRecord(i, recData, 0);
				System.out.println("Record Selectionn� : " + i + " -> " + new String(recData, 0, len));
			}

		} catch (Exception e) {

		}
	}

	// Lecture de rs
	public static void readRecords() {
		try {
			byte[] recData = new byte[5];
			int len;

			for (int i = 1; i <= rs.getNumRecords(); i++) {
				if (rs.getRecordSize(i) > recData.length) {
					recData = new byte[rs.getRecordSize(i)];
				}
				len = rs.getRecord(i, recData, 0);
				System.out.println("Record " + i + " -> " + new String(recData, 0, len));
			}
		} catch (Exception e) {
		}
	}
}