/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uasmongo;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author Bakti
 */
public class LocalSetting {
    private String locale = "en";
    private String LOCALE = "US";
    private Locale currentLocale = new Locale(locale, LOCALE);
    private ResourceBundle messages;
 
    LocalSetting(){
       changeLocale();
    }
 
    LocalSetting(String locale, String LOCALE)
    {
        this.locale = locale;
        this.LOCALE = LOCALE;
        changeLocale();
    }
 
    public void changeLocale(){
        this.currentLocale = new Locale(this.locale, this.LOCALE);
 
        try{
            this.messages = ResourceBundle.getBundle("locales.MessagesBundle", this.currentLocale);
        } catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
 
    public String translate(String text){
        boolean found;
        String translated = text;
        try{
            translated = this.messages.getString(text);
            found = true;
        }
        catch (Exception e){
            found = false;
            e.printStackTrace();
        }
 
        System.out.println("Translated: " + text + " => " + translated);
        return translated;
    }
}
