package coding1;
     import java.time.LocalDateTime;
     import java.time.format.DateTimeFormatter;

public class DateTimeFormat {

	public static void main(String[] args) {
		LocalDateTime myObj = LocalDateTime.now();
		System.out.println("Before formatting: " +myObj);
		
		DateTimeFormatter myformatObj = DateTimeFormatter .ofPattern("dd-MM-yyyy HH:mm:ss");
		
		String formattedDate = myObj.format(myformatObj);
		System.out.println("After formatting: " +formattedDate);
		
	}

}
