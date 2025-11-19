package softwaredesign.Activities;
import java.util.Objects;

import softwaredesign.Need;

public class Clean extends Need{
    
    public Boolean isDirty;

    public Clean(int decreaseInterval) {
        super(decreaseInterval);
    }

    public void PrintStatus() {
        System.out.print("Cleanliness: ");
        super.PrintStatus();
    }

    public void Update() {

        super.Update();

        if(super.statusPoint <= 30) {
            isDirty = true;
            SendNotification();
        }
        else {
            isDirty = false;
        }
    }

    public void GetClean() {
        super.Satisfy();
        isDirty = false;
    }
    private void SendNotification() {
        System.out.println("Your tamagotchi is dirty!");
    }

//    public int bath(int cleanliness){
//
//        if(Objects.equals(race, "cat")){
//            System.out.println("  ()          () ");
//            System.out.println("()  ()  ()  ()  () ");
//            System.out.println(" ()  ()  ()  ()  ()");
//            System.out.println("()()   /\\_/\\   ()");
//            System.out.println("  ()  / o o \\  () ()");
//            System.out.println("()   (   \"   )  ()");
//            System.out.println("()()  \\~(*)~/  () () ()");
//            System.out.println("() ()  // \\\\   ()");
//            System.out.println("()  ()  ()  ()  () ");
//            System.out.println(" ()  ()  ()  ()  ()");
//        }
//        //To not go over 100
//        if (cleanliness == 100) {
//            cleanliness = 105;
//            return cleanliness;
//        }
//
//        //Increments the cleanliness bar
//        cleanliness += 10;
//
//        if (cleanliness > 100) {
//            cleanliness = 100;
//        }
//
//
//        return cleanliness;
//    }
//
//    public int poop(int cleanliness){
//
//        //To not go over 100
//        if (cleanliness == 100) {
//            cleanliness = 105;
//            return cleanliness;
//        }
//
//        //Increments the cleanliness bar
//        cleanliness += 10;
//
//        if (cleanliness > 100) {
//            cleanliness = 100;
//        }
//
//        return cleanliness;
//    }

}
