package application;

import entities.Comment;
import entities.Post;

import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Have a nice trip");
        Comment c2 = new Comment("Wow that's awesome");
        Post p1 = new Post(sdf.parse("21/06/2020 13:55:11"),
                "Traveling to New Zeland",
                "I'm Going to visit this wonderful country",
                12);
        p1.addComment(c1);
        p1.addComment(c2);

        Comment c3 = new Comment("Good Night");
        Comment c4 = new Comment("May the force be with you");
        Post p2 = new Post(sdf.parse("26/07/2020 23:55:11"),
                "Good Night guys",
                "See U 2morrow",
                5);
        p2.addComment(c3);
        p2.addComment(c4);

        System.out.println(p1);
        System.out.println(p2);


    }
}
