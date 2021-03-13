public class SnakeAndLadder {

public static void main(String args[]){
	 int pos=0;
	 int temp_pos=0;
	 int dieRoll=0;
	 int flag=0;
			 	int LADDER=1;
				int SNAKE=2;
				while(true) {
					int die=(int)(Math.floor(Math.random()*10)%6+1);
					int options=(int) (Math.floor(Math.random()*10)%2 +1);
				switch(options) {
					case 1:
						temp_pos=pos;
						pos+=die;
						System.out.println("the player in ladder at which position is " +pos);
						break;
					case 2:
						pos-=die;
						System.out.println("The player is hit by snake currently he is in n" +pos);
						break;
					default:
						temp_pos=pos;
						System.out.println("current position is "+temp_pos);
						break;
						}
	
					}

	}
}
