package example5;

import java.util.List;

public class PatientRecord<T>{

		private T record;
		private Patient patient;
		
		List<Patient> Patients;
		List<PatientRecord<Medication>> medications;
		List<PatientRecord<Lab>> labs;
		List<PatientRecord<Diagnosis>> diags;
		int k;
		public T getRecord() {
			return record;
		}
		
		public Patient getPatient() {
			return patient;
		}
		
		public List<Patient> getPatients() {
			return Patients;
		}
		
		public List<PatientRecord<Medication>> getMedications() {
			return medications;
		}
		
		public List<PatientRecord<Lab>> getLabs() {
			return labs;
		}
		
		public List<PatientRecord<Diagnosis>> getDiags() {
			return diags;
		}
	
}