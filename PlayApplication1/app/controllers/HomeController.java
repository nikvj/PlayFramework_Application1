package controllers;

import java.util.Arrays;
import java.util.Set;

import org.springframework.ui.Model;

import models.employee;
import play.mvc.*;
import views.html.*;

public class HomeController extends Controller {

    public Result index() {
        return ok(views.html.index.render());
    }
    
    public Result employees() {
    	
    		Set<employee> Employee = employee.allEmployees();
    		 return ok(employees.render(Employee));
    	}
       

}

