class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
Calendar c1 = Calendar.getInstance();
    c1.set(year,month-1,day);
    return c1.getDisplayName(Calendar.DAY_OF_WEEK,Calendar.LONG,Locale.US).toUpperCase();

    }

}

