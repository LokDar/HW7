package HW7;

public class Main {
    public static void main(String[] args) {

Director Sergey = new Director(100.00,"Sergey",10);
Manager Anna = new Manager(100.00,"Anna",10);
Manager Vera = new Manager(100.00,"Anna",20);
Manager Sasha = new Manager(100.00,"Anna",5);
Manager Pasha = new Manager(100.00,"Anna",30);
Worker Anna2 = new Worker(90.00,"anna Anatol'ievna");

Worker[] all = {Sergey, Anna,Anna2};
Manager[] allManagers = {Anna,Vera,Sasha,Pasha};
     //  System.out.println(Sergey.getSalary());
     //  System.out.println(Anna.getSalary());


       // System.out.println(Utils.getWorkerByName(all, "Anna"));
       // System.out.println(Utils.getAllWorkers(all,"Anna"));

       // System.out.println(Utils.findByName(all,"Anna").getName());

       // System.out.println(Utils.getByPhrase(all,"AN"));

        System.out.println(Utils.getTotalBudget(all));
        System.out.println(Utils.getMinSalary(all));
        System.out.println(Utils.getMaxSalary(all));

        System.out.println(Utils.getMinSubordinates(allManagers));

        System.out.println(Utils.getMaxSubordinates(allManagers).getNumberOfSubordinates());

        System.out.println(Utils.getMaxSalary(allManagers));
        System.out.println(Utils.getMinSalary(allManagers));






    }
}
