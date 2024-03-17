package amancio.texteditor;

public class TextEdits extends TextEditor{
    
    String text;
    
    public TextEdits(String initialText) {
        this.text = initialText;
    }

    public String getText() {
        return text;
    }

    public void setText(String Text) {
        this.text = Text;
    }

    public void append(String newText) {
        text += newText;
    }

    public void delete(int n){
        if (n >= text.length()){
            text = "";
        } else {
            text = text.substring(0, text.length() - 1);
        
        }
    }
}


