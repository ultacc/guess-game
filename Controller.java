package application;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;


public class Controller {
	
	@FXML
	
	public Circle myCircle1;
	public Circle myCircle2;
	public Circle myCircle3;
	
	public Circle myCircle4;
	public Circle myCircle5;
	public Circle myCircle6;
	
	public Circle myCircle7;
	public Circle myCircle8;
	public Circle myCircle9;
	
	public Circle myCircle10;
	public Circle myCircle11;
	public Circle myCircle12;
	
	public Circle myCircle13;
	public Circle myCircle14;
	public Circle myCircle15;
	
	public Circle myCircle16;
	public Circle myCircle17;
	public Circle myCircle18;
	
	
	public Circle myCircleA;
	public Circle myCircleB;
	public Circle myCircleC;
	
	public Label lb1;
	public Label lb2;
	
	public Label lb31;
	public Label lb32;
	public Label lb33;
	public Label lb34;
	public Label lb35;
	public Label lb36;
	
	
	
	//static int reply;
	//static String color;//
	//static int rand = 0;//
	
	static int reply1=0;
	static int reply2=0;
	static int reply3=0;
	static String color;
	static int rand = 0;
	static int rand2 = 0;
	static int rand3 = 0;
	
	int btn1=0;
	
	
	int tryamount = 0;
	int fillamount =0;
	
	
	boolean canplay;
	int win = 0;
	
	String response = "first";
	
	

	
	public void play(ActionEvent e) {
		
		//RandomColor1(RandomNum());//
		//RandomColor2(RandomNum2());//
		//RandomColor3(RandomNum3());//
		
		canplay = true;
		
		tryamount=0;
		
		win = 0;
		lb2.setText("Pick a colour");
		lb1.setText("guess the hidden code");
		
		btn1=0;
		
		RandomNum();
		RandomNum2();
		RandomNum3();
		
		lb31.setVisible(true);
		lb32.setVisible(false);
		lb32.setVisible(false);
		lb33.setVisible(false);
		lb34.setVisible(false);
		lb35.setVisible(false);
		lb36.setVisible(false);
		
		
		
		myCircle1.setVisible(true);
		myCircle2.setVisible(true);
		myCircle3.setVisible(true);
		
		
		myCircle4.setVisible(false);
		myCircle5.setVisible(false);
		myCircle6.setVisible(false);
		
		myCircle7.setVisible(false);
		myCircle8.setVisible(false);
		myCircle9.setVisible(false);
		
		myCircle10.setVisible(false);
		myCircle11.setVisible(false);
		myCircle12.setVisible(false);
		
		myCircle13.setVisible(false);
		myCircle14.setVisible(false);
		myCircle15.setVisible(false);
		
		myCircle16.setVisible(false);
		myCircle17.setVisible(false);
		myCircle18.setVisible(false);
		
		myCircle1.setFill(Color.WHITE);
		myCircle2.setFill(Color.WHITE);
		myCircle3.setFill(Color.WHITE);
		
		myCircle4.setFill(Color.WHITE);
		myCircle5.setFill(Color.WHITE);
		myCircle6.setFill(Color.WHITE);
		
		myCircle7.setFill(Color.WHITE);
		myCircle8.setFill(Color.WHITE);
		myCircle9.setFill(Color.WHITE);
		
		myCircle10.setFill(Color.WHITE);
		myCircle11.setFill(Color.WHITE);
		myCircle12.setFill(Color.WHITE);
		
		myCircle13.setFill(Color.WHITE);
		myCircle14.setFill(Color.WHITE);
		myCircle15.setFill(Color.WHITE);
		
		myCircle16.setFill(Color.WHITE);
		myCircle17.setFill(Color.WHITE);
		myCircle18.setFill(Color.WHITE);
		
		
		
	}
	
	
	public void red(ActionEvent e) {
		
		
		if(canplay==true) {
			lb1.setText("guess the hidden code");
			System.out.println("red");
			
			if (btn1<18) {
				btn1++;
			}
			else {
				System.out.println("no more tries");
			}
			
			switch (btn1) {
			
			case 1:
				myCircle1.setFill(Color.RED);
				System.out.println(btn1);
				reply1=1;
				
				break;
			case 2:
				myCircle2.setFill(Color.RED);
				System.out.println(btn1);
				reply2=1;
				
				break;
			case 3:
				myCircle3.setFill(Color.RED);
				System.out.println(btn1);
				reply3=1;
				lb32.setVisible(true);
				myCircle4.setVisible(true);
				myCircle5.setVisible(true);
				myCircle6.setVisible(true);
				check();
				
				break;
				
			case 4:
				myCircle4.setFill(Color.RED);
				System.out.println(btn1);
				reply1=1;
				break;
			case 5:
				myCircle5.setFill(Color.RED);
				System.out.println(btn1);
				reply2=1;
				break;
			case 6:
				myCircle6.setFill(Color.RED);
				System.out.println(btn1);
				reply3=1;
				lb33.setVisible(true);
				myCircle7.setVisible(true);
				myCircle8.setVisible(true);
				myCircle9.setVisible(true);
				check();
				break;
				
			case 7:
				myCircle7.setFill(Color.RED);
				System.out.println(btn1);
				reply1=1;
				break;
			case 8:
				myCircle8.setFill(Color.RED);
				System.out.println(btn1);
				reply2=1;
				break;
			case 9:
				myCircle9.setFill(Color.RED);
				System.out.println(btn1);
				reply3=1;
				lb34.setVisible(true);
				myCircle10.setVisible(true);
				myCircle11.setVisible(true);
				myCircle12.setVisible(true);
				check();
				break;
				
			case 10:
				myCircle10.setFill(Color.RED);
				System.out.println(btn1);
				reply1=1;
				break;
			case 11:
				myCircle11.setFill(Color.RED);
				System.out.println(btn1);
				reply2=1;
				break;
			case 12:
				myCircle12.setFill(Color.RED);
				System.out.println(btn1);
				reply3=1;
				lb35.setVisible(true);
				myCircle13.setVisible(true);
				myCircle14.setVisible(true);
				myCircle15.setVisible(true);
				check();
				break;
			
			case 13:
				myCircle13.setFill(Color.RED);
				System.out.println(btn1);
				reply1=1;
				break;
			case 14:
				myCircle14.setFill(Color.RED);
				System.out.println(btn1);
				reply2=1;
				break;
			case 15:
				myCircle15.setFill(Color.RED);
				System.out.println(btn1);
				reply3=1;
				lb36.setVisible(true);
				myCircle16.setVisible(true);
				myCircle17.setVisible(true);
				myCircle18.setVisible(true);
				check();
				break;
			
			case 16:
				myCircle16.setFill(Color.RED);
				System.out.println(btn1);
				reply1=1;
				break;
			case 17:
				myCircle17.setFill(Color.RED);
				System.out.println(btn1);
				reply2=1;
				break;
			case 18:
				myCircle18.setFill(Color.RED);
				System.out.println(btn1);
				reply3=1;
				
				check();
				break;
				
		}
		}
		else {
			System.out.println("press play");
			lb1.setText("press play ");
			
		}
		
		
		
		
		
	}
	
	public void blue(ActionEvent e) {
		
		
		if(canplay==true) {
			lb1.setText("guess the hidden code");
			System.out.println("blue");
			 
			if (btn1<18) {
				btn1++;
			}
			else {
				System.out.println("no more tries");
			}
			
				switch (btn1) {
				
				case 1:
					myCircle1.setFill(Color.BLUE);
					System.out.println(btn1);
					reply1=2;
					
					break;
				case 2:
					myCircle2.setFill(Color.BLUE);
					System.out.println(btn1);
					reply2=2;
					break;
				case 3:
					myCircle3.setFill(Color.BLUE);
					System.out.println(btn1);
					reply3=2;
					lb32.setVisible(true);
					myCircle4.setVisible(true);
					myCircle5.setVisible(true);
					myCircle6.setVisible(true);
					check();
					break;
				case 4:
					myCircle4.setFill(Color.BLUE);
					System.out.println(btn1);
					reply1=2;
					
					break;
				case 5:
					myCircle5.setFill(Color.BLUE);
					System.out.println(btn1);
					reply2=2;
					break;
				case 6:
					myCircle6.setFill(Color.BLUE);
					System.out.println(btn1);
					reply3=2;
					lb33.setVisible(true);
					myCircle7.setVisible(true);
					myCircle8.setVisible(true);
					myCircle9.setVisible(true);
					check();
					break;
				case 7:
					myCircle7.setFill(Color.BLUE);
					System.out.println(btn1);
					reply1=2;
					
					break;
				case 8:
					myCircle8.setFill(Color.BLUE);
					System.out.println(btn1);
					reply2=2;
					break;
				case 9:
					myCircle9.setFill(Color.BLUE);
					System.out.println(btn1);
					reply3=2;
					lb34.setVisible(true);
					myCircle10.setVisible(true);
					myCircle11.setVisible(true);
					myCircle12.setVisible(true);
					check();
					break;
				case 10:
					myCircle10.setFill(Color.BLUE);
					System.out.println(btn1);
					reply1=2;
					
					break;
				case 11:
					myCircle11.setFill(Color.BLUE);
					System.out.println(btn1);
					reply2=2;
					break;
				case 12:
					myCircle12.setFill(Color.BLUE);
					System.out.println(btn1);
					reply3=2;
					lb35.setVisible(true);
					myCircle13.setVisible(true);
					myCircle14.setVisible(true);
					myCircle15.setVisible(true);
					check();
					break;
					
				case 13:
					myCircle13.setFill(Color.BLUE);
					System.out.println(btn1);
					reply1=2;
					
					break;
				case 14:
					myCircle14.setFill(Color.BLUE);
					System.out.println(btn1);
					reply2=2;
					break;
				case 15:
					myCircle15.setFill(Color.BLUE);
					System.out.println(btn1);
					reply3=2;
					lb36.setVisible(true);
					myCircle16.setVisible(true);
					myCircle17.setVisible(true);
					myCircle18.setVisible(true);
					check();
					break;
				case 16:
					myCircle16.setFill(Color.BLUE);
					System.out.println(btn1);
					reply1=2;
					
					break;
				case 17:
					myCircle17.setFill(Color.BLUE);
					System.out.println(btn1);
					reply2=2;
					break;
				case 18:
					myCircle18.setFill(Color.BLUE);
					System.out.println(btn1);
					reply3=2;
					check();
					break;
					
				}
		}
		else {
			System.out.println("press play");
			lb1.setText("press play ");
			
		}
		 
	}
	public void green(ActionEvent e) {
		
		
		if(canplay==true) {
			lb1.setText("guess the hidden code");
			System.out.println("green");
			
			if (btn1<18) {
				btn1++;
			}
			else {
				System.out.println("no more tries");
			}
			switch (btn1) {
			
			case 1:
				myCircle1.setFill(Color.GREEN);
				System.out.println(btn1);
				reply1=3;
				break;
			case 2:
				myCircle2.setFill(Color.GREEN);
				System.out.println(btn1);
				reply2=3;
				break;
			case 3:
				myCircle3.setFill(Color.GREEN);
				System.out.println(btn1);
				reply3=3;
				lb32.setVisible(true);
				myCircle4.setVisible(true);
				myCircle5.setVisible(true);
				myCircle6.setVisible(true);
				check();
				break;
			case 4:
				myCircle4.setFill(Color.GREEN);
				System.out.println(btn1);
				reply1=3;
				break;
			case 5:
				myCircle5.setFill(Color.GREEN);
				System.out.println(btn1);
				reply2=3;
				break;
			case 6:
				myCircle6.setFill(Color.GREEN);
				System.out.println(btn1);
				reply3=3;
				lb33.setVisible(true);
				myCircle7.setVisible(true);
				myCircle8.setVisible(true);
				myCircle9.setVisible(true);
				check();
				break;
			case 7:
				myCircle7.setFill(Color.GREEN);
				System.out.println(btn1);
				reply1=3;
				break;
			case 8:
				myCircle8.setFill(Color.GREEN);
				System.out.println(btn1);
				reply2=3;
				break;
			case 9:
				myCircle9.setFill(Color.GREEN);
				System.out.println(btn1);
				reply3=3;
				lb34.setVisible(true);
				myCircle10.setVisible(true);
				myCircle11.setVisible(true);
				myCircle12.setVisible(true);
				check();
				break;
			case 10:
				myCircle10.setFill(Color.GREEN);
				System.out.println(btn1);
				reply1=3;
				break;
			case 11:
				myCircle11.setFill(Color.GREEN);
				System.out.println(btn1);
				reply2=3;
				break;
			case 12:
				myCircle12.setFill(Color.GREEN);
				System.out.println(btn1);
				reply3=3;
				lb35.setVisible(true);
				myCircle13.setVisible(true);
				myCircle14.setVisible(true);
				myCircle15.setVisible(true);
				check();
				break;
			case 13:
				myCircle13.setFill(Color.GREEN);
				System.out.println(btn1);
				reply1=3;
				break;
			case 14:
				myCircle14.setFill(Color.GREEN);
				System.out.println(btn1);
				reply2=3;
				break;
			case 15:
				myCircle15.setFill(Color.GREEN);
				System.out.println(btn1);
				reply3=3;
				lb36.setVisible(true);
				myCircle16.setVisible(true);
				myCircle17.setVisible(true);
				myCircle18.setVisible(true);
				check();
				break;
			case 16:
				myCircle16.setFill(Color.GREEN);
				System.out.println(btn1);
				reply1=3;
				break;
			case 17:
				myCircle17.setFill(Color.GREEN);
				System.out.println(btn1);
				reply2=3;
				break;
			case 18:
				myCircle18.setFill(Color.GREEN);
				System.out.println(btn1);
				reply3=3;
				check();
				break;
			}
		}
		else {
			System.out.println("press play");
			lb1.setText("press play ");
			
		}
		
	}
	public void yellow(ActionEvent e) {
		
		if(canplay==true) {
			lb1.setText("guess the hidden code");
			System.out.println("yellow");
			
			if (btn1<18) {
				btn1++;
			}
			else {
				System.out.println("no more tries");
			}
			switch (btn1) {
			
			case 1:
				myCircle1.setFill(Color.YELLOW);
				System.out.println(btn1);
				reply1=4;
				break;
			case 2:
				myCircle2.setFill(Color.YELLOW);
				System.out.println(btn1);
				reply2=4;
				break;
			case 3:
				myCircle3.setFill(Color.YELLOW);
				System.out.println(btn1);
				reply3=4;
				lb32.setVisible(true);
				myCircle4.setVisible(true);
				myCircle5.setVisible(true);
				myCircle6.setVisible(true);
				check();
				break;
			case 4:
				myCircle4.setFill(Color.YELLOW);
				System.out.println(btn1);
				reply1=4;
				break;
			case 5:
				myCircle5.setFill(Color.YELLOW);
				System.out.println(btn1);
				reply2=4;
				break;
			case 6:
				myCircle6.setFill(Color.YELLOW);
				System.out.println(btn1);
				reply3=4;
				lb33.setVisible(true);
				myCircle7.setVisible(true);
				myCircle8.setVisible(true);
				myCircle9.setVisible(true);
				check();
				break;
			case 7:
				myCircle7.setFill(Color.YELLOW);
				System.out.println(btn1);
				reply1=4;
				break;
			case 8:
				myCircle8.setFill(Color.YELLOW);
				System.out.println(btn1);
				reply2=4;
				break;
			case 9:
				myCircle9.setFill(Color.YELLOW);
				System.out.println(btn1);
				reply3=4;
				lb34.setVisible(true);
				myCircle10.setVisible(true);
				myCircle11.setVisible(true);
				myCircle12.setVisible(true);
				check();
				break;
			case 10:
				myCircle10.setFill(Color.YELLOW);
				System.out.println(btn1);
				reply1=4;
				break;
			case 11:
				myCircle11.setFill(Color.YELLOW);
				System.out.println(btn1);
				reply2=4;
				break;
			case 12:
				myCircle12.setFill(Color.YELLOW);
				System.out.println(btn1);
				reply3=4;
				lb35.setVisible(true);
				myCircle13.setVisible(true);
				myCircle14.setVisible(true);
				myCircle15.setVisible(true);
				check();
				break;
			case 13:
				myCircle13.setFill(Color.YELLOW);
				System.out.println(btn1);
				reply1=4;
				break;
			case 14:
				myCircle14.setFill(Color.YELLOW);
				System.out.println(btn1);
				reply2=4;
				break;
			case 15:
				myCircle15.setFill(Color.YELLOW);
				System.out.println(btn1);
				reply3=4;
				lb36.setVisible(true);
				myCircle16.setVisible(true);
				myCircle17.setVisible(true);
				myCircle18.setVisible(true);
				check();
				break;
			case 16:
				myCircle16.setFill(Color.YELLOW);
				System.out.println(btn1);
				reply1=4;
				break;
			case 17:
				myCircle17.setFill(Color.YELLOW);
				System.out.println(btn1);
				reply2=4;
				break;
			case 18:
				myCircle18.setFill(Color.YELLOW);
				System.out.println(btn1);
				reply3=4;
				check();
				break;
				
				
			}
		}
		else {
			System.out.println("press play");
			lb1.setText("press play ");
			
		}
		
		
		
	}
	public void black(ActionEvent e) {
		
		
		if(canplay==true) {
			lb1.setText("guess the hidden code");
			System.out.println("black");
			
			if (btn1<18) {
				btn1++;
			}
			else {
				System.out.println("no more tries");
			}
			switch (btn1) {
			
			case 1:
				myCircle1.setFill(Color.BLACK);
				System.out.println(btn1);
				reply1=5;
				break;
			case 2:
				myCircle2.setFill(Color.BLACK);
				System.out.println(btn1);
				reply2=5;
				break;
			case 3:
				myCircle3.setFill(Color.BLACK);
				System.out.println(btn1);
				reply3=5;
				lb32.setVisible(true);
				myCircle4.setVisible(true);
				myCircle5.setVisible(true);
				myCircle6.setVisible(true);
				check();
				break;
			case 4:
				myCircle4.setFill(Color.BLACK);
				System.out.println(btn1);
				reply1=5;
				break;
			case 5:
				myCircle5.setFill(Color.BLACK);
				System.out.println(btn1);
				reply2=5;
				break;
			case 6:
				myCircle6.setFill(Color.BLACK);
				System.out.println(btn1);
				reply3=5;
				lb33.setVisible(true);
				myCircle7.setVisible(true);
				myCircle8.setVisible(true);
				myCircle9.setVisible(true);
				check();
				break;
			case 7:
				myCircle7.setFill(Color.BLACK);
				System.out.println(btn1);
				reply1=5;
				break;
			case 8:
				myCircle8.setFill(Color.BLACK);
				System.out.println(btn1);
				reply2=5;
				break;
			case 9:
				myCircle9.setFill(Color.BLACK);
				System.out.println(btn1);
				reply3=5;
				lb34.setVisible(true);
				myCircle10.setVisible(true);
				myCircle11.setVisible(true);
				myCircle12.setVisible(true);
				check();
				break;
			case 10:
				myCircle10.setFill(Color.BLACK);
				System.out.println(btn1);
				reply1=5;
				break;
			case 11:
				myCircle11.setFill(Color.BLACK);
				System.out.println(btn1);
				reply2=5;
				break;
			case 12:
				myCircle12.setFill(Color.BLACK);
				System.out.println(btn1);
				reply3=5;
				lb35.setVisible(true);
				myCircle13.setVisible(true);
				myCircle14.setVisible(true);
				myCircle15.setVisible(true);
				check();
				break;
			case 13:
				myCircle13.setFill(Color.BLACK);
				System.out.println(btn1);
				reply1=5;
				break;
			case 14:
				myCircle14.setFill(Color.BLACK);
				System.out.println(btn1);
				reply2=5;
				break;
			case 15:
				myCircle15.setFill(Color.BLACK);
				System.out.println(btn1);
				reply3=5;
				lb36.setVisible(true);
				myCircle16.setVisible(true);
				myCircle17.setVisible(true);
				myCircle18.setVisible(true);
				check();
				break;
			case 16:
				myCircle16.setFill(Color.BLACK);
				System.out.println(btn1);
				reply1=5;
				break;
			case 17:
				myCircle17.setFill(Color.BLACK);
				System.out.println(btn1);
				reply2=5;
				break;
			case 18:
				myCircle18.setFill(Color.BLACK);
				System.out.println(btn1);
				reply3=5;
				check();
				break;

			}
		}
		else {
			System.out.println("press play");
			lb1.setText("press play ");
			
		}
		
	}
	
	public static int RandomNum() {
	
	int max = 5;
    int min = 1;
    int range = max - min + 1;
    

    // generate random numbers within 1 to 5
    for (int i = 0; i < 1; i++) {
         rand = (int)(Math.random() * range) + min;
        
    }
   
	return rand;
    }
	public static int RandomNum2() {
		
		int max = 5;
	    int min = 1;
	    int range = max - min + 1;
	    

	    // generate random numbers within 1 to 5
	    for (int i = 0; i < 1; i++) {
	         rand2 = (int)(Math.random() * range) + min;
	        
	    }
		return rand2;
	    }
	public static int RandomNum3() {
		
		int max = 5;
	    int min = 1;
	    int range = max - min + 1;
	    

	    // generate random numbers within 1 to 5
	    for (int i = 0; i < 1; i++) {
	         rand3 = (int)(Math.random() * range) + min;
	        
	    }
		return rand3;
	    }
	
	
	public void RandomColor1(int x) {
		
		switch(x) {
		
		case 1:
			myCircleA.setFill(Color.RED);
			break;
		case 2:
			myCircleA.setFill(Color.BLUE);
			break;
		case 3:
			myCircleA.setFill(Color.GREEN);
			break;
		case 4:
			myCircleA.setFill(Color.YELLOW);
			break;
		case 5:
			myCircleA.setFill(Color.BLACK);
			break;
		}
	}
		public void RandomColor2(int y) {
			
			switch(y) {
			
			case 1:
				myCircleB.setFill(Color.RED);
				break;
			case 2:
				myCircleB.setFill(Color.BLUE);
				break;
			case 3:
				myCircleB.setFill(Color.GREEN);
				break;
			case 4:
				myCircleB.setFill(Color.YELLOW);
				break;
			case 5:
				myCircleB.setFill(Color.BLACK);
				break;
			}
		}
		public void RandomColor3(int z) {
			
			switch(z) {
			
			case 1:
				myCircleC.setFill(Color.RED);
				break;
			case 2:
				myCircleC.setFill(Color.BLUE);
				break;
			case 3:
				myCircleC.setFill(Color.GREEN);
				break;
			case 4:
				myCircleC.setFill(Color.YELLOW);
				break;
			case 5:
				myCircleC.setFill(Color.BLACK);
				
				break;
				
			}
			
			
				
			}
		public void check() {
			
			tryamount++;
			System.out.println("try = " + tryamount);
			
			if(tryamount == 6) {
				
				canplay=false;
				win=1;
				
			}
			
			if(win==1) {
				lb2.setText("you lost, please play again");
			}
			else if (win==2 && tryamount != 6) {
				lb2.setText("you won, please play again");
			}
			
			
			
			

			
			
			 if(reply1==rand && reply2==rand2 && reply3==rand3) {
             	System.out.println("all correct");
             	
             	canplay=false;
             	
             	
             	lb2.setText("you won, please play again");
             	lb1.setText("correct");
             	
             		RandomColor1(rand);
             		RandomColor2(rand2);
             		RandomColor3(rand3);
             }
			 else if(reply1==rand && reply2==rand2 && reply3!=rand3) {
				 System.out.println("1st and 2nd are correct");
				 
				 lb1.setText("1st and 2nd are correct");
     	
				  RandomColor1(rand);
				 RandomColor2(rand2);
     	
			 }
			 else if(reply1==rand && reply2!=rand2 && reply3==rand3) {
				 System.out.println("1st and 3rd are correct");
				 
				 lb1.setText("1st and 3rd are correct");
     	
				 RandomColor1(rand);
				 RandomColor3(rand3);
			 }
			 else if(reply1!=rand && reply2==rand2 && reply3==rand3) {
				 System.out.println("2nd and 3rd are correct");
				 
				 lb1.setText("2nd and 3rd are correct");
     	
				 RandomColor2(rand2);
				 RandomColor3(rand3);
			 }
     
			 else if(reply1==rand && reply2!=rand2 && reply3!=rand3) {
				 System.out.println("1st is correct");
				 
				 lb1.setText("1st is correct");
     	
				 RandomColor1(rand);  	
			 }
			 else if(reply1!=rand && reply2==rand2 && reply3!=rand3) {
				 System.out.println("2nd is correct");
				 
				 lb1.setText("2nd is correct");
     	
				 RandomColor2(rand2);
			 }
			 else if(reply1!=rand && reply2!=rand2 && reply3==rand3) {
				 System.out.println("3rd is correct");
				 
				 lb1.setText("3rd is correct");
				 
     	
				 RandomColor3(rand3);
			 }
			 else if (reply1!=rand && reply2!=rand2 && reply3!=rand3){
				 System.out.println("all incorrect");
				 
				 lb1.setText("all incorrect");
			 }
     	
     }
		}
		
		

		
	
	
	
		

	
	
	
		
			
		


	
	
	



	
	


	
	
		
		
	
	
	




