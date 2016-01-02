/**
 * 
 */
package hu.infokristaly.homework.taglibs.front;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class UserData implements Serializable {

   private static final long serialVersionUID = 1L;

   private String name;
   private String password;
   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
   public String getPassword() {
      return password;
   }
   public void setPassword(String password) {
      this.password = password;
   }    
   public String login(){
      return "result";
   }    
}