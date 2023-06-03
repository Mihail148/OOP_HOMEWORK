package OOP_HOMEWORK3;

public class Elem {
    Object task;
    private Elem next;
    private Elem previous;

    public Elem(Object task){
        this.task = task;
    }

    public Object getTask(){
        return task;
    }

    public void setTask(String task){
        this.task = task;
    }

    public Elem getNext(){
        return next;
    }

    void setNext(Elem elem){
        next = elem;
    }

    void setPrevious(Elem elem){
        previous = elem;
    }

    public Elem getPrevious(){
        return previous;
    }
}
