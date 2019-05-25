package java8.predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateSample {
	
	
	public static void main(String[] args) {
//		Predicate<Integer>predFindInteger  =  i ->(i>10);		
//        System.out.println("Number:"+predFindInteger.test(30));
//      
	   List<Employee>findEmp = new ArrayList<>();
	   
	   findEmp.add(new Employee(1,"A"));
       
        findEmp.forEach(s ->System.out.println(s.getName()));
        
        //Predicate<Employee>preEmp = (emp ->emp.getName().startsWith("s"));
        
       /* List<Employee> collectEmp = findEmp.stream().filter(emp ->emp.getName().startsWith("A")).collect(Collectors.toList());
      
        collectEmp.forEach(System.out::println);
        
        Optional<List<Employee>>op  = Optional.ofNullable(collectEmp);
        if(op.isPresent()) {
        	System.out.println(op.orElse(new ArrayList<Employee>()));
        }*/
        
        
        
	}
	

}
