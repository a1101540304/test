package util;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class XmlParser {
	public static HashMap<String,String> parser(String xmlPath){
		HashMap<String,String> hm = new HashMap<String,String>();
		boolean flag = false;
		String base = Thread.currentThread().getContextClassLoader().getResource("").getPath();
		xmlPath = base + xmlPath;
		try {
			SAXParserFactory spf = SAXParserFactory.newInstance();
			SAXParser sp = spf.newSAXParser();
			File f = new File(xmlPath);
			XmlHandler xh = new XmlHandler();
			sp.parse(f, xh);
			hm = xh.getHashMap();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {	
				e.printStackTrace();
		} finally{
			
		}
		
		
		return hm;
	}
/*	public static void main(String[] args) {
		String xmlPath = "bin//database.conf.xml";
		if(XmlParser.parser(xmlPath)){
			System.out.println("解析成功");
		}else
			System.out.println("解析不成功");
	}*/
}
