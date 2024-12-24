package memento;

/**
 * @author ：ggstudy11
 * @version :
 * @date ：Created in 12/24/2024 4:22 PM
 * @description：
 * @modified By：
 */
public class Originator {

    private String content;
    public void setContent(String content) {
        this.content = content;
    }
    public String getContent() {
        return content;
    }
    public Memento getMemento() {
        return new Memento(content);
    }
    public void restore(Object obj){
        Memento memento = (Memento) obj;
        content = memento.content;
        System.out.println(memento.content);
    }
    private class Memento {
        private String content;
        public Memento(String content) {
            this.content = content;
        }
    }
}
