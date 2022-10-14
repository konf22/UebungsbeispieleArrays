public class UmsatzDemo {

    public static void main(String[] args) {
        double[] umsaetze = {1.5, 4, 20, 3, 3, 837.23, 77, 88.88, 1928, 12, 20, 958};
        int umsatzsteigerungenGT10 = getUmsatzsteigerungGT10(umsaetze);
        System.out.println("umsatzsteigerungenGT10 = " + umsatzsteigerungenGT10);
        System.out.println();

        double[][] tagesUmsaetzeProWoche = {
                {11, 12, 13, 14, 15}, //1. Woche
                {21, 22, 23, 24, 25}, //2. Woche
                {31, 32, 33, 34, 35}, //3. Woche
                {41, 42, 43, 44, 45}  //4. Woche
        };

        double[] umsaetzeProWoche = calculateSumByWeek(tagesUmsaetzeProWoche);
        for (int i = 0; i < umsaetzeProWoche.length; i++) {
            System.out.println("umsatz in Woche " + (i + 1) + " = " + umsaetzeProWoche[i]);
        }
    }

    public static int getUmsatzsteigerungGT10(double[] umsaetze) {
        int count = 0;
        for (int i = 0; i < umsaetze.length - 1; i++) {

            double vormonat = umsaetze[i];
            double monat = umsaetze[i + 1];

            if (monat > vormonat) {
                if ((monat - vormonat) / vormonat * 100 >= 10) {
                    count++;
                }
            }
        }
        return count;
    }

    public static double[] calculateSumByWeek(double[][] umsaetze) {
        double[] wochenUmsaetze = new double[umsaetze.length];
        for (int i = 0; i < umsaetze.length; i++) {
            double[] umsaetzeProWoche = umsaetze[i];
            for (int j = 0; j < umsaetzeProWoche.length; j++) {
                double tagesUmsatz = umsaetzeProWoche[j];
                wochenUmsaetze[i] += tagesUmsatz;
            }
        }
        return wochenUmsaetze;
    }

}
