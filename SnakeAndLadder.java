public class SnakeAndLadder {

public static void main(String args[]){
 			int positiona=0;
		 	int positionb=0;
			int aflag=0;
			int bflag=0;
			int aptmp;
			int bptmp;
			int dieRoll=0;

			while(true) {
				dieRoll++;

				int dieA=(int)Math.floor(Math.random()*10)%6 + 1;
				if(aflag==1) {
					int optionsA=(int)Math.floor(Math.random()*10)%2 +1;
					switch(optionsA) {
						case 1 : {
							aptmp=positiona;
							positiona+=dieA;
							if(positiona>100){
							positiona=aptmp;
							System.out.println("\nPlayer-A need to get Die value "+(100-positiona)+" to win\n");
								break;
							}
							System.out.println("\n Player-A  Rolled[DIE] | Die Value : "+dieA +"\n Player-A  Climbed Laddar with +"+dieA+"\n current position of a player-A:"+positiona+"\n");
							break;
						}
						case 2:{
							positiona-=dieA;
							if(positiona<=0){
								aflag=0;
								positiona=0;
								System.out.println("\n NO!! player-A is eliminated out of the game He needs one in order to enter the game\n");
								break;
								}
							System.out.println("\n Player-A  Rolled[DIE] ! Die Value : "+dieA +"\n Player-A  bitten by snake with -"+dieA+"\n current position of a player-A:"+positiona+"\n");
							break;
					}
				}
				}

			if(aflag==0 && dieA==1) {
						aflag=1;
						positiona=1;
						System.out.println("\nPlayer-A  is entered into Game! \n  Player-A  position : "+positiona+"\n");
						}
			if(positiona>=100) {
					System.out.println("\n !!Game Over!!\n results are displayed below.....\n\n Player-A  wins with "+dieRoll+ " Die Rolls\n");
					return;
					}
			int dieB=(int)Math.floor(Math.random()*10)%6 + 1;
			if(bflag==1) {
				int optionsB=(int)Math.floor(Math.random()*10)%2 +1;
				switch(optionsB) {
					case 1 : {
						bptmp=positionb;
						positionb+=dieB;
						if(positionb>100){
						positionb=bptmp;
						System.out.println("\nPlayer-B need to get Die value "+(100-positionb)+" to win\n");
							break;
						}
						System.out.println("\n Player-B  Rolled[DIE] | Die Value : "+dieB +"\n Player-B  Climbed Laddar with +"+dieB+"\n current position of a player-B:"+positionb+"\n");
						break;
					}
					case 2:{
						positionb-=dieB;
						if(positionb<=0){
							bflag=0;
							positionb=0;
							System.out.println("\n NO!! playerB is eliminated out of the game He needs one in order to enter the game\n");
							break;
							}
						System.out.println("\n Player-B  Rolled[DIE] ! Die Value : "+dieB +"\n Player-B  bitten by snake with -"+dieB+"\n current position of a player-B:"+positionb+"\n");
						break;
				}
			}
			}

		if(bflag==0 && dieB==1) {
					bflag=1;
					positionb=1;
					System.out.println("\nPlayer-B  is entered into Game! \n  Player-B  position : "+positionb+"\n");
					}
		if(positionb>=100) {
				System.out.println("\n !!Game Over!!\n results are displayed below.....\n\n Player-B wins with "+dieRoll+ " Die Rolls\n");
				return;
				}
			}
		}
		}
