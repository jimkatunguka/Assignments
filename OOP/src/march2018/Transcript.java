package march2018;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Transcript {
private List<TranscriptEntry>transcriptEntries;

Transcript(){
	transcriptEntries = new ArrayList<>();
}

	public List<TranscriptEntry> getTranscriptEntries() {
	return transcriptEntries;
	}

	public void addTranscriptEntry(LocalDate courseDate, String grade, Course course) {
		transcriptEntries.add(new TranscriptEntry(courseDate, grade, course));	
	}

}
