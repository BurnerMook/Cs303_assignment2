# Cs303_assignment2
The files don't have mains so you can put your own. Other than that they don't have any inputs and can be run as normal java files


    SingleLinkedList
The SingleLink returns null for empty lists



    BigStack

Test program
    public static void main(String[] args) {
        // 1. Instantiate a stack object
        BigStack myStack = new BigStack();

        // 2. Call isEmpty() and display result
        System.out.println("Is stack empty? " + myStack.isEmpty());

        // 3. Call push(...) several times
        System.out.println("Pushing: 10, 20, 30, 40");
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);

        // 4. Call pop() once and display result
        System.out.println("Popped value: " + myStack.pop());

        // 5. Call peek() and display result
        System.out.println("Current top (peek): " + myStack.peek());

        // 6. Call average() and display result
        System.out.println("Average of stack elements: " + myStack.average());
        
        System.out.println("Final stack size: " + myStack.size());
    }
Testing data
PS C:\Users\willa\Cs303_assignment2> java BigStack
Is stack empty? true
Pushing: 10, 20, 30, 40
Popped value: 40
Current top (peek): 30
Average of stack elements: 20.0
Final stack size: 3