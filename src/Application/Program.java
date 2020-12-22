package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment c1 = new Comment("Have nice a trip!!!"); //No estilo hardcode sem fontes externas
		Comment c2 = new Comment("Wow that's awesome");  
		
		
		Post p1 = new Post(sdf.parse("25/12/2012 11:30:45"),"Travel a new Zeland", "HAVE NICE TRIP!!!",12);
		
		p1.addComment(c1);
		p1.addComment(c2);
		
		
		System.out.println(p1);

	}

}
