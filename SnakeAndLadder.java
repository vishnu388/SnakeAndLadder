public class SnakeAndLadder {

public static void main(String args[]){
	 int pos=0;
	 int flag=0;
	 int pos_temp;
	 int dieRoll=0;

	while(true) {
		dieRoll++;

		int die=(int)Math.floor(Math.random()*10)%6 + 1;
		if(flag==1) {
			int options=(int)Math.floor(Math.random()*10)%2 +1;
			switch(options) {
				case 1 : {
					pos_temp=pos;
					pos+=die;
					System.out.println("\n Player  Rolled[DIE] | Die Value : "+die +"\n Player  Climbed Laddar with +"+die+"\n");
					break;
				}
				case 2:{
					pos-=die;
					System.out.println("\n Player  Rolled[DIE] ! Die Value : "+die +"\n Player  bitten by snake with -"+die+"\n");
					break;
			}
		}
		}

	if(flag==0 && die==1) {
				flag=1;
				pos=1;
				System.out.println("\nPlayer  is entered into Game! \n  Player  position : "+pos+"\n");
				}
	if(pos>=100) {
			System.out.println("\n !!Game Over!!\n\n Player  wins with "+dieRoll+ " Die Rolls\n");
			return;
			}

	}
}
}
