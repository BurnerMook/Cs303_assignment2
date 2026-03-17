import java.util.ArrayList;
import java.util.EmptyStackException;

public class BigStack{
    private ArrayList<Integer> stackStore;
    
    public BigStack() {
        this.stackStore = new ArrayList<>();
    }
    //methods

    //The top is considered the end of the ArrayList.
    
    public void push(int value) {
        stackStore.add(value);
    }

    //throws EmptyStackException if the stack is empty.

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stackStore.remove(stackStore.size() - 1);
    }

    //throws EmptyStackException if the stack is empty.

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stackStore.get(stackStore.size() - 1);
    }

    public boolean isEmpty() {
        return stackStore.isEmpty();
    }

    public int size() {
        return stackStore.size();
    }

    //Returns 0.0 if the stack is empty.
     
    public double average() {
        if (isEmpty()) {
            return 0.0;
        }
        double sum = 0;
        for (int value : stackStore) {
            sum += value;
        }
        return sum / stackStore.size();
    }


}


