public class GameSetting_bitMasking {
    // Define masks for individual settings using left shift (<<)
    static final int MUSIC_ON    = 1 << 0; // 0001
    static final int SFX_ON      = 1 << 1; // 0010
    static final int GORE_ON     = 1 << 2; // 0100
    static final int HARD_MODE   = 1 << 3; // 1000

    public static void main(String[] args) {
        // Player starts with Music and Sound Effects turned on (0011)
        int playerSettings = MUSIC_ON | SFX_ON; 

        // 1. Check if Hard Mode is enabled
        boolean isHard = (playerSettings & HARD_MODE) != 0;
        System.out.println("Is Hard Mode on? " + isHard); // Output: false

        // 2. Turn on Hard Mode dynamically
        playerSettings = playerSettings | HARD_MODE; // Now 1011

        // 3. Check again
        isHard = (playerSettings & HARD_MODE) != 0;
        System.out.println("Is Hard Mode on now? " + isHard); // Output: true
    }
}
