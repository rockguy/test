package controllers;

import play.*;
import play.mvc.*;
import play.data.*;
import play.data.Form.*;
import models.*;
import views.html.*;

public class Application extends Controller {

   static Form<Phone> phoneForm = Form.form(Phone.class);
    
    public Result index() {
        return ok(phoneBook.render(Phone.find.all(),phoneForm));
    }
    
    public Result phoneBook() {
        return TODO;
    }
    
    public Result newPhone() {
        Form<Phone> phoneList = phoneForm.bindFromRequest();
        if(phoneList.hasErrors()){
            return badRequest(views.html.phoneBook.render(Phone.find.all(),phoneList));
        }
        else
        {Phone.create(phoneList.get());
            return redirect("/");
        }
    
    }
    
    public Result deletePhone(String id){
        return TODO;
    }

}
