
public class GUI {
	public static void main(String[] args){//create to show information 
		 javax.swing.SwingUtilities.invokeLater(new Runnable() {
			 public void run() {
				 Library library = new Library("UIC Library");
	            //try {
	            	// Borrower borrower=new Borrower("br",10);
	            	 //library.addUser(borrower);
	            	 //Lender lender=new Lender("ld",2);
	            	 //library.addUser(lender);
	           //  } catch (NotALenderException e) {
	            //	 e.printStackTrace();
	            // }
				Controller controller = new Controller(library);
				ControllerGetBook cg=new ControllerGetBook(library);
				ControllerMoreBook cm=new ControllerMoreBook(library);
				ControllerCreate cc=new ControllerCreate(library);
				ControllerHistory ch=new ControllerHistory(library);
				
	            ViewSimple viewSimple = new ViewSimple(library, controller);
	            ViewGetBook viewGetBook=new ViewGetBook(library,cg);
	            ViewMoreBook viewMoreBook=new ViewMoreBook(library,cm);
	            ViewCreate viewCreate=new ViewCreate(library,cc);
	            ViewHistory viewHistory=new ViewHistory(library,ch);
			 }
		 });
	}
}
