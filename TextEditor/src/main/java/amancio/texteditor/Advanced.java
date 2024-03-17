package amancio.texteditor;

import java.util.Stack;

public class Advanced extends TextEdits {
    private Stack<String> history;

    public Advanced(String initialText) {
        super(initialText);
        history = new Stack<>();
        history.push(initialText);
    }

    @Override
    public void append(String newText) {
        history.push(getText());
        history.push(text);
        super.append(newText);
    }

    public void print(){
        System.out.println(getText());
    }
    
    @Override
    public void delete(int n) {
        history.push(getText());
        history.push(text);
        super.delete(n);
    }

    public void undo() {
        if (!history.isEmpty()) {
            text = history.pop();
            if (!history.isEmpty()){
                setText(history.peek());
        }
        }
    }
    
}
