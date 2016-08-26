package com.smartsearch.jpa;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.smartsearch.dao.hibernate.data.SearchDao;
import com.smartsearch.dao.hibernate.repositories.SearchRepository;

import junit.framework.TestCase;

public class SearchServiceTest extends TestCase {
	public static void main(String args[]){
		
		/*ApplicationContext ctx = new ClassPathXmlApplicationContext("search-servlet.xml");
		
		SearchRepository search = ctx.getBean("mySearchServcice", SearchRepository.class);
		List<SearchDao> list = search.findAll();
		
		for(SearchDao dao : list){
			
			System.out.println(dao.getTagName());
		}*/
		
		//URL sqlScriptUrl = SearchServiceTest.class
        //        .getClassLoader().getResource("SearchConfig.xml");
		SearchServiceTest test = new SearchServiceTest();
		File folder = test.getFileFromURL();
		folder = folder.getParentFile();
		folder = folder.getParentFile();
		File[] listOfFiles = folder.listFiles();
		for(File f : listOfFiles){
			if(f.isDirectory()){
				File[] subFiles = f.listFiles();
				for(File sf : subFiles){
					System.out.println(sf.getAbsolutePath());
				}
			}
			else {
				System.out.println(f.getAbsolutePath());
			}
		}
		
		URL sqlScriptUrl = SearchServiceTest.class
		                .getClassLoader().getResource("../search-servlet.xml");
		System.out.println(sqlScriptUrl.getFile());
	}
	
	public void testMaven() {
		assertTrue(true);
	}
	
	private File getFileFromURL() {
	    URL url = this.getClass().getClassLoader().getResource("SearchConfig.xml");
	    File file = null;
	    try {
	        file = new File(url.toURI());
	    } catch (URISyntaxException e) {
	        file = new File(url.getPath());
	    } finally {
	        return file;
	    }
	}
}
