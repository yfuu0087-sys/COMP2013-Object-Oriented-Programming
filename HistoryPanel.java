import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class HistoryPanel extends JPanel{//history panel
	private Library l;
	public HistoryPanel(Library l) {
		this.l=l;
	}
    private int historyMax(ArrayList<Integer> AL){//use to get max num
        if(AL.size()==0) return  0;
        int max=AL.get(0);
        for (int i = 1; i < AL.size(); i++)
            max=Math.max(max,AL.get(i));
        return max;
    }
    private int  historyMin(ArrayList<Integer> AL2){//min num
        if(AL2.size()==0) return  0;
        int min=AL2.get(0);
        for (int i = 1; i < AL2.size(); i++)
            min=Math.min(min,AL2.get(i));
        return min;
    }
    private int historyRange(ArrayList<Integer> AL3){
        if(historyMax(AL3)-historyMin(AL3)>10)
            return historyMax(AL3)-historyMin(AL3);
        else
            return 10;
    }
    protected void paintComponent(Graphics g) {//use to piant the graph
        super.paintComponent(g);
        ArrayList<Integer> history=l.getHistory();
        int min = historyMin(history);
        int range = historyRange(history);
        int maxX = getWidth() - 1;
        int maxY = getHeight() - 1;
        int zero = maxY + min * maxY / range;
        g.setColor(Color.blue);
        g.drawLine(0,zero,maxX,zero);
        int t1=0,t2=0;
        for (int i = 0; i < history.size(); i++) {
            int v=history.get(i);
            int x=10*i;
            int y=zero - v * maxY / range;
            g.setColor(Color.red);
            if(history.size()==1)
                g.drawRect(0,zero,x, y);
            if(i==0) 
                g.drawLine(0, zero, x, y);
            else
                g.drawLine(t1, t2, x, y);
            t1=x;t2=y;
        }
    }
}
