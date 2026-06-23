public class ForecastTest {


    public static void main(String[] args) {


        double initialAmount = 10000;

        double growthRate = 0.10;

        int years = 5;



        double futureValue =
        Forecast.calculateFutureValue(
                initialAmount,
                growthRate,
                years
        );



        System.out.println(
            "Future Value after "
            + years
            + " years: "
            + futureValue
        );

    }

}
