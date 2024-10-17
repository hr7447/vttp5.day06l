package day06;

import java.time.LocalDate;
import java.time.ZoneId;
//import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
// import java.util.concurrent.ExecutorService;
// import java.util.concurrent.Executors;
//import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {
        
        // MyImplementation my1 = new MyImplementation();
        // MyImplementation my2 = new MyImplementation();
        // MyImplementation my3 = new MyImplementation();
        // MyImplementation my4 = new MyImplementation();
        // MyImplementation my5 = new MyImplementation();

        //Executing the tasks using a single thread
        // ExecutorService es = Executors.newSingleThreadExecutor();
        // es.execute(my1);
        // es.execute(my2);
        // es.shutdown();
        
        //Execute the tasks using fixed thread pool
        // ExecutorService es1 = Executors.newFixedThreadPool(5);
        // es1.execute(my1);
        // es1.execute(my2);
        // es1.execute(my3);
        // es1.execute(my4);
        // es1.execute(my5);
        // es1.shutdown();


        // List<Product> products = new ArrayList<Product>();
        // products.add(new Product(1L, "Apple iPad", "Apple tablet", "computer"));
        // products.add(new Product(2L, "Apple MacBook Pro", "Apple laptop", "computer"));
        // products.add(new Product(3L, "Logitec Mouse", "Mouse", "computer"));
        // products.add(new Product(4L, "32 inch montitor", "Samsung monitor", "computer"));
        // products.add(new Product(5L, "Huawei 5", "Huawei phone", "mobile"));
        // products.add(new Product(6L, "Oppo 7 Pro", "Oppo phone", "mobile"));
        // products.add(new Product(7L, "Galaxy 24", "Samsung phone", "mobile"));
        // products.add(new Product(8L, "iphone 15", "Apple phone", "mobile"));

        //Method to print
        // products.forEach(prod -> {
        //     System.out.println(prod);
        // });

        //Method to print
        //products.forEach(Product::toString);

        //Only retrieve products with category 'mobile'
        //Using stream and lambda functions
        // List<Product> filtereProducts = new ArrayList<>();
        // filtereProducts = products.stream().filter(p -> p.getCategory().equals("mobile")).collect(Collectors.toList());

        //filtereProducts.forEach(Product::print);

        LocalDate ld = LocalDate.of(1990, 1, 12);
        Date currDate = Date.from(ld.atStartOfDay(ZoneId.systemDefault()).toInstant());
        List<Person> persons = new LinkedList<>();
        persons.add(new Person(1L, "Bernard", "Tan", 30000.0, currDate));
        persons.add(new Person(2L, "Chris", "Pang", 20000.0, currDate));
        persons.add(new Person(3L, "Dennis", "Wong", 15000.0, currDate));
        persons.add(new Person(4L, "Thomas", "Lim", 10000.0, currDate));
        persons.add(new Person(5L, "Rick", "Ng", 5000.0, currDate));
        persons.add(new Person(6L, "Darren", "Chua", 35000.0, currDate));
        persons.add(new Person(7L, "May", "Tan", 25000.0, currDate));

        Comparator<Person> compare = Comparator.comparing(p -> p.getFirsName());
        persons.sort(compare.reversed());
        // persons.forEach(p -> {
        //     System.out.println(p.toString());
        // });

        //System.out.println("\n-----------------\n");

        Comparator<Person> compareMultiple = Comparator.comparing(Person::getFirsName).thenComparing(Person::getLastName);
        persons.sort(compareMultiple);
        // persons.forEach(p -> {
        //     System.out.println(p.toString());
        // });

        MyInterface<Integer> addOperation = (a, b) -> {
            return a + b;
        };

        MyInterface<Integer> multiplyOperation = (a, b) -> {
            return a * b;
        };

        System.out.println("add operation: " + addOperation.process(3, 2));
        System.out.println("multiply operation: " + multiplyOperation.process(3, 2));
    }
    
}
