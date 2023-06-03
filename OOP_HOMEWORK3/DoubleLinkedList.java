package OOP_HOMEWORK3;

import java.util.Iterator;

public class DoubleLinkedList implements Iterable {
    
    private Elem head;
    private Elem tail;
    private int count = 0;

    @Override
    public Iterator iterator(){
        return new Iterator<Object>() {
            Elem elem0 = new Elem("0");
            {
                elem0.setNext(head);
            }
            Elem currentElem = elem0;

            @Override
            public boolean hasNext(){
                return currentElem.getNext() != null;
            }

            @Override
            public Object next(){
                currentElem = currentElem.getNext();
                return currentElem.getTask();
            }
        };
    }

    public int size(){
        return count;
    }

    private Elem getElem(int index){
        if(index >= count){
            throw new IndexOutOfBoundsException();
        }

        Elem result = head;
        for(int i = 1; i <= index; i++){
            result = result.getNext();
        }
        return result;
    }

    public Object get(int index){

        Elem elem = getElem(index);

        return elem.getTask();
    }

    public void remove(int index){

        Elem currentElem = getElem(index);
        Elem nextElem = currentElem.getNext();
        Elem previousElem = currentElem.getPrevious();

        if(index == 0){
            head = nextElem;
            if(tail == currentElem){
                tail = null;
            }
        }

        if(index == count - 1){
            tail = previousElem;
            if(head == currentElem){
                head = null;
            }
        }

        count--;

        if(nextElem != null){
            nextElem.setPrevious(previousElem);
        }

        if(previousElem != null){
            previousElem.setNext(nextElem);
        }
    }

    public void add(int index, Object task){
        if(count == index){
            add(task);
            return;
        }
        count++;

        Elem currentElem = new Elem(task);

        if(index == 0){
            head = currentElem;
        }

        Elem nextElem = getElem(index);
        Elem previousElem = nextElem.getPrevious();

        currentElem.setNext(nextElem);
        currentElem.setPrevious(previousElem);

        if(previousElem != null){
            previousElem.setNext(currentElem);
        }
    }

    public void add(Object task){
        count++;
        Elem elem = new Elem(task);
        if(head == null){
            head = elem;
            tail = elem;
            return;
        }else if(tail == null){
            tail = elem;
            return;
        }

        tail.setNext(elem);
        elem.setPrevious(tail);
        tail = elem;
    }
}
