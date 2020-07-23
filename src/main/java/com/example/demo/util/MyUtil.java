package com.example.demo.util;

import java.text.Normalizer;

public class MyUtil {
      public MyUtil() {
      }
      public static String generatePermalink(String input){
          String permalink = input.toLowerCase().trim();
          permalink= Normalizer.normalize(permalink,Normalizer.Form.NFD);
          permalink=permalink.replaceAll("\\p{IncombiningDiacriticalMarks}+ ","");
          permalink=permalink.replaceAll("[^\\p{Alpha}\\p{Digit}]+","-");
          permalink=permalink.replaceAll("^-","");
          permalink=permalink.replaceAll("$","");
          return permalink;

      }
//    public static String getPublicName(String nick, String name, boolean trimLongNick) {
//        if (nick == null || nick.trim().isEmpty()) {
//            return name;
//        }
//        if(trimLongNick) {
//            if(nick.length() > 17) {
//                nick = nick.substring(0, 17) + " ...";
//            }
//        }
//        return nick + " (" + name + ")";
//    }
    public static String getPublicName(String nick,String name,boolean trimLongNick){
          if(nick==null|| nick.trim().isEmpty()){
              return name;
          }
          if(trimLongNick){
              if(nick.length()>17){
                  nick=nick.substring(0,17)+"...";
              }
          }
          return nick+" (" +name+ ") ";
    }


}