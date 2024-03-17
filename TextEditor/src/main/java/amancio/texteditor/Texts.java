package amancio.texteditor;

public class Texts extends TextEdits{
    
    public Texts(String initialtext) {
     super(initialtext);   
    }
    
     public void append(String newText) {
        text += newText;
    }
    
    public void print(){
        System.out.println(getText());
    }
    
    
}
