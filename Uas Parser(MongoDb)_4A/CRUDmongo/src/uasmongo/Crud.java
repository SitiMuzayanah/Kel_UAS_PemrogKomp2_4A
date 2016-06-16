/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uasmongo;

import com.mongodb.BasicDBObject;
import it.sauronsoftware.feed4j.FeedIOException;
import it.sauronsoftware.feed4j.FeedParser;
import it.sauronsoftware.feed4j.FeedXMLParseException;
import it.sauronsoftware.feed4j.UnsupportedFeedException;
import it.sauronsoftware.feed4j.bean.Feed;
import it.sauronsoftware.feed4j.bean.FeedHeader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author arif
 */
public class  Crud {
    public static String url;
    public ManagerData mongo = new ManagerData("UAS"); // atau new Mongo("host:port");
    BasicDBObject objek = new BasicDBObject();
    
    public void disimpan(String value){
            if("".equals(value)){
                JOptionPane.showMessageDialog(null,"Inputan tidak boleh kosong","CAUTION!",JOptionPane.WARNING_MESSAGE);
            }
            else{
                objek.put("Alamat", value);
                objek.put("TotalNews", "0");
                mongo.add(objek, "parser"); //add tabel

                JOptionPane.showMessageDialog(null,"Data Disimpan.","SUCCESS",JOptionPane.INFORMATION_MESSAGE);
            }
    }
    
    public void dihapus(String value){
        if("".equals(value)){
            JOptionPane.showMessageDialog(null,"Inputan tidak boleh kosong","CAUTION!",JOptionPane.WARNING_MESSAGE);
        }
        else{
            objek.put("Alamat", value);// remove jika ada
            mongo.remove(objek, "parser");
            objek.put("TotalNews", "0");// TODO add your handling code here:
            JOptionPane.showMessageDialog(null,"Data Dihapus.","SUCCESS",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void setUrl(String urldb){
        url = urldb;
    }
    
    //public void update(String value){
    public void update(String value, String url){
        objek.put("Alamat", url);
        // object baru
        System.out.println("update"+url);
        if ("".equals(value)){
            JOptionPane.showMessageDialog(null,"Tidak boleh dikosongkan","CAUTION!",JOptionPane.WARNING_MESSAGE);
        }
        else{
            BasicDBObject baru = new BasicDBObject();
            baru.put("Alamat", value);
            baru.put("TotalNews", "0");
            mongo.update(objek, baru, "parser");
            JOptionPane.showMessageDialog(null,"Data Berhasil Diubah.","SUCCESS",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    
    
    public void fetch(String value) throws MalformedURLException, FeedIOException, FeedXMLParseException, UnsupportedFeedException{
        URL url = new URL(value);
		
	Feed feed = FeedParser.parse(url);
	
	System.out.println("** HEADER **");
	FeedHeader header = feed.getHeader();
	System.out.println("\nJudul: " + header.getTitle());
	System.out.println("\nAlamat URL: " + header.getLink());
	System.out.println("\nDeskripsi: " + header.getDescription());
	System.out.println("\nBahasa: " + header.getLanguage());
	System.out.println("\nTgl.Publikasi: " + header.getPubDate());
	
	System.out.println("\n** ITEMS **");
	int items = feed.getItemCount();
        System.out.println(items);// TODO add your handling code here:
        
        
        objek.put("Alamat", value);
        BasicDBObject baru = new BasicDBObject();
        baru.put("Alamat", value);
        baru.put("TotalNews", items);
        mongo.update(objek, baru, "parser");//tabel();// TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Data Total News Berhasil Disimpan","SUCCESS",JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void fetchAll() throws FeedIOException, FeedXMLParseException, UnsupportedFeedException, MalformedURLException{
        ArrayList<BasicDBObject> totalList = mongo.getCollectionData("parser");
        for(BasicDBObject parser : totalList){
            URL url = new URL(parser.getString("Alamat"));
            
            Feed feed = FeedParser.parse(url);
            
            System.out.println("** HEADER **");
            FeedHeader header = feed.getHeader();
            System.out.println("\nJudul: " + header.getTitle());
            System.out.println("\nAlamat URL: " + header.getLink());
            System.out.println("\nDeskripsi: " + header.getDescription());
            System.out.println("\nBahasa: " + header.getLanguage());
            System.out.println("\nTgl.Publikasi: " + header.getPubDate());
            
            System.out.println("\n** ITEMS **");
            int items = feed.getItemCount();
            System.out.println(items);// TODO add your handling code here:
            
            BasicDBObject objek = new BasicDBObject();
            objek.put("Alamat", parser.get("Alamat"));
            BasicDBObject baru = new BasicDBObject();
            baru.put("Alamat", parser.get("Alamat"));
            baru.put("TotalNews", items);
            mongo.update(objek, baru, "parser");
        }
        JOptionPane.showMessageDialog(null,"Semua Data Total News Berhasil Disimpan.","SUCCESS",JOptionPane.INFORMATION_MESSAGE);
    }
    
    
    
}
