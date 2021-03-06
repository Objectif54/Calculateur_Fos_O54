package com.obj54.Controller;

import org.hibernate.criterion.IdentifierEqExpression;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.obj54.Model.Employee;
import com.obj54.Model.Externe;
import com.obj54.Repository.EmployeeRepository;
import com.obj54.Repository.ExterneRepository;

@Controller // This means that this class is a Controller
@RequestMapping(path="/demo") // This means URL's start with /demo (after Application path)
public class MainController {
  @Autowired // This means to get the bean called userRepository
         // Which is auto-generated by Spring, we will use it to handle the data
  private EmployeeRepository employeeRepository;
  @Autowired
  private ExterneRepository  externeRepository;
  @RequestMapping(value = "/addEmployee", method = RequestMethod.GET)
  public @ResponseBody String addNewUser (@RequestParam String last_name
      , @RequestParam String name, @RequestParam String password, @RequestParam String email, @RequestParam Integer acces_user) {
    // @ResponseBody means the returned String is the response, not a view name
    // @RequestParam means it is a parameter from the GET or POST request

    Employee e = new Employee();
    e.setLastName(last_name);
    e.setName(name);
    e.setPassword(password);
    e.setMail(email);
    e.setAccesUser(acces_user);
    employeeRepository.save(e);
    return "Saved";
  }


  @GetMapping(path="/allEmployee")
  public @ResponseBody Iterable<Employee> getAllEmployee() {
    // This returns a JSON or XML with the Employee
    return employeeRepository.findAll();
  }

  @GetMapping(path="/allExterne")
  public @ResponseBody Iterable<Externe> getAllExterne() {
    // This returns a JSON or XML with the Externe
    return externeRepository.findAll();
  }

}
