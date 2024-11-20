public class FutureTuition {
    public static void main(String[] args) {
        final double TUITION_GROWTH_RATE = 0.05;
        double currentTuition = 10000;
        double costOfTuition = 0;

        for (int i = 1; i <= 14; i++)
        {
            currentTuition = currentTuition + (currentTuition * TUITION_GROWTH_RATE);

            if (i == 10)
                System.out.println("Tuition in ten years: $" + Math.round(currentTuition));

            if (i > 10)
                costOfTuition = costOfTuition + currentTuition;
        }
        System.out.println("Tuition for a 4-year period after the tenth year: $" + Math.round(costOfTuition));
    }
}