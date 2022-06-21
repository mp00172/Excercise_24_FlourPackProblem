public class FlourPacker {

    public static boolean canPack (int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        double bigCountRemaining = bigCount;
        double smallCountRemaining = smallCount;
        double goalRemaining = goal;
        while (bigCountRemaining >= 1 && goalRemaining >= 5) {
            bigCountRemaining --;
            goalRemaining -= 5;
        }
        while (smallCountRemaining >= 1 && goalRemaining >= 1) {
            smallCountRemaining --;
            goalRemaining --;
        }
        return goalRemaining == 0;
    }
}
