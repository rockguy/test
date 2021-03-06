package models;

import java.util.*;
import play.db.ebean.*;
import play.data.validation.Constraints.*;
import javax.persistence.*;

@Entity
public class Phone extends Model {
    @Id
  public long id;
  @Required
  public String name;
  @Required
  public String mainNumber;
  
  public static Finder find = new Finder(Long.class, Phone.class);
  
  /*
  public static List<Phone> all() {
    return Phone.find();
  }*/
   
  
  public static void create(Phone phone) {
      phone.save();
  }
   
   /*public static void Delete(String id) {
        find.ref(id);
       
   }*/
  
  public static void delete(long id) {
      Phone phone = (Phone) Phone.find.ref(id);
      phone.delete();
  }
    
}