package object;

public class Task {
    public String name;
    public Task next;

    public Task(String name){
        this.name = name;
        this.next = null;
    }
}

class TodoList{
    public Task head;

    public TodoList(){
        this.head = null;
    }

    public void printList(){
        System.out.println("Printing the Todo List...");

        Task currentNode = this.head;
        while(currentNode != null){
            System.out.println(currentNode.name);
            currentNode = currentNode.next;
        }
    }
}

class Main{
    public static void main(String[] args){
        Task task1 = new Task("Fix the alarm");
        Task task2 = new Task("Go to the dentist to pick up my grandmother");
        Task task3 = new Task("Call a handyman to fix an appliance");
        Task task4 = new Task("Go to the park for a jog");

        task1.next = task2;
        task2.next = task3;
        task3.next = task4;

        System.out.println(task1.name);
        System.out.println(task4.name);
    }
}
