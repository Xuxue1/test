package com.test.test;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class TestJsoup {
	
	public static void main(String[] args) throws IOException{
		Document doc=Jsoup.connect("http://staticlive.douyutv.com/common/share/play.swf?room_id=19002").get();
	
		System.out.println(doc);
	}
	
}
