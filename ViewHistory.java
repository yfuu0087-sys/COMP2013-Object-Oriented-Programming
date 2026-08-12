import java.awt.*;
public class ViewHistory extends View<ControllerHistory>{
   public ViewHistory(Library m, ControllerHistory c) throws HeadlessException {
       super(m, c);
       HistoryPanel hPanel=new HistoryPanel(m);
       hPanel.setSize(this.getWidth(),this.getHeight());
       this.add(hPanel);
       this.setTitle("View History");
       this.update();
    }
   public void update() {
	   repaint();
   }
}
