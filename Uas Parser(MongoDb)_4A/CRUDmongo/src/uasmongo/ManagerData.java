/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uasmongo;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import com.mongodb.MongoException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author arif
 */
public class ManagerData {
     private static String dbName;
    private static DB db;
    
    public ManagerData(String dbname) {
        dbName = dbname;
        try {
            Mongo mongo = new Mongo();
            db = mongo.getDB(dbName);
        }
        catch (MongoException ex) {
            JOptionPane.showMessageDialog(null,"Koneksi Gagal Bossss!!","CAUTION",JOptionPane.WARNING_MESSAGE);
        }
   }
    public void add(DBObject object, String CollName) {
        db.getCollection(CollName).insert(object);
    }
    
    public void remove(DBObject kriteria, String CollName) {
        db.getCollection(CollName).remove(kriteria);
    }

    public void update(DBObject kriteria, DBObject newObject, String CollName) {
        db.getCollection(CollName).update(kriteria, newObject);
    }
    public ArrayList getCollectionData(String CollName) {
        ArrayList list = new ArrayList();
        DBCursor cursor = db.getCollection(CollName).find();
        while (cursor.hasNext()) {
            DBObject object = cursor.next();
            list.add(object);
        }
        return list;
    }

     public String getDBName() {
        return dbName;
    }

    DBCollection getCollection(String alamat) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
