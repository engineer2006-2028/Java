public class lego {

    int  bricks=83;
    int containerCapacity = 8;
    int fullContainers = bricks / containerCapacity;
    int remainingBricks = bricks % containerCapacity;
    int total=fullContainers;



public void main() {
    if(remainingBricks > 0){
        total++;
    }
    int value=total-fullContainers;
    System.out.println("Lego bricks we have = " + bricks);
    System.out.println("container capacity = " + containerCapacity);
    System.out.println("Full containers = " + fullContainers);
    System.out.println("remaining bricks = " + remainingBricks);
    if(remainingBricks > 0){
        total++;
        System.out.println("Soo " + value+" more container needed");
    }else {
        System.out.println("Soo we don't need extra container ");
    }




}
}

