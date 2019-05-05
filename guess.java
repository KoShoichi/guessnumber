import java.util.Scanner;
import java.util.Random;

public class guess {
	public static void main(String args[]) {
        int random = (int)(Math.random()*10000);
        Scanner input = new Scanner(System.in);
        boolean gameover = false;
        int userinput;
        
        System.out.println("please input a number between 1000 and 9999");

        while(!gameover){
        	if(!input.hasNextInt()){
        		System.out.println("wrong input, please try again");
        		//input.close();
        		break;
        	}
        	userinput = input.nextInt();
        	if(userinput < 1000 || userinput > 9999){
        		System.out.println("wrong input, please try again");
        	}else if (userinput>random) {
        		System.out.println("Big");
        	}else if (userinput<random) {
        		System.out.println("Small");
        	}else {
        		System.out.println("Bingo!");
        		gameover = true;
        	}
        }

        input.close();
    }
}
