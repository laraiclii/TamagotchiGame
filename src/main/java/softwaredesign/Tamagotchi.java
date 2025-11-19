package softwaredesign;

import java.util.Scanner;

import softwaredesign.Activities.Clean;
import softwaredesign.Activities.Feed;
import softwaredesign.Activities.Play;
import softwaredesign.Activities.Sleep;

enum Status{
	Alive,
	Hungry,
	Dirty,
	Sleepy,
	Dead
}

public class Tamagotchi {

    private String name;
    public String creature;
    private Status status;
    public Need needs[] = new Need[4];

    //constructor 
    public Tamagotchi(String name, String creature){

        this.name = name;
        this.creature = creature;

        //Creates instences for each need. 
        this.needs[0] = new Sleep(7);
        this.needs[1] = new Feed(2);
        this.needs[2] = new Play(5);
        this.needs[3] = new Clean(3);
    }

    //send in a parameter for which need needs updating. 
    //But we need to do an acticity before this satisfy function gets called
    public void Update(){

		//this.needs[0].Update();

		//if(this.needs[0].checkStatus()) {
		//	this.status = Status.Dead;
		//}

		for(int i=0;i<this.needs.length;i++){
            this.needs[i].Update();

            if(this.needs[i].checkStatus()) {
                this.status = Status.Dead;
            }

        }


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }



    public void printStatus() {
        for(int i=0;i<this.needs.length;i++){
            this.needs[i].PrintStatus();
        }

		
		System.out.println("Status: " + status.toString());
	}

    /* 
     public void printMenu(){
         Scanner scanner = new Scanner(System.in);
         int optionsFood=0;
         while(optionsFood!=5) {
             System.out.println("Food Menu");
             System.out.println("1. Cake");
             System.out.println("2. Pizza");
             System.out.println("3. Candy");
             System.out.println("4. Salad");
             System.out.println("5. Return to lobby");
             System.out.print("> ");
             optionsFood = scanner.nextInt();
 
             needs[1].Satisfy();
         }
     }
    */


}
