package ru.netology.stats;

public class StatsService {
    //1. Вычисляет сумму по всем продажам
    public float sumAllSales(float[] sellings) {
        float sum = 0;
        for (float selling : sellings) {
            sum += selling;
        }
        return sum;
    }

    //2. Вычислет среднюю сумму продаж
    public float meanSalesAmount(float[] sellings) {
        float sum = 0;
        for (float selling : sellings) {
            sum += selling;
        }
        return sum / 12;
    }

    //3. Поиск номера месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)
    public int monthNumberSalesMax(float[] sellings) {
        int maxMonth = 0;
        int month = 0;
        for (float selling : sellings) {
            if (selling >= sellings[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    //4. Поиск номер месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму)
    public int monthNumberSalesMin(float[] sellings) {
        int minMonth = 0;
        int month = 0;
        for (float selling : sellings) {
            if (selling <= sellings[minMonth]) {
                minMonth = month;
            }
            month++;
        }
        return minMonth + 1;
    }

    //5. Вычисляет кол-во месяцев, в которых продажи были ниже среднего
    public int numberMonthsBelowAverageSales(float[] sellings) {
        float sum = 0;
        int countMonth = 0;
        for (float selling : sellings) {
            sum += selling;
        }
        float average = sum / 12;
        for (float selling : sellings) {
            if (selling < average) {
                countMonth++;
            }
        }
        return countMonth;
    }

    //6. Вычисляет кол-во месяцев, в которых продажи были выше среднего
    public int numberMonthsAboveAverageSales(float[] sellings) {
        float sum = 0;
        int countMonth = 0;
        for (float selling : sellings) {
            sum += selling;
        }
        float average = sum / 12;
        for (float selling : sellings) {
            if (selling > average) {
                countMonth ++;
            }
        }
        return countMonth;
    }
}
