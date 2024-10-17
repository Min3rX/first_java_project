static void intStuff(){

    int side = 5;
    int i = square(side);

    System.out.println("The square of "+side+" is "+i);

    side = 6;
    i = square(side);
    System.out.println("The square of "+side+" is "+i);

    side = 0;

    while(side < 10){

        side = side+1;
        i = square(side);
        System.out.println("The square of "+side+" is "+i);

    }

    side = 0;

    while(side < 10){

        