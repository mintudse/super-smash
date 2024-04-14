public class Characters {
    private int character;

    public Characters(int c){
        character = c;
    }

    public String toString(){
        String[] chars = {"Quack", "Max", "Hello Kitty", "Cookie Monster"};
        return chars[character];
    }
    public String getMove(int move){
        String toReturn = "";
        if (character == 0) {
            String[] moves = {"Power of Duck Feet", "Magic Duck Dance", "There's Nothing Like a Duck", "Acorn Stash"};
            toReturn = moves[move];
        } else if (character == 1){
            String[] moves = {"Mud Cake", "Submarine Bash", "Lobster Run", "Apple Rain"};
            toReturn = moves[move];
        } else if (character == 2){
            String[] moves = {"Wisdom", "Help a Friend", "Positivity", "Got it Together"};
            toReturn = moves[move];
        } else if (character == 3){
            String[] moves = {"Cookie Rain", "Cookies!", "Baker", "Ate and Devoured"};
            toReturn = moves[move];
        }
        return toReturn;
    }

    public String movesList(){
        String toReturn = "";
        if (character == 0) {
            toReturn = "1. POWER OF DUCK FEET (water)    2. MAGIC DUCK DANCE (air)" +
                    "\n3. THERE'S NOTHING LIKE A DUCK (normal)  4. ACORN STASH (earth)";
        } else if (character == 1) {
            toReturn = "1. MUD CAKE (earth)   2. SUBMARINE BASH (water)" +
                    "\n3. LOBSTER RUN (water)   4. APPLE RAIN (earth)";
        } else if (character == 2) {
            toReturn = "1. WISDOM (air)   2. HELP A FRIEND (normal)" +
                    "\n3. POSITIVITY (air)   4. GOT IT TOGETHER (normal)";
        } else if (character == 3) {
            toReturn = "1. COOKIE RAIN (air)   2. COOKIES! (earth)" +
                    "\n3. BAKER (earth)   4. ATE AND DEVOURED (normal)";
        }
        return toReturn;
    }

    public String moveCriticality(int movenum){
        String toReturn = "";
        if (movenum != 4){
            toReturn = "That did -10 damage!";
        }
        else {
            toReturn = "Critical Hit! That did -20 damage!";
        }
        return toReturn;
    }

    public int moveDamage(int movenum){
        int damage = 0;
        if (movenum != 4){
            damage = 10;
        }
        else {
            damage = 20;
        }
        return damage;
    }
}
