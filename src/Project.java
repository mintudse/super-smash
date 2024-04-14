import java.sql.SQLOutput;
import java.util.Scanner;
import java.awt.*;

public class Project {

    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            StdAudio.playInBackground("theme.wav");
            // draw title screen
            StdDraw.setCanvasSize(650, 500);
            StdDraw.setScale(0, 3);
            StdDraw.setPenColor(Color.black);   // make background screen colors
            StdDraw.setPenRadius(0.01);
            StdDraw.filledRectangle(4, 4, 4, 4);
            StdDraw.setPenColor(Color.white);
            StdDraw.filledRectangle(1.5, 1.7, 3, 1);
            // Write text
            StdDraw.textLeft(0.1, 0.5, "M.Y. 2023");
            StdDraw.textLeft(0.1, 0.38, "Inspired by Nintendo & characters from childhood shows");
            StdDraw.textLeft(0.1, 0.26, "Peep and the Big Wide World / Max & Ruby");
            StdDraw.textLeft(0.1, 0.14, "Hello Kitty and Friends / Sesame Street");
            // change font
            Font arial = new Font("Arial", Font.BOLD, 60);    // change font
            StdDraw.setFont(arial);
            StdDraw.setPenColor(Color.black);
            StdDraw.text(1.5, 1.8, "SUPER");
            StdDraw.text(1.5, 1.5, "SMASH BROS");
            StdDraw.setPenColor(Color.red);
            Font font2 = new Font("Serif", Font.BOLD, 15);
            StdDraw.setFont(font2);
            StdDraw.text(1.5, 1, "CLICK ANYWHERE TO START");
            // mouse click input
            while (!StdDraw.isMousePressed()) {
            }

            // Show Choose Fighter Screen
            StdDraw.clear(Color.black); // make background screen colors
            StdDraw.setPenColor(190, 52, 18);   // dark red
            StdDraw.filledRectangle(1.5, 2.9, 3, 0.1);
            StdDraw.setPenColor(243, 209, 67);   // yellow
            StdDraw.filledRectangle(1, 2.9, 0.5, 0.1);
            StdDraw.setPenColor(Color.black);
            StdDraw.rectangle(1, 2.9, 0.5, 0.1);
            Font arialsmall = new Font("Arial", Font.BOLD, 15);
            StdDraw.setFont(arialsmall);
            StdDraw.text(1, 2.9, "Solo Battle");

            StdDraw.setPenColor(Color.black); // black bar below red in case needed
            StdDraw.filledRectangle(1.5, 2.65, 3, 0.15);

            // character boxes
            StdDraw.setPenColor(60, 190, 229);    // light blue
            StdDraw.filledRectangle(1.5, 1.9, 1.3, 0.5);
            StdDraw.setPenColor(Color.black);
            StdDraw.rectangle(0.525, 1.9, 0.325, 0.5);
            StdDraw.rectangle(1.175, 1.9, 0.325, 0.5);
            StdDraw.rectangle(1.825, 1.9, 0.325, 0.5);
            StdDraw.rectangle(2.475, 1.9, 0.325, 0.5);
            // player boxes
            StdDraw.setPenColor(60, 190, 229);    // light blue
            StdDraw.filledRectangle(1.5, 0.625, 2, 0.625);
            StdDraw.setPenColor(245, 64, 64); // player 1 square red
            StdDraw.filledRectangle(0.75, 0.53, 0.7, 0.65);
            StdDraw.setPenColor(180, 180, 180); // player CPU square gray
            StdDraw.filledRectangle(2.2, 0.53, 0.7, 0.65);
            // P1 and CPU tiny box in the player boxes
            StdDraw.setPenColor(232, 165, 165); // really light red
            StdDraw.filledRectangle(1.1, 0.45, 0.3, 0.1); // player 1 name box
            StdDraw.setPenColor(213, 213, 213); // really light gray
            StdDraw.filledRectangle(2.55, 0.45, 0.3, 0.1); // player 1 name box
            StdDraw.setPenRadius(0.005);
            StdDraw.setPenColor(Color.black);
            StdDraw.rectangle(1.1, 0.15, 0.3, 0.15); //   "P1"
            StdDraw.rectangle(1.1, 0.45, 0.3, 0.1); // place for player name
            StdDraw.text(1.1, 0.45, "Player 1");
            StdDraw.text(2.55, 0.45, "Random");
            Font bigReg = new Font("Sans Serif", Font.BOLD, 20);
            StdDraw.setFont(bigReg);
            StdDraw.text(1.1, 0.15, "P1");
            StdDraw.rectangle(2.55, 0.15, 0.3, 0.15); // "CPU"
            StdDraw.rectangle(2.55, 0.45, 0.3, 0.1); // "Random"
            StdDraw.text(2.55, 0.15, "CPU");
            // draw random selector box
            randombox(2.485, 2.65);

            System.out.print("-+=ENTER PLAYER NAME=+-\nName: ");
            String name = keyboard.nextLine();
            System.out.println("PLAYER 1: " + name);
            StdDraw.setPenColor(232, 165, 165); // really light red
            StdDraw.filledRectangle(1.1, 0.45, 0.3, 0.1);
            StdDraw.setPenColor(Color.black);
            StdDraw.rectangle(1.1, 0.45, 0.3, 0.1);
            StdDraw.setFont(arialsmall);
            StdDraw.text(1.1, 0.45, name); // shows player's name on screen

            // Characters
            quack(0.525, 1.9); // placing Quack in the 1st character box
            maxbunny(1.185, 1.9); // placing Max in 2nd character box
            kitty(1.835, 1.9); // placing Kitty in the 3rd character box
            cookie(2.485, 1.9); // placing Cookie Monster in 4th character box
            System.out.println("-+=CHOOSE A CHARACTER=+-\n~Choose a character by clicking on it on the screen~");
            System.out.println("1. Quack         2. Max\n3. Hello Kitty   4. Cookie Monster\n5. Random");
            //String character = keyboard.nextLine();
            int moveOn = 0; // counter to check valid input
            Characters character1 = new Characters(0); // variable for storing player's character choice
            int charplayer1 = 0;
            System.out.println("~Once you're ready, click the 'Ready to Fight' bar. You can change your character before clicking the bar~");
            while (!StdDraw.isMousePressed()) {
            }
            while (moveOn == 0) {
                if (StdDraw.mouseX() >= 0.2 && StdDraw.mouseX() <= 0.85 && StdDraw.mouseY() >= 1.4 && StdDraw.mouseY() <= 2.4) { // if click the box
                    quack(0.45, 0.53); // placing Quack in the P1 box if chosen
                    character1 = new Characters(0); // store character as Quack
                    charplayer1 = 0;
                    readybar(1.5, 1.2);    // call StdDraw to draw are you ready bar
                    while (!StdDraw.isMousePressed()) {
                    }
                    if (StdDraw.mouseX() >= 0 && StdDraw.mouseX() <= 3 && StdDraw.mouseY() >= 1 && StdDraw.mouseY() <= 1.4) {// if StdDraw at those coords, move on (break)
                        moveOn = 1;
                    } else {
                        charactercover(0.45, 0.53);
                        continue;
                    }
                } else if (StdDraw.mouseX() >= 0.86 && StdDraw.mouseX() <= 1.51 && StdDraw.mouseY() >= 1.4 && StdDraw.mouseY() <= 2.4) {
                    maxbunny(0.45, 0.53); // placing Max in P1 box if chosen
                    character1 = new Characters(1);
                    charplayer1 = 1;
                    readybar(1.5, 1.2);    // call StdDraw to draw are you ready bar
                    while (!StdDraw.isMousePressed()) {
                    }
                    if (StdDraw.mouseX() >= 0 && StdDraw.mouseX() <= 3 && StdDraw.mouseY() >= 1 && StdDraw.mouseY() <= 1.4) {// if StdDraw at those coords, move on (break)
                        moveOn = 1;
                    } else {
                        charactercover(0.45, 0.53);
                        continue;
                    }
                } else if (StdDraw.mouseX() >= 1.51 && StdDraw.mouseX() <= 2.16 && StdDraw.mouseY() >= 1.4 && StdDraw.mouseY() <= 2.4) {
                    kitty(0.45, 0.53); // placing Kitty in P1 box if chosen
                    character1 = new Characters(2);
                    charplayer1 = 2;
                    readybar(1.5, 1.2);    // call StdDraw to draw are you ready bar
                    while (!StdDraw.isMousePressed()) {
                    }
                    if (StdDraw.mouseX() >= 0 && StdDraw.mouseX() <= 3 && StdDraw.mouseY() >= 1 && StdDraw.mouseY() <= 1.4) {// if StdDraw at those coords, move on (break)
                        moveOn = 1;
                    } else {
                        charactercover(0.45, 0.53);
                        continue;
                    }
                } else if (StdDraw.mouseX() >= 2.16 && StdDraw.mouseX() <= 2.81 && StdDraw.mouseY() >= 1.4 && StdDraw.mouseY() <= 2.4) {
                    cookie(0.45, 0.53); // placing Cookie Monster in P1 box if chosen
                    character1 = new Characters(3);
                    charplayer1 = 3;
                    readybar(1.5, 1.2);    // call StdDraw to draw are you ready bar
                    while (!StdDraw.isMousePressed()) {
                    }
                    if (StdDraw.mouseX() >= 0 && StdDraw.mouseX() <= 3 && StdDraw.mouseY() >= 1 && StdDraw.mouseY() <= 1.4) {// if StdDraw at those coords, move on (break)
                        moveOn = 1;
                    } else {
                        charactercover(0.45, 0.53);
                        continue;
                    }
                } else if (StdDraw.mouseX() >= 2.325 && StdDraw.mouseX() <= 2.645 && StdDraw.mouseY() >= 2.425 && StdDraw.mouseY() <= 2.805) { // clicked random selector
                    int characterRand = 1 + (int) (Math.random() * 4);
                    charplayer1 = characterRand - 1;
                    character1 = new Characters(characterRand - 1);
                    if (characterRand - 1 == 0) { // got Quack
                        quack(0.45, 0.53);
                    } else if (characterRand - 1 == 1) { // got Max
                        maxbunny(0.45, 0.53);
                    } else if (characterRand - 1 == 2) { // got Hello Kitty
                        kitty(0.45, 0.53);
                    } else if (characterRand - 1 == 3) { // got Cookie Monster
                        cookie(0.45, 0.53);
                    }
                    readybar(1.5, 1.2);    // call StdDraw to draw are you ready bar
                    while (!StdDraw.isMousePressed()) {
                    }
                    if (StdDraw.mouseX() >= 0 && StdDraw.mouseX() <= 3 && StdDraw.mouseY() >= 1 && StdDraw.mouseY() <= 1.4) {// if StdDraw at those coords, move on (break)
                        moveOn = 1;
                    } else {
                        charactercover(0.45, 0.53);
                        continue;
                    }
                }
            }

            String player1 = character1.toString();
            System.out.println("Player 1: " + player1);
            System.out.print("CPU: ");

            int characterRandCPU = 1 + (int) (Math.random() * 4);
            Characters character2 = new Characters(characterRandCPU - 1);
            String cpu = character2.toString();
            System.out.println(cpu);
            if (characterRandCPU - 1 == 0) {
                quack(1.85, 0.53);
            }
            if (characterRandCPU - 1 == 1) {
                maxbunny(1.85, 0.53);
            }
            if (characterRandCPU - 1 == 2) {
                kitty(1.85, 0.53);
            }
            if (characterRandCPU - 1 == 3) {
                cookie(1.85, 0.53);
            }

            System.out.println("-+=READY TO MOVE ON!=+-");
            System.out.println("~Press the Enter key to move on~");
            keyboard.nextLine();

            //Choose Fighter Screen
            StdDraw.clear(Color.black);
            StdDraw.setPenColor(103, 125, 238); // blue purple
            StdDraw.filledSquare(1.5, 1.5, 3);
            StdDraw.setPenColor(124, 152, 247);   // lighter blue purple
            StdDraw.filledRectangle(1.5, 2.9, 3, 0.1);
            StdDraw.setPenColor(243, 209, 67);   // yellow
            StdDraw.filledRectangle(1, 2.9, 0.5, 0.1);
            StdDraw.setPenColor(Color.black);
            StdDraw.rectangle(1, 2.9, 0.5, 0.1);
            StdDraw.setFont(arialsmall);
            StdDraw.text(1, 2.9, "Stage Select");
            //boxes
            StdDraw.setPenColor(173, 215, 252); // light blue
            StdDraw.filledRectangle(0.75, 1.5, 0.7, 0.6); // stage selected box
            StdDraw.setPenColor(Color.black);
            StdDraw.rectangle(0.75, 1.5, 0.7, 0.6);
            StdDraw.filledRectangle(2.25, 1.5, 0.72, 1);
            // insert stage pics
            StdDraw.picture(1.89, 2, "quackpond.png", 0.72, 1);
            StdDraw.rectangle(1.89, 2, 0.36, 0.5);
            StdDraw.picture(2.61, 2, "ThePlayground.png", 0.72, 1);
            StdDraw.rectangle(2.61, 2, 0.36, 0.5);
            StdDraw.picture(1.89, 1, "kittycafe.png", 0.72, 1);
            StdDraw.rectangle(1.89, 1, 0.36, 0.5);
            StdDraw.picture(2.61, 1, "sesamest.png", 0.72, 1);
            StdDraw.rectangle(2.61, 1, 0.36, 0.5);

            System.out.println("-+=CHOOSE A BATTLE STAGE=+-\n~Choose a stage by clicking on it~");
            int moveOn2 = 0;
            String stagename = "";
            int stage = 0;
            while (!StdDraw.isMousePressed()) {
            }
            while (moveOn2 == 0) {
                if (StdDraw.mouseX() >= 1.53 && StdDraw.mouseX() <= 2.25 && StdDraw.mouseY() >= 1.5 && StdDraw.mouseY() <= 2.5) { // if click the box
                    StdDraw.picture(0.75, 1.5, "quackpond.png", 1.4, 1.2);
                    stagename = "Duck Pond";
                    stage = 0;
                    moveOn2 = 1;
                } else if (StdDraw.mouseX() >= 2.25 && StdDraw.mouseX() <= 2.97 && StdDraw.mouseY() >= 1.5 && StdDraw.mouseY() <= 2.5) {
                    StdDraw.picture(0.75, 1.5, "ThePlayground.png", 1.4, 1.2);
                    stagename = "The Playground";
                    stage = 1;
                    moveOn2 = 1;
                } else if (StdDraw.mouseX() >= 1.53 && StdDraw.mouseX() <= 2.25 && StdDraw.mouseY() >= 0.5 && StdDraw.mouseY() <= 1.5) {
                    StdDraw.picture(0.75, 1.5, "kittycafe.png", 1.4, 1.2);
                    stagename = "Cafe";
                    stage = 2;
                    moveOn2 = 1;
                } else if (StdDraw.mouseX() >= 2.25 && StdDraw.mouseX() <= 2.97 && StdDraw.mouseY() >= 0.5 && StdDraw.mouseY() <= 1.5) {
                    StdDraw.picture(0.75, 1.5, "sesamest.png", 1.4, 1.2);
                    stagename = "Sesame Street";
                    stage = 3;
                    moveOn2 = 1;
                }
            }

            System.out.println("~Press the Enter key to continue~");
            keyboard.nextLine();

            StdDraw.clear(Color.black);
            StdDraw.setFont(arial);
            StdDraw.setPenColor(Color.white);
            StdDraw.text(1.5, 1.5, "BATTLE BEGIN!");

            System.out.println("-+=READY TO MOVE ON!=+-");
            System.out.println("~Press the Enter key to move on~");
            keyboard.nextLine();

            System.out.println("STAGE: " + stagename);

            System.out.println(player1 + " VS " + cpu + "\nBATTLE BEGIN!\n");

            StdDraw.clear(Color.black);

            if (stage == 0) {
                StdDraw.picture(1.5, 1.5, "quackpond.png", 3, 3);
            } else if (stage == 1) {
                StdDraw.picture(1.5, 1.5, "ThePlayground.png", 3, 3);
            } else if (stage == 2) {
                StdDraw.picture(1.5, 1.5, "kittycafe.png", 3, 3);
            } else if (stage == 3) {
                StdDraw.picture(1.5, 1.5, "sesamest.png", 3, 3);
            }

            if (charplayer1 == 0) {  // draw p1 character
                quack(0.72, 1);
            } else if (charplayer1 == 1) {
                maxbunny(0.72, 1);
            } else if (charplayer1 == 2) {
                kitty(0.72, 1);
            } else if (charplayer1 == 3) {
                cookie(0.72, 1);
            }

            if (characterRandCPU - 1 == 0) {   // draw cpu character
                quack(2.61, 1);
            } else if (characterRandCPU - 1 == 1) {
                maxbunny(2.61, 1);
            } else if (characterRandCPU - 1 == 2) {
                kitty(2.61, 1);
            } else if (characterRandCPU - 1 == 3) {
                cookie(2.61, 1);
            }

            int p1health = 100;
            int cpuhealth = 100;
            int playerdeath = 0;
            while (playerdeath < 1) {
                // play the game
                // PLAYER 1's TURN
                System.out.println("-+=CHOOSE YOUR MOVE=+-");
                // print out moves by referencing move type and calling the moves it has.
                System.out.println(character1.movesList());

                System.out.println("~Choose a move by typing in the corresponding number");
                String moveStr = keyboard.nextLine();
                int move = Integer.parseInt(moveStr) - 1;
                for (int i = 0; i < 3; i++) {
                    if (!(moveStr.equals("1") || moveStr.equals("2") || moveStr.equals("3") || moveStr.equals("4"))) {
                        System.out.println("Please choose a character by entering its number.\nOtherwise, one will be chosen at random.");
                        moveStr = keyboard.nextLine();
                        if (i == 2) { // if user still has not given a valid input, randomly choose a move
                            int randmove = 1 + (int) (Math.random() * 4);
                            if (randmove == 1) {
                                move = 0; // Quack was chosen. Reiterate loop again to move on with this character
                            } else if (randmove == 2) {
                                move = 1;
                            } else if (randmove == 3) {
                                move = 2;
                            } else if (randmove == 4) {
                                move = 3;
                            }
                        }
                    }
                }
                if (!(moveStr.equals("1") || moveStr.equals("2") || moveStr.equals("3") || moveStr.equals("4"))) {
                    System.err.println("Please enter a valid number");
                }
                //basically here i want it to use move as a number, and print the called move.
                System.out.println("MOVE: " + character1.getMove(move));
                //include random chance of whether move hit or missed
                int moveland = 1 + (int) (Math.random() * 2);
                if (moveland == 1) { // move didn't land
                    cpuhealth = cpuhealth - 0;
                    System.out.println("Move missed! 0 damage dealt");
                } else if (moveland == 2) { //move landed
                    System.out.println(character1.moveCriticality(Integer.parseInt(moveStr)));
                    cpuhealth = cpuhealth - character1.moveDamage(Integer.parseInt(moveStr));
                }

                // CPU's TURN
                System.out.println("-+=CPU IS CHOOSING MOVE=+-");
                System.out.println(character2.movesList());
                int moveRandCPU = (int) (Math.random() * 3);
                System.out.println("MOVE: " + character2.getMove(moveRandCPU));
                //include random chance of whether move hit or missed
                moveRandCPU += 1;
                moveland = 1 + (int) (Math.random() * 2);
                if (moveland == 1) { // move didn't land
                    p1health = p1health - 0;
                    System.out.println("Move missed! 0 damage dealt");
                } else if (moveland == 2) {
                    System.out.println(character2.moveCriticality(moveRandCPU));
                    p1health = p1health - character2.moveDamage(moveRandCPU);
                }

                // once a player dies, we end the game
                if (p1health == 0 || cpuhealth == 0) {
                    playerdeath++;
                }
            }
            System.out.println("\n-+=GAME OVER+=-");
            String winner = "";
            String loser = "";
            if (p1health == 0) {
                System.out.println("~CPU WIN~\n~" + name + " LOST~");
                winner = "CPU";
                loser = name;
            } else {
                System.out.println("~" + name + " WIN~\n~CPU LOST~");
                winner = name;
                loser = "CPU";
            }
            // once game ends, change screen

            StdDraw.clear(Color.black);
            StdDraw.setPenColor(Color.white);
            StdDraw.text(0.75, 2, "WINNER:");
            StdDraw.text(2.25, 2, "LOSER:");
            StdDraw.text(0.75, 1.4, winner);
            StdDraw.text(2.25, 1.4, loser);
            System.out.println("-+=PRESS ENTER TO CONTINUE=+-");
            keyboard.nextLine();
        }
    }
    public static void quack(double x, double y){   // receive param of placement of character
        StdDraw.picture(x, y, "quack.png", 0.35, 0.65);
        //        StdDraw.setPenColor(68,53,223);
//        StdDraw.setPenRadius(0.01);
//        StdDraw.filledEllipse(x, y,0.2,0.45); // duck body
//        StdDraw.setPenColor(Color.black); // beak
//        StdDraw.line(x+0.05,y+0.2,x+0.26,y+0.2);
    }
    public static void maxbunny(double x, double y){
        StdDraw.picture(x, y, "max.png", 0.35, 0.65);
//        StdDraw.setPenColor(53,140,223); // overalls blue
//        StdDraw.filledRectangle(x,y-0.27,0.13,0.13); // bunny overalls
//        StdDraw.setPenColor(Color.white);
//        StdDraw.filledEllipse(x, y,0.2,0.25); // bunny head
//        StdDraw.filledEllipse(x-0.1, y+0.18, 0.05,0.25); // left bunny ear
//        StdDraw.filledEllipse(x+0.1, y+0.18, 0.05,0.25); // right bunny ear
//        StdDraw.filledRectangle(x,y-0.27,0.07,0.05); // bunny body
    }
    public static void kitty(double x, double y){
        StdDraw.picture(x, y, "kitty.png", 0.46, 0.5);
        //StdDraw.setPenColor(Color.white);
        //.filledEllipse(x,y,0.23,0.23); // kitty head
        //draw ears
        //StdDraw.setPenColor(Color.red);
        //StdDraw.filledRectangle(x+0.18,y+0.15,0.07,0.04); //bow
    }
    public static void cookie(double x, double y){
        StdDraw.setPenColor(Color.blue);
        StdDraw.filledEllipse(x,y,0.25,0.26); // monster head
        StdDraw.setPenColor(Color.white);
        StdDraw.filledCircle(x-0.045,y+0.25,0.06); // left eye
        StdDraw.filledCircle(x+0.045,y+0.25,0.06); // right eye
        StdDraw.setPenColor(Color.black);
        StdDraw.filledCircle(x-0.04,y+0.245,0.02); // left eye pupil
        StdDraw.filledCircle(x+0.035,y+0.275,0.02); // right eye pupil
        StdDraw.filledRectangle(x,y,0.2,0.1); // mouth

    }
    public static void randombox(double x, double y){
        StdDraw.setPenColor(60, 190,229);    // light blue
        StdDraw.filledRectangle(x,y-0.035,0.16,0.19);
        StdDraw.setPenColor(Color.black); // outline box
        StdDraw.rectangle(x, y-0.035,0.16,0.19);
        StdDraw.picture(x,y-0.035,"questionmark.png",0.21,0.26);

    }
    public static void readybar(double x, double y){
        //ready to fight bar
        StdDraw.setPenColor(Color.black);
        StdDraw.filledRectangle(x,y,3,0.2);
        StdDraw.setPenColor(243, 195,43);    // gold
        StdDraw.rectangle(x, y,3,0.2);
        Font font3 = new Font("Arial", Font.BOLD, 60);
        StdDraw.setFont(font3);
        StdDraw.text(x,y-0.04,"READY TO FIGHT!");
    }
    public static void charactercover(double x, double y){
        StdDraw.setPenColor(245,64,64);
        StdDraw.filledRectangle(x,y,0.3,0.45);
    }
    public static void stagecover(double x,double y){
        StdDraw.filledRectangle(x,y,0.7,0.6); // stage selected box
        StdDraw.setPenColor(Color.black);
        StdDraw.rectangle(x,y,0.7,0.6);
    }
}
