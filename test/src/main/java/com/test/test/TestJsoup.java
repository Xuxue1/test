package com.test.test;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class TestJsoup {
	
	public static void main(String[] args){
		String htmlpart = ""
		        + "<div class=\"a b\">1</div>"
		        + "<div class=\"a b\">2</div>"
		        + "<div class=\"a b\">3</div>"
		        + "<div class=\"a b\">1</div>";
		Document doc = Jsoup.parse(htmlpart);

		Elements elsA = doc.select(".a");
		Elements elsAB_1 = elsA.select(".b");
		Elements elsAB_2 = doc.select(".a.b");

		System.out.println("elsAB_1:\n"+elsAB_1);
		
		System.out.println("****************************");
		
		System.out.println("elsAB_2:\n"+elsAB_2);
	}
	
}
