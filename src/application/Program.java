package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:s");
				
		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("Wow that's awesome!");
		Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"),
				"Traveling to New Zealand",
				"I'm going to visit this wonderful country!",
				12);
		p1.addComment(c1);
		p1.addComment(c2);
		System.out.println(p1);
		
		Comment c3 = new Comment("Good night");
		Comment c4 = new Comment("May the Force be with you");
		Comment c5 = new Comment("Add me on Facebook, Tarley Rodrigues");
		Post p2 = new Post(sdf.parse("28/07/2018 23:14:19"),
				"Traveling to New Zealand",
				"I'm going to visit this wonderful country!",
				12);
		p2.addComment(c3);
		p2.addComment(c4);
		p2.addComment(c5);
		System.out.println(p2);
		
	}
}
